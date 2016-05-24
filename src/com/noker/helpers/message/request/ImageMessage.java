package com.noker.helpers.message.request;

/*Í¼Æ¬ÏûÏ¢*/
public class ImageMessage extends BaseMessage {
	private String PicUrl;// Í¼Æ¬Á´½Ó

	public String getContent() {
		return PicUrl;
	}

	public void setContent(String content) {
		PicUrl = content;
	}
}
