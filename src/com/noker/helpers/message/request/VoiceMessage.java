package com.noker.helpers.message.request;

/*语音消息*/
public class VoiceMessage extends BaseMessage {
	private String MediaId;// 媒体ID
	private String Format;// 语音格式
	private String Recognition;// 语音识别结果，UTF8编码

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}

	public String getRecognition() {
		return Recognition;
	}

	public void setRecognition(String recognition) {
		Recognition = recognition;
	}

}
