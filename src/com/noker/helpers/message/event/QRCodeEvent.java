package com.noker.helpers.message.event;

/*ɨ���������ά���¼�*/
public class QRCodeEvent extends BaseEvent {
	private String EventKey;// �¼�KEYֵ
	private String Ticket;// ���ڻ�ȡ��ά��ͼƬ

	public String getEventKey() {
		return EventKey;
	}

	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}

	public String getTicket() {
		return Ticket;
	}

	public void setTicket(String ticket) {
		Ticket = ticket;
	}

}
