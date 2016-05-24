package com.noker.helpers.message.response;

/*响应消息基类*/
public class BaseMessage {
	private String ToUserName;// 开发者的微信账号
	private String FromUserName;// 发送方的微信账号
	private long CreateTime;// 该消息创建的时间（整型）
	private String MsgType;// 该消息的类型

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
}
