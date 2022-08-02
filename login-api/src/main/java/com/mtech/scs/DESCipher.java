package com.mtech.scs;

public class DESCipher {

	static final byte[] mLeftShifts = new byte[] { 1, 1, 2, 2, 2, 2, 2, 2, 1,
			2, 2, 2, 2, 2, 2, 1 };

	// Initialize the permutation IP
	static final byte[] vIP = new byte[] { 58, 50, 42, 34, 26, 18, 10, 2, 60,
			52, 44, 36, 28, 20, 12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64, 56,
			48, 40, 32, 24, 16, 8, 57, 49, 41, 33, 25, 17, 9, 1, 59, 51, 43,
			35, 27, 19, 11, 3, 61, 53, 45, 37, 29, 21, 13, 5, 63, 55, 47, 39,
			31, 23, 15, 7 };

	// Initialize the expansion function E
	static final byte[] vE = new byte[] { 32, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9,
			8, 9, 10, 11, 12, 13, 12, 13, 14, 15, 16, 17, 16, 17, 18, 19, 20,
			21, 20, 21, 22, 23, 24, 25, 24, 25, 26, 27, 28, 29, 28, 29, 30, 31,
			32, 1 };

	// Initialize the PC1 function
	static final byte[] vPC1 = new byte[] { 57, 49, 41, 33, 25, 17, 9, 1, 58,
			50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52,
			44, 36, 63, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14,
			6, 61, 53, 45, 37, 29, 21, 13, 5, 28, 20, 12, 4 };

	// Initialize the PC2 function
	static final byte[] vPC2 = new byte[] { 14, 17, 11, 24, 1, 5, 3, 28, 15, 6,
			21, 10, 23, 19, 12, 4, 26, 8, 16, 7, 27, 20, 13, 2, 41, 52, 31, 37,
			47, 55, 30, 40, 51, 45, 33, 48, 44, 49, 39, 56, 34, 53, 46, 42, 50,
			36, 29, 32 };

	// Initialize permutation P
	static final byte[] vP = new byte[] { 16, 7, 20, 21, 29, 12, 28, 17, 1, 15,
			23, 26, 5, 18, 31, 10, 2, 8, 24, 14, 32, 27, 3, 9, 19, 13, 30, 6,
			22, 11, 4, 25 };

	// Initialize the inverted IP
	static final byte[] vIPInv = new byte[] { 40, 8, 48, 16, 56, 24, 64, 32,
			39, 7, 47, 15, 55, 23, 63, 31, 38, 6, 46, 14, 54, 22, 62, 30, 37,
			5, 45, 13, 53, 21, 61, 29, 36, 4, 44, 12, 52, 20, 60, 28, 35, 3,
			43, 11, 51, 19, 59, 27, 34, 2, 42, 10, 50, 18, 58, 26, 33, 1, 41,
			9, 49, 17, 57, 25 };

	static final byte[][] vSbox = new byte[][] {
			{ 14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7, 0, 15, 7,
					4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8, 4, 1, 14, 8,
					13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0, 15, 12, 8, 2, 4,
					9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13 },
			{ 15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10, 3, 13, 4,
					7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5, 0, 14, 7, 11,
					10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15, 13, 8, 10, 1, 3,
					15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9 },
			{ 10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8, 13, 7, 0,
					9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1, 13, 6, 4, 9, 8,
					15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7, 1, 10, 13, 0, 6, 9,
					8, 7, 4, 15, 14, 3, 11, 5, 2, 12 },
			{ 7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15, 13, 8, 11,
					5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9, 10, 6, 9, 0, 12,
					11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4, 3, 15, 0, 6, 10, 1,
					13, 8, 9, 4, 5, 11, 12, 7, 2, 14 },
			{ 2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9, 14, 11, 2,
					12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6, 4, 2, 1, 11, 10,
					13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14, 11, 8, 12, 7, 1, 14,
					2, 13, 6, 15, 0, 9, 10, 4, 5, 3 },
			{ 12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11, 10, 15, 4,
					2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8, 9, 14, 15, 5, 2,
					8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6, 4, 3, 2, 12, 9, 5, 15,
					10, 11, 14, 1, 7, 6, 0, 8, 13 },
			{ 4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1, 13, 0, 11,
					7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6, 1, 4, 11, 13,
					12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2, 6, 11, 13, 8, 1, 4,
					10, 7, 9, 5, 0, 15, 14, 2, 3, 12 },
			{ 13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7, 1, 15, 13,
					8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2, 7, 11, 4, 1, 9,
					12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8, 2, 1, 14, 7, 4, 10,
					8, 13, 15, 12, 9, 0, 3, 5, 6, 11 } };

