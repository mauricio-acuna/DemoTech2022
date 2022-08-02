package com.mtech.scs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scrambler {

	static final int userLength = 35;
	static final int passwordLength = 8;
	static final int chainLenght = 50;
	static final int blockSize = 5;

	static final List<String> firstList = new ArrayList<String>(Arrays.asList(
			"A", "E", "I", "M", "Q", "U", "Y"));
	static final List<String> secondList = new ArrayList<String>(Arrays.asList(
			"B", "F", "J", "N", "R", "V", "Z"));
	static final List<String> thirdList = new ArrayList<String>(Arrays.asList(
			"C", "G", "K", "O", "S", "W"));
	static final List<String> fourthList = new ArrayList<String>(Arrays.asList(
			"D", "H", "L", "P", "T", "X"));

	public String scrambler(User user) {

		int initialPos = 0;
		String tmpScr = "";
		String tmp = padd(user);

		for (int i = 0; i < chainLenght / blockSize; i++) {
			initialPos = blockSize * i;
			tmpScr += substitution(tmp.substring(initialPos, initialPos + blockSize));
		}

		String toReturn = tmpScr;
		return toReturn;
	}

	private String padd(User user) {

		// Se queda con el valor m�s corto
		int muserIdLenght = (user.getUserId().length() > userLength) ? userLength
				: user.getUserId().length();
		int muserPassLenght = (user.getPassword().length() > passwordLength) ? passwordLength
				: user.getPassword().length();

		String tempUserId = user.getUserId()
				+ Utils.generateRandomString(true, userLength - muserIdLenght);
		String tempUserPass = user.getPassword()
				+ Utils.generateRandomString(true, passwordLength - muserPassLenght);

		String toReturn = tempUserId
				+ tempUserPass
				+ String.format("%02d", muserIdLenght)
				+ String.format("%02d", muserPassLenght)
				+ Utils.generateRandomString(true, chainLenght - userLength
						- passwordLength - 4);

		return toReturn;
	}

	private String getDataScram(int[] substitutionPositions, String sourceData) {

		String resultString = Utils.generateRandomString(true, 8);
		String firstPart = "";
		String substitutionString = "";
		String secondPart = "";

		for (int i = 0; i < substitutionPositions.length; i++) {
			firstPart = resultString.substring(0, substitutionPositions[i]);
			substitutionString = sourceData.substring(i, i + 1);
			secondPart = resultString.substring(substitutionPositions[i] + 1);

			resultString = firstPart + substitutionString + secondPart;
		}

		return resultString;
	}

	private String substitution(String data) {

		String algSubs = Utils.generateRandomString(false, 1);
		String dataScram = "";
		int[] substitutionPositions = null;

		if (firstList.contains(algSubs)) {
			substitutionPositions = new int[] { 7, 3, 0, 1, 4 };
		} else {
			if (secondList.contains(algSubs)) {
				substitutionPositions = new int[] { 3, 7, 6, 5, 1 };
			} else {
				if (thirdList.contains(algSubs)) {
					substitutionPositions = new int[] { 4, 0, 3, 6, 5 };
				} else {
					if (fourthList.contains(algSubs)) {
						substitutionPositions = new int[] { 5, 1, 4, 0, 6 };
					}
				}
			}
		}

		if (substitutionPositions != null) {
			dataScram = getDataScram(substitutionPositions, data);
		}
		else{
			dataScram = Utils.generateRandomString(true, 8);
		}
		
		dataScram = algSubs + dataScram;
		return dataScram;
	}
}
