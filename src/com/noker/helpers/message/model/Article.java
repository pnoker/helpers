package com.noker.helpers.message.model;

/*图文model*/
public class Article {
	private String Title;// 图文消息标题
	private String Description;// 图文消息描述
	private String PicUrl;// 图片链接，支持JPG、PNG格式，较好的效果为大图640x320像素，小图为80x80像素
	private String Url;// 点击图文消息跳转链接

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return null == Description ? "" : Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getPicUrl() {
		return null == PicUrl ? "" : PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	public String getUrl() {
		return null == Url ? "" : Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

}