	static final String[] scratchHexa = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
	static final String defaultScratchHexaValue = "16";
	
	String mKeyValue;
	byte[][] mKey;
	byte[][][][][][][][] msBox;
	byte[] mIPInv;
	byte[] mE;
	byte[] mP;
	byte[] mIP;
	byte[] mPC1;
	byte[] mPC2;

	public DESCipher(String key) {

		// Create the inverted IP
		mIPInv = initializeByteArray(vIPInv);

		// Create the expansion array
		mE = initializeByteArray(vE);

		// Create P
		mP = initializeByteArray(vP);

		// Create the permutation IP
		mIP = initializeByteArray(vIP);

		// Create the PC1 function
		mPC1 = initializeByteArray(vPC1);

		// Create the PC2 function
		mPC2 = initializeByteArray(vPC2);

		msBox = initializeMsBox();

		mKeyValue = key;
		mKey = initializeKey();
	}

	private byte[] initializeByteArray(byte[] byteArrayFrom) {

		byte[] arrayToReturn = new byte[byteArrayFrom.length];

		for (int i = 0; i < byteArrayFrom.length; i++) {
			arrayToReturn[i] = (byte) (byteArrayFrom[i] - 1);
		}

		return arrayToReturn;
	}

	private byte[][][][][][][][] initializeMsBox() {

		int length = 8;
		int lRow = 0;
		int lColumn = 0;
		byte[][][][][][][][] toReturn = new byte[length][2][2][2][2][2][2][4];
		byte theByte = 0;
		byte[] theBin = new byte[length];

		// Create an optimized version of the s-boxes
		// this is not in the standard but much faster
		// than calculating the Row/Column index later

		for (int lBox = 0; lBox < length; lBox++) {
			for (int a = 0; a <= 1; a++) {
				for (int b = 0; b <= 1; b++) {
					for (int c = 0; c <= 1; c++) {
						for (int d = 0; d <= 1; d++) {
							for (int e = 0; e <= 1; e++) {
								for (int f = 0; f <= 1; f++) {

									lRow = a * 2 + f;
									lColumn = b * 8 + c * 4 + d * 2 + e;
									theByte = vSbox[lBox][lRow * 16 + lColumn];

									theBin = byte2Bin(new byte[] { theByte }, 1);
									System.arraycopy(theBin, 4,
											toReturn[lBox][a][b][c][d][e][f],
											0, 4);
								}
							}
						}
					}
				}
			}
		}

		return toReturn;
	}

	private byte[][] initializeKey() {

		byte[] c = new byte[28];
		byte[] d = new byte[28];
		byte[] cd = new byte[56];
		byte[] temp = new byte[2];
		byte[] keySchedule = new byte[64];

		byte[][] mKeyToReturn = new byte[48][16];

		// Convert the key to a binary array
		byte[] keyBin = byte2Bin(mKeyValue.getBytes(),
				(mKeyValue.length() > 8) ? 8 : mKeyValue.length());

		// Apply the PC-2 permutation
		for (int i = 0; i < 56; i++) {
			keySchedule[i] = keyBin[mPC1[i]];
		}

		// Split keyschedule into two halves, C[] and D[]
		System.arraycopy(keySchedule, 0, c, 0, 28);
		System.arraycopy(keySchedule, 28, d, 0, 28);

		// Calculate the key schedule (16 subkeys)
		for (int i = 0; i < 16; i++) {
			// Perform one or two cyclic left shifts on
			// both C[i-1] and D[i-1] to get C[i] and D[i]
			System.arraycopy(c, 0, temp, 0, mLeftShifts[i]);
			System.arraycopy(c, mLeftShifts[i], c, 0, 28 - mLeftShifts[i]);
			System.arraycopy(temp, 0, c, 28 - mLeftShifts[i], mLeftShifts[i]);
			System.arraycopy(d, 0, temp, 0, mLeftShifts[i]);
			System.arraycopy(d, mLeftShifts[i], d, 0, 28 - mLeftShifts[i]);
			System.arraycopy(temp, 0, d, 28 - mLeftShifts[i], mLeftShifts[i]);

			// Concatenate C[] and D[]
			System.arraycopy(c, 0, cd, 0, 28);
			System.arraycopy(d, 0, cd, 28, 28);

			// Apply the PC-2 permutation and store
			// the calculated subkey
			for (int j = 0; j < 48; j++) {
				mKeyToReturn[j][i] = cd[mPC2[j]];
			}
		}

		return mKeyToReturn;
	}

