package com.noker.helpers.message.request;

/*ͼƬ��Ϣ*/
public class ImageMessage extends BaseMessage {
	private String PicUrl;// ͼƬ����

	public String getContent() {
		return PicUrl;
	}

	public void setContent(String content) {
		PicUrl = content;
	}
}
