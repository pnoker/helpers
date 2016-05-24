package com.noker.helpers.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/*����У�鹤����*/
public class SignUtil {
	private static String token = "weixinCourse";

	public static boolean checkSignature(String signature, String timestamp, String nonce) {
		String[] paramArr = new String[] { token, timestamp, nonce };
		Arrays.sort(paramArr);
		String content = paramArr[0].concat(paramArr[1]).concat(paramArr[2]);
		String ciphertext = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");// ���ַ�������sha-1����
			byte[] digest = md.digest(content.toString().getBytes());
			ciphertext = byteToStr(digest);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ciphertext != null ? ciphertext.equals(signature.toUpperCase()) : false;// ������֮����ַ�����signature���бȽ�
	}

	/* ���ֽ�����תΪʮ�����Ƶ��ַ��� */
	private static String byteToStr(byte[] byteArray) {
		// TODO Auto-generated method stub
		String strDigest = "";
		for (int i = 0; i < byteArray.length; i++) {
			strDigest += byteToHerStr(byteArray[i]);
		}
		return strDigest;
	}

	/* ���ֽ�תΪʮ�����Ƶ��ַ��� */
	private static String byteToHerStr(byte mByte) {
		// TODO Auto-generated method stub
		char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] tempArr = new char[2];
		tempArr[0] = Digit[(mByte >>> 4) & 0X0F];
		tempArr[1] = Digit[mByte & 0X0F];
		String s = new String(tempArr);
		return s;
	}
}