	public String encryptString(String text) {

		byte[] byteArray = text.toUpperCase().getBytes();

		byte[] encryptedByteArray = encryptByte(byteArray);
		String encryptedString = Utils.hexEncode(encryptedByteArray);

		return encryptedString.toUpperCase();
	}

	public String decryptString(String text) {

		byte[] byteArray = Utils.hexDecode(text);
		byteArray = decryptByte(byteArray);

		return new String(byteArray);
	}

	private byte[] decryptByte(byte[] byteArray) {

		int xor = 0;
		byte[] currBlock = new byte[8];
		byte[] cipherBlock = new byte[8];
		byte[] dencryptedByte = new byte[byteArray.length];
		System.arraycopy(byteArray, 0, dencryptedByte, 0, byteArray.length);

		// Decrypt the data in 64-bit blocks
		for (int i = 0; i < dencryptedByte.length; i += 8) {
			// Get the next block of ciphertext
			System.arraycopy(dencryptedByte, i, currBlock, 0, 8);

			// Decrypt the block
			currBlock = encryptDecryptBlock(currBlock, false);

			// XOR with the previous cipherblock
			for (int j = 0; j < 8; j++) {
				xor = (0xff & currBlock[j]) ^ cipherBlock[j];
				// convert back to byte
				currBlock[j] = (byte) xor;
			}

			// Store the current ciphertext to use XOR with the next block
			// plaintext
			System.arraycopy(dencryptedByte, i, cipherBlock, 0, 8);

			// Store the block
			System.arraycopy(currBlock, 0, dencryptedByte, i, 8);
		}

		return dencryptedByte;
	}

	public byte[] encryptByte(byte[] byteArray) {

		int xor = 0;
		byte[] currBlock = new byte[8];
		byte[] cipherBlock = new byte[8];
		byte[] encryptedByte = new byte[byteArray.length];
		System.arraycopy(byteArray, 0, encryptedByte, 0, byteArray.length);

		// Encrypt the data in 64-bit blocks
		for (int i = 0; i < encryptedByte.length; i += 8) {

			// Get the next block of plaintext
			System.arraycopy(encryptedByte, i, currBlock, 0, 8);

			// XOR the plaintext with the previous ciphertext (CBC,
			// Cipher-Block Chaining)
			for (int j = 0; j < 8; j++) {
				xor = (0xff & currBlock[j]) ^ cipherBlock[j];
				// convert back to byte
				currBlock[j] = (byte) xor;
			}

			// Encrypt the block
			currBlock = encryptDecryptBlock(currBlock, true);

			// Store the block
			System.arraycopy(currBlock, 0, encryptedByte, i, 8);

			// Store the cipherblock (for CBC)
			System.arraycopy(currBlock, 0, cipherBlock, 0, 8);
		}
		return encryptedByte;
	}

