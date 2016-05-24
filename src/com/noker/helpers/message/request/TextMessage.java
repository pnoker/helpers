package com.noker.helpers.message.request;

/*文本消息*/
public class TextMessage extends BaseMessage{
	private String Content;//消息的内容

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

}
