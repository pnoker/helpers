package com.noker.helpers.message.model;

/*音乐model*/
public class Music {
	private String Title;// 音乐标题
	private String Description;// 音乐描述
	private String MusicUrl;// 高质量音乐链接，WiFi环境优先使用该链接的音乐
	private String HQMusicUrl;// 缩略图的媒体ID，通过上传多媒体文件得到的ID

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

	public String getMusicUrl() {
		return MusicUrl;
	}

	public void setMusicUrl(String musicUrl) {
		MusicUrl = musicUrl;
	}

	public String getHQMusicUrl() {
		return HQMusicUrl;
	}

	public void setHQMusicUrl(String hQMusicUrl) {
		HQMusicUrl = hQMusicUrl;
	}

}