	private byte[] createERxorK(byte[] R, int i) {

		byte[] eRxorK = new byte[48];

		eRxorK[0] = (byte) ((int) R[31] ^ (int) mKey[0][i]);
		eRxorK[1] = (byte) (((int) R[0] ^ (int) mKey[1][i]));
		eRxorK[2] = (byte) (((int) R[1] ^ (int) mKey[2][i]));
		eRxorK[3] = (byte) (((int) R[2] ^ (int) mKey[3][i]));
		eRxorK[4] = (byte) (((int) R[3] ^ (int) mKey[4][i]));
		eRxorK[5] = (byte) (((int) R[4] ^ (int) mKey[5][i]));
		eRxorK[6] = (byte) (((int) R[3] ^ (int) mKey[6][i]));
		eRxorK[7] = (byte) (((int) R[4] ^ (int) mKey[7][i]));
		eRxorK[8] = (byte) (((int) R[5] ^ (int) mKey[8][i]));
		eRxorK[9] = (byte) (((int) R[6] ^ (int) mKey[9][i]));
		eRxorK[10] = (byte) ((int) R[7] ^ (int) mKey[10][i]);
		eRxorK[11] = (byte) ((int) R[8] ^ (int) mKey[11][i]);
		eRxorK[12] = (byte) ((int) R[7] ^ (int) mKey[12][i]);
		eRxorK[13] = (byte) ((int) R[8] ^ (int) mKey[13][i]);
		eRxorK[14] = (byte) ((int) R[9] ^ (int) mKey[14][i]);
		eRxorK[15] = (byte) ((int) R[10] ^ (int) mKey[15][i]);
		eRxorK[16] = (byte) ((int) R[11] ^ (int) mKey[16][i]);
		eRxorK[17] = (byte) ((int) R[12] ^ (int) mKey[17][i]);
		eRxorK[18] = (byte) ((int) R[11] ^ (int) mKey[18][i]);
		eRxorK[19] = (byte) ((int) R[12] ^ (int) mKey[19][i]);
		eRxorK[20] = (byte) ((int) R[13] ^ (int) mKey[20][i]);
		eRxorK[21] = (byte) ((int) R[14] ^ (int) mKey[21][i]);
		eRxorK[22] = (byte) ((int) R[15] ^ (int) mKey[22][i]);
		eRxorK[23] = (byte) ((int) R[16] ^ (int) mKey[23][i]);
		eRxorK[24] = (byte) ((int) R[15] ^ (int) mKey[24][i]);
		eRxorK[25] = (byte) ((int) R[16] ^ (int) mKey[25][i]);
		eRxorK[26] = (byte) ((int) R[17] ^ (int) mKey[26][i]);
		eRxorK[27] = (byte) ((int) R[18] ^ (int) mKey[27][i]);
		eRxorK[28] = (byte) ((int) R[19] ^ (int) mKey[28][i]);
		eRxorK[29] = (byte) ((int) R[20] ^ (int) mKey[29][i]);
		eRxorK[30] = (byte) ((int) R[19] ^ (int) mKey[30][i]);
		eRxorK[31] = (byte) ((int) R[20] ^ (int) mKey[31][i]);
		eRxorK[32] = (byte) ((int) R[21] ^ (int) mKey[32][i]);
		eRxorK[33] = (byte) ((int) R[22] ^ (int) mKey[33][i]);
		eRxorK[34] = (byte) ((int) R[23] ^ (int) mKey[34][i]);
		eRxorK[35] = (byte) ((int) R[24] ^ (int) mKey[35][i]);
		eRxorK[36] = (byte) ((int) R[23] ^ (int) mKey[36][i]);
		eRxorK[37] = (byte) ((int) R[24] ^ (int) mKey[37][i]);
		eRxorK[38] = (byte) ((int) R[25] ^ (int) mKey[38][i]);
		eRxorK[39] = (byte) ((int) R[26] ^ (int) mKey[39][i]);
		eRxorK[40] = (byte) ((int) R[27] ^ (int) mKey[40][i]);
		eRxorK[41] = (byte) ((int) R[28] ^ (int) mKey[41][i]);
		eRxorK[42] = (byte) ((int) R[27] ^ (int) mKey[42][i]);
		eRxorK[43] = (byte) ((int) R[28] ^ (int) mKey[43][i]);
		eRxorK[44] = (byte) ((int) R[29] ^ (int) mKey[44][i]);
		eRxorK[45] = (byte) ((int) R[30] ^ (int) mKey[45][i]);
		eRxorK[46] = (byte) ((int) R[31] ^ (int) mKey[46][i]);
		eRxorK[47] = (byte) ((int) R[0] ^ (int) mKey[47][i]);

		return eRxorK;
	}

