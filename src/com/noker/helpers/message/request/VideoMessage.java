package com.noker.helpers.message.request;

/*视频消息*/
public class VideoMessage extends BaseMessage {
	private String MediaId;// 视频消息媒体ID
	private String ThumbMediaId;// 视频消息的缩略图ID

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
