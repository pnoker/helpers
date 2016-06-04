package com.noker.helpers.message.model;

public class Token {
	private String accessToken;// 接口访问凭证
	private int expiresIn;// 凭证有效期，单位秒

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
