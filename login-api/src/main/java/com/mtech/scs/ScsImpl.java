package com.mtech.scs;

import java.security.InvalidParameterException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScsImpl implements Scs {

	static final String alphanumericExpression = "[a-zA-Z0-9]+";
	
	// Creo el generador
	@Autowired
	KeyProvider keyProvider;

	public String encrypt(String userId, String password) {
	
		boolean isAlphaNumUser = userId.matches(alphanumericExpression);
		boolean isAlphaPass = password.matches(alphanumericExpression);

		if (isAlphaNumUser && isAlphaPass) {

			User user = new User(userId, password);
			String encryptedUser = encrypt(user);
			
			return encryptedUser;
		} else {
			throw new InvalidParameterException("La cadena enviada es inv�lida");
		}
	}

	public String encrypt(User user) {

		// Obtengo la llave
		ScsKey scsKey = keyProvider.getEncryptionKey();
		// Creo el encriptador y le seteo la llave
		ScsDESCipher dCipher = new ScsDESCipher(scsKey);
		// Creo el codificador
		Scrambler scram = new Scrambler();
		// Codifico el usuario
		String scramblerUser = scram.scrambler(user);
		// Encripto el usuario
		String toReturn = dCipher.encrypt(scramblerUser);

		return toReturn;
	}

	@Override
	public String encryptScratchCard(String col1, String row1, String value1, String col2, String row2, String value2){
		
		ScsHSCipher hsCipher = new ScsHSCipher();
		
		//Sacando los ceros a la izquierda de la fila
		String row1WithoutPadding = row1.replaceFirst("^0+(?!$)", "");
		String row2WithoutPadding = row2.replaceFirst("^0+(?!$)", "");
		
		//Completando con cero hasta 4 posiciones
		String value1Padding = String.format("%4s", value1).replace(' ', '0');
		String value2Padding = String.format("%4s", value2).replace(' ', '0');
		
		String result = hsCipher.encryptScratchCard(col1 + row1WithoutPadding + value1Padding, col2 + row2WithoutPadding + value2Padding);
		return result;
		
	}

	@Override
	public String encryptVirtualTokenSentitiveData(String documentType, String documentNumber, String pin) {
		
		String encryptedResult = "";
		
		if(StringUtils.isNotEmpty(documentType) && StringUtils.isNotEmpty(documentNumber) && StringUtils.isNotEmpty(pin)){
			ScsHSCipher hsCipher = new ScsHSCipher();
			
			String documentSubstring = documentNumber.substring(0, documentNumber.length() - 1);
			
			//Concatenamos tipo y numero de documento
			String firstExpressionPadding = documentType + documentSubstring;
			//Completamos con 0 a la izquierda hasta llegar a 16 posiciones
			firstExpressionPadding = String.format("%16s", firstExpressionPadding).replace(' ', '0');
			
			//Garantizando que tenga al menos dos posiciones
			String paddingPinLength = (pin.length() < 10) ? String.format("%2s", pin.length()).replace(' ', '0') : String.valueOf(pin.length());
			//Concatenamos longitud del pass con el pass
			String secondExpressionPadding = paddingPinLength + pin;
			secondExpressionPadding = String.format("%-16s", secondExpressionPadding ).replace(' ', 'F');
			
			encryptedResult = hsCipher.encryptVirtualTokenSentitiveData(firstExpressionPadding, secondExpressionPadding, keyProvider.getVTPrismaEncryptionKey());
			encryptedResult = encryptedResult.toUpperCase().trim();
		}
		return encryptedResult;
	}

	/*public static void main(String [] args){
		ScsImpl scs = new ScsImpl();
		String result = scs.encryptVirtualTokenSentitiveData("1", "12345678", "112233");
		
		System.out.println(result);
	}*/
}