	private byte[] createSBox(byte[] eRxorK) {
		byte[] sBox = new byte[32];
		// Apply the s-boxes
		System.arraycopy(
				msBox[0][eRxorK[0]][eRxorK[1]][eRxorK[2]][eRxorK[3]][eRxorK[4]][eRxorK[5]],
				0, sBox, 0, 4);
		System.arraycopy(
				msBox[1][eRxorK[6]][eRxorK[7]][eRxorK[8]][eRxorK[9]][eRxorK[10]][eRxorK[11]],
				0, sBox, 4, 4);
		System.arraycopy(
				msBox[2][eRxorK[12]][eRxorK[13]][eRxorK[14]][eRxorK[15]][eRxorK[16]][eRxorK[17]],
				0, sBox, 8, 4);
		System.arraycopy(
				msBox[3][eRxorK[18]][eRxorK[19]][eRxorK[20]][eRxorK[21]][eRxorK[22]][eRxorK[23]],
				0, sBox, 12, 4);
		System.arraycopy(
				msBox[4][eRxorK[24]][eRxorK[25]][eRxorK[26]][eRxorK[27]][eRxorK[28]][eRxorK[29]],
				0, sBox, 16, 4);
		System.arraycopy(
				msBox[5][eRxorK[30]][eRxorK[31]][eRxorK[32]][eRxorK[33]][eRxorK[34]][eRxorK[35]],
				0, sBox, 20, 4);
		System.arraycopy(
				msBox[6][eRxorK[36]][eRxorK[37]][eRxorK[38]][eRxorK[39]][eRxorK[40]][eRxorK[41]],
				0, sBox, 24, 4);
		System.arraycopy(
				msBox[7][eRxorK[42]][eRxorK[43]][eRxorK[44]][eRxorK[45]][eRxorK[46]][eRxorK[47]],
				0, sBox, 28, 4);
		return sBox;
	}

	private byte[] createLiRi(byte[] L, byte[] sBox) {
		byte[] liRi = new byte[32];

		// L[i] xor P(R[i])
		liRi[0] = (byte) ((int) L[0] ^ (int) sBox[15]);
		liRi[1] = (byte) ((int) L[1] ^ (int) sBox[6]);
		liRi[2] = (byte) ((int) L[2] ^ (int) sBox[19]);
		liRi[3] = (byte) ((int) L[3] ^ (int) sBox[20]);
		liRi[4] = (byte) ((int) L[4] ^ (int) sBox[28]);
		liRi[5] = (byte) ((int) L[5] ^ (int) sBox[11]);
		liRi[6] = (byte) ((int) L[6] ^ (int) sBox[27]);
		liRi[7] = (byte) ((int) L[7] ^ (int) sBox[16]);
		liRi[8] = (byte) ((int) L[8] ^ (int) sBox[0]);
		liRi[9] = (byte) ((int) L[9] ^ (int) sBox[14]);
		liRi[10] = (byte) ((int) L[10] ^ (int) sBox[22]);
		liRi[11] = (byte) ((int) L[11] ^ (int) sBox[25]);
		liRi[12] = (byte) ((int) L[12] ^ (int) sBox[4]);
		liRi[13] = (byte) ((int) L[13] ^ (int) sBox[17]);
		liRi[14] = (byte) ((int) L[14] ^ (int) sBox[30]);
		liRi[15] = (byte) ((int) L[15] ^ (int) sBox[9]);
		liRi[16] = (byte) ((int) L[16] ^ (int) sBox[1]);
		liRi[17] = (byte) ((int) L[17] ^ (int) sBox[7]);
		liRi[18] = (byte) ((int) L[18] ^ (int) sBox[23]);
		liRi[19] = (byte) ((int) L[19] ^ (int) sBox[13]);
		liRi[20] = (byte) ((int) L[20] ^ (int) sBox[31]);
		liRi[21] = (byte) ((int) L[21] ^ (int) sBox[26]);
		liRi[22] = (byte) ((int) L[22] ^ (int) sBox[2]);
		liRi[23] = (byte) ((int) L[23] ^ (int) sBox[8]);
		liRi[24] = (byte) ((int) L[24] ^ (int) sBox[18]);
		liRi[25] = (byte) ((int) L[25] ^ (int) sBox[12]);
		liRi[26] = (byte) ((int) L[26] ^ (int) sBox[29]);
		liRi[27] = (byte) ((int) L[27] ^ (int) sBox[5]);
		liRi[28] = (byte) ((int) L[28] ^ (int) sBox[21]);
		liRi[29] = (byte) ((int) L[29] ^ (int) sBox[10]);
		liRi[30] = (byte) ((int) L[30] ^ (int) sBox[3]);
		liRi[31] = (byte) ((int) L[31] ^ (int) sBox[24]);

		return liRi;
	}

