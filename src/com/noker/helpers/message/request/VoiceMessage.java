package com.noker.helpers.message.request;

/*������Ϣ*/
public class VoiceMessage extends BaseMessage {
	private String MediaId;// ý��ID
	private String Format;// ������ʽ
	private String Recognition;// ����ʶ������UTF8����

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
