package com.noker.helpers.message.event;

/*自定义菜单事件*/
public class MenuEvent extends BaseEvent {
	private String EventKey;// 事件的KEY值，与自定义菜单接口中KEY值对应

	public String getEventKey() {
		return EventKey;
	}

	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}

}
