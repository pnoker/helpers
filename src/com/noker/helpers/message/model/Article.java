package com.noker.helpers.message.model;

/*ͼ��model*/
public class Article {
	private String Title;// ͼ����Ϣ����
	private String Description;// ͼ����Ϣ����
	private String PicUrl;// ͼƬ���ӣ�֧��JPG��PNG��ʽ���Ϻõ�Ч��Ϊ��ͼ640x320���أ�СͼΪ80x80����
	private String Url;// ���ͼ����Ϣ��ת����

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

}
