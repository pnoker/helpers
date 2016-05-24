package com.noker.helpers.message.model;

/*视频model*/
public class Video {
	private String MediaId;// 媒体文件ID
	private String ThumbMediaId;// 缩略图的媒体ID

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}

}
