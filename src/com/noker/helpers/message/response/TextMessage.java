package com.noker.helpers.message.response;

/*文本消息*/
public class TextMessage extends BaseMessage {
	private String Content;// 回复的消息内容

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
}
