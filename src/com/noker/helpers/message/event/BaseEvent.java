package com.noker.helpers.message.event;

/*事件基类*/
public class BaseEvent {
	private String ToUserName;// 开发者微信账号
	private String FromUserName;// 发送方微信账号
	private long CreateTime;// 该消息创建的时间（整型）
	private String MsgType;// 该消息的类型
	private String Event;// 该事件的类型

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

	public String getEvent() {
		return Event;
	}

	public void setEvent(String event) {
		Event = event;
	}

}
