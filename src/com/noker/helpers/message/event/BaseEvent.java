package com.noker.helpers.message.event;

/*�¼�����*/
public class BaseEvent {
	private String ToUserName;// ������΢���˺�
	private String FromUserName;// ���ͷ�΢���˺�
	private long CreateTime;// ����Ϣ������ʱ�䣨���ͣ�
	private String MsgType;// ����Ϣ������
	private String Event;// ���¼�������

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
