package com.noker.helpers.message.model;

public class Token {
	private String accessToken;// �ӿڷ���ƾ֤
	private int expiresIn;// ƾ֤��Ч�ڣ���λ��

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public int getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

}
