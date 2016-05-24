package com.noker.helpers.service;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.noker.helpers.message.response.TextMessage;
import com.noker.helpers.util.MessageUtil;

public class RequestService {

	public static String processRequest(HttpServletRequest request) {
		// FromUserName=12&ToUserName=21&MsgType=12
		String respXml = null;
		String respContent = "δ֪����Ϣ���ͣ�";
		try {
			Map<String, String> requestMap = MessageUtil.parseXml(request);
			String fromUserName = requestMap.get("FromUserName");
			String toUserName = requestMap.get("ToUserName");
			String msgType = requestMap.get("MsgType");
			TextMessage textMessage = new TextMessage();
			textMessage.setToUserName(fromUserName);
			textMessage.setFromUserName(toUserName);
			textMessage.setCreateTime(new Date().getTime());
			textMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_TEXT);
			if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_TEXT)) {
				respContent = "�㷢�͵����ı���Ϣ��";
			} else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_IMAGE)) {
				respContent = "�㷢�͵���ͼƬ��Ϣ��";
			} else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_VOICE)) {
				respContent = "�㷢�͵���ͼ������Ϣ��";
			} else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_VIDEO)) {
				respContent = "�㷢�͵�����Ƶ��Ϣ��";
			} else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_SHORTVIDEO)) {
				respContent = "�㷢�͵���С��Ƶ��Ϣ��";
			} else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_LOCATION)) {
				respContent = "�㷢�͵��ǵ���λ����Ϣ��";
			} else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_LINK)) {
				respContent = "�㷢�͵���������Ϣ��";
			} else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_EVENT)) {
				String eventType = requestMap.get("Event");
				if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
					respContent = "лл��ע��";
				} else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBCRIBE)) {
				} else if (eventType.equals(MessageUtil.EVENT_TYPE_SCAN)) {
				} else if (eventType.equals(MessageUtil.EVENT_TYPE_LOCATION)) {
				} else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {
				}
			}
			textMessage.setContent(respContent);
			respXml = MessageUtil.messageToXml(textMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respXml;
	}

}