	private byte[] encryptDecryptBlock(byte[] blockData, boolean encrypt) {

		byte[] L = new byte[32];
		byte[] R = new byte[32];
		byte[] RL = new byte[64];
		byte[] liRi = null;
		byte[] sBox = null;
		byte[] eRxorK = null;

		// Convert the block into a binary array (I do believe this is the best
		// solution in VB for the DES algorithm, but it is still slow as xxxx)
		byte[] binBlock = byte2Bin(blockData, 8);

		// Apply the IP permutation and split the block into two halves,
		// L[] and R[]
		for (int i = 0; i < L.length; i++) {
			L[i] = binBlock[mIP[i]];
			R[i] = binBlock[mIP[i + 32]];
		}

		for (int i = (encrypt) ? 0 : 15; (encrypt) ? i < 16 : i >= 0; i = (encrypt) ? i + 1
				: i - 1) {
			eRxorK = createERxorK(R, i);
			sBox = createSBox(eRxorK);
			liRi = createLiRi(L, sBox);

			// Prepare for next round
			System.arraycopy(R, 0, L, 0, 32);
			System.arraycopy(liRi, 0, R, 0, 32);
		}

		// Concatenate R[]L[]
		System.arraycopy(R, 0, RL, 0, 32);
		System.arraycopy(L, 0, RL, 32, 32);

		// Apply the invIP permutation
		for (int a = 0; a < 64; a++) {
			binBlock[a] = RL[mIPInv[a]];
		}

		// Convert the binaries into a byte array
		binBlock = bin2Byte(binBlock);
		return binBlock;
	}

	private byte[] byte2Bin(byte[] byteArray, int byteLength) {

		byte[] binaryArray = new byte[byteLength * 8];

		int binLength = 0;
		int byteValue = 0;

		// Add binary 1's where needed
		for (int i = 0; i < byteLength; i++) {
			byteValue = (0xff & byteArray[i]);

			if ((byteValue & 128) > 0) {
				binaryArray[binLength] = 1;
			}
			if ((byteValue & 64) > 0) {
				binaryArray[binLength + 1] = 1;
			}
			if ((byteValue & 32) > 0) {
				binaryArray[binLength + 2] = 1;
			}
			if ((byteValue & 16) > 0) {
				binaryArray[binLength + 3] = 1;
			}
			if ((byteValue & 8) > 0) {
				binaryArray[binLength + 4] = 1;
			}
			if ((byteValue & 4) > 0) {
				binaryArray[binLength + 5] = 1;
			}
			if ((byteValue & 2) > 0) {
				binaryArray[binLength + 6] = 1;
			}
			if ((byteValue & 1) > 0) {
				binaryArray[binLength + 7] = 1;
			}
			binLength = binLength + 8;
		}
		return binaryArray;
	}

	private byte[] bin2Byte(byte[] binaryArray) {

		byte[] byteArray = new byte[8];
		int binLength = 0;
		int byteValue = 0;

		// Calculate byte values
		for (int i = 0; i < 8; i++) {
			byteValue = 0;
			if (binaryArray[binLength] == 1) {
				byteValue = byteValue + 128;
			}

			if (binaryArray[binLength + 1] == 1) {
				byteValue = byteValue + 64;
			}

			if (binaryArray[binLength + 2] == 1) {
				byteValue = byteValue + 32;
			}

			if (binaryArray[binLength + 3] == 1) {
				byteValue = byteValue + 16;
			}

			if (binaryArray[binLength + 4] == 1) {
				byteValue = byteValue + 8;
			}

			if (binaryArray[binLength + 5] == 1) {
				byteValue = byteValue + 4;
			}

			if (binaryArray[binLength + 6] == 1) {
				byteValue = byteValue + 2;
			}

			if (binaryArray[binLength + 7] == 1) {
				byteValue = byteValue + 1;
			}

			byteArray[i] = (byte) byteValue;
			binLength = binLength + 8;
		}

		return byteArray;
	}
}
