package com.noker.helpers.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.noker.helpers.message.model.Article;
import com.noker.helpers.message.model.Weather;
import com.noker.helpers.message.response.NewsMessage;
import com.noker.helpers.message.response.TextMessage;
import com.noker.helpers.util.MessageUtil;
import com.noker.weixin.messsage.string.Content;

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
				String contents = requestMap.get("Content");
				
				WeatherService weatherService = new WeatherService();
				Weather weather = weatherService.proccessWeather(contents);
				textMessage.setContent(weather.getName()+" ʵʱ����\n"+weather.getText()+"\n"+weather.getTemperature()+"��");
				respXml = MessageUtil.messageToXml(textMessage);
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
					respContent = Content.subscribe;
				} else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBCRIBE)) {
				} else if (eventType.equals(MessageUtil.EVENT_TYPE_SCAN)) {
				} else if (eventType.equals(MessageUtil.EVENT_TYPE_LOCATION)) {
				} else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {
					String eventKey = requestMap.get("EventKey");
					if (eventKey.equals("weatherHelper")) {
						Article article = new Article();
						article.setTitle("��������");
						article.setDescription(Content.weatherHelper);
						article.setPicUrl("http://img0.imgtn.bdimg.com/it/u=80284445,2139803359&fm=21&gp=0.jpg");
						article.setUrl("");
						List<Article> articleList = new ArrayList<Article>();
						articleList.add(article);
						NewsMessage newsMessage = new NewsMessage();
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_NEWS);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respXml = MessageUtil.messageToXml(newsMessage);
					} else if (eventKey.equals("deliverHelper")) {
						Article article = new Article();
						article.setTitle("�������");
						article.setDescription("�������֣����Բ�ѯȫ����������һ�ܵ�����Ԥ��.\n\nʹ�ø�ʽ������+������\n\n    ���磺��������");
						article.setPicUrl("http://img0.imgtn.bdimg.com/it/u=80284445,2139803359&fm=21&gp=0.jpg");
						article.setUrl("");
						List<Article> articleList = new ArrayList<Article>();
						articleList.add(article);
						NewsMessage newsMessage = new NewsMessage();
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_NEWS);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respXml = MessageUtil.messageToXml(newsMessage);
					} else if (eventKey.equals("interpeterHelper")) {
						Article article = new Article();
						article.setTitle("��������");
						article.setDescription("�������֣����Բ�ѯȫ����������һ�ܵ�����Ԥ��.\n\nʹ�ø�ʽ������+������\n\n    ���磺��������");
						article.setPicUrl("http://img0.imgtn.bdimg.com/it/u=80284445,2139803359&fm=21&gp=0.jpg");
						article.setUrl("");
						List<Article> articleList = new ArrayList<Article>();
						articleList.add(article);
						NewsMessage newsMessage = new NewsMessage();
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_NEWS);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respXml = MessageUtil.messageToXml(newsMessage);
					} else if (eventKey.equals("bookHelper")) {
						Article article = new Article();
						article.setTitle("ͼ������");
						article.setDescription("�������֣����Բ�ѯȫ����������һ�ܵ�����Ԥ��.\n\nʹ�ø�ʽ������+������\n\n    ���磺��������");
						article.setPicUrl("http://img0.imgtn.bdimg.com/it/u=80284445,2139803359&fm=21&gp=0.jpg");
						article.setUrl("");
						List<Article> articleList = new ArrayList<Article>();
						articleList.add(article);
						NewsMessage newsMessage = new NewsMessage();
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_NEWS);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respXml = MessageUtil.messageToXml(newsMessage);
					} else if (eventKey.equals("nearbySearch")) {
						Article article = new Article();
						article.setTitle("�ܱ�����");
						article.setDescription("�������֣����Բ�ѯȫ����������һ�ܵ�����Ԥ��.\n\nʹ�ø�ʽ������+������\n\n    ���磺��������");
						article.setPicUrl("http://img0.imgtn.bdimg.com/it/u=80284445,2139803359&fm=21&gp=0.jpg");
						article.setUrl("");
						List<Article> articleList = new ArrayList<Article>();
						articleList.add(article);
						NewsMessage newsMessage = new NewsMessage();
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_NEWS);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respXml = MessageUtil.messageToXml(newsMessage);
					} else if (eventKey.equals("jisuanqi")) {
						Article article = new Article();
						article.setTitle("������");
						article.setDescription("�������֣����Բ�ѯȫ����������һ�ܵ�����Ԥ��.\n\nʹ�ø�ʽ������+������\n\n    ���磺��������");
						article.setPicUrl("http://img0.imgtn.bdimg.com/it/u=80284445,2139803359&fm=21&gp=0.jpg");
						article.setUrl("");
						List<Article> articleList = new ArrayList<Article>();
						articleList.add(article);
						NewsMessage newsMessage = new NewsMessage();
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_NEWS);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respXml = MessageUtil.messageToXml(newsMessage);
					} else if (eventKey.equals("daikuan")) {
						Article article = new Article();
						article.setTitle("����");
						article.setDescription("�������֣����Բ�ѯȫ����������һ�ܵ�����Ԥ��.\n\nʹ�ø�ʽ������+������\n\n    ���磺��������");
						article.setPicUrl("http://img0.imgtn.bdimg.com/it/u=80284445,2139803359&fm=21&gp=0.jpg");
						article.setUrl("");
						List<Article> articleList = new ArrayList<Article>();
						articleList.add(article);
						NewsMessage newsMessage = new NewsMessage();
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_NEWS);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respXml = MessageUtil.messageToXml(newsMessage);
					} else if (eventKey.equals("jiemeng")) {
						Article article = new Article();
						article.setTitle("�ܹ�����");
						article.setDescription("�������֣����Բ�ѯȫ����������һ�ܵ�����Ԥ��.\n\nʹ�ø�ʽ������+������\n\n    ���磺��������");
						article.setPicUrl("http://img0.imgtn.bdimg.com/it/u=80284445,2139803359&fm=21&gp=0.jpg");
						article.setUrl("");
						List<Article> articleList = new ArrayList<Article>();
						articleList.add(article);
						NewsMessage newsMessage = new NewsMessage();
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_NEWS);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respXml = MessageUtil.messageToXml(newsMessage);
					} else if (eventKey.equals("mingren")) {
						Article article = new Article();
						article.setTitle("��������");
						article.setDescription("�������֣����Բ�ѯȫ����������һ�ܵ�����Ԥ��.\n\nʹ�ø�ʽ������+������\n\n    ���磺��������");
						article.setPicUrl("http://img0.imgtn.bdimg.com/it/u=80284445,2139803359&fm=21&gp=0.jpg");
						article.setUrl("");
						List<Article> articleList = new ArrayList<Article>();
						articleList.add(article);
						NewsMessage newsMessage = new NewsMessage();
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_NEWS);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respXml = MessageUtil.messageToXml(newsMessage);
					} else if (eventKey.equals("tupian")) {
						Article article = new Article();
						article.setTitle("ͼƬ����");
						article.setDescription("�������֣����Բ�ѯȫ����������һ�ܵ�����Ԥ��.\n\nʹ�ø�ʽ������+������\n\n    ���磺��������");
						article.setPicUrl("http://img0.imgtn.bdimg.com/it/u=80284445,2139803359&fm=21&gp=0.jpg");
						article.setUrl("");
						List<Article> articleList = new ArrayList<Article>();
						articleList.add(article);
						NewsMessage newsMessage = new NewsMessage();
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_NEWS);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respXml = MessageUtil.messageToXml(newsMessage);
					} else if (eventKey.equals("mingche")) {
						Article article = new Article();
						article.setTitle("��������");
						article.setDescription("�������֣����Բ�ѯȫ����������һ�ܵ�����Ԥ��.\n\nʹ�ø�ʽ������+������\n\n    ���磺��������");
						article.setPicUrl("http://img0.imgtn.bdimg.com/it/u=80284445,2139803359&fm=21&gp=0.jpg");
						article.setUrl("");
						List<Article> articleList = new ArrayList<Article>();
						articleList.add(article);
						NewsMessage newsMessage = new NewsMessage();
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_NEWS);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respXml = MessageUtil.messageToXml(newsMessage);
					} else if (eventKey.equals("caipu")) {
						Article article = new Article();
						article.setTitle("����");
						article.setDescription("�������֣����Բ�ѯȫ����������һ�ܵ�����Ԥ��.\n\nʹ�ø�ʽ������+������\n\n    ���磺��������");
						article.setPicUrl("http://img0.imgtn.bdimg.com/it/u=80284445,2139803359&fm=21&gp=0.jpg");
						article.setUrl("");
						List<Article> articleList = new ArrayList<Article>();
						articleList.add(article);
						NewsMessage newsMessage = new NewsMessage();
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_NEWS);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respXml = MessageUtil.messageToXml(newsMessage);
					} else if (eventKey.equals("baike")) {
						Article article = new Article();
						article.setTitle("�ٿ�");
						article.setDescription("�������֣����Բ�ѯȫ����������һ�ܵ�����Ԥ��.\n\nʹ�ø�ʽ������+������\n\n    ���磺��������");
						article.setPicUrl("http://img0.imgtn.bdimg.com/it/u=80284445,2139803359&fm=21&gp=0.jpg");
						article.setUrl("");
						List<Article> articleList = new ArrayList<Article>();
						articleList.add(article);
						NewsMessage newsMessage = new NewsMessage();
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_NEWS);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respXml = MessageUtil.messageToXml(newsMessage);
					} else if (eventKey.equals("geci")) {
						Article article = new Article();
						article.setTitle("���");
						article.setDescription("�������֣����Բ�ѯȫ����������һ�ܵ�����Ԥ��.\n\nʹ�ø�ʽ������+������\n\n    ���磺��������");
						article.setPicUrl("http://img0.imgtn.bdimg.com/it/u=80284445,2139803359&fm=21&gp=0.jpg");
						article.setUrl("");
						List<Article> articleList = new ArrayList<Article>();
						articleList.add(article);
						NewsMessage newsMessage = new NewsMessage();
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_NEWS);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respXml = MessageUtil.messageToXml(newsMessage);
					} else if (eventKey.equals("jianyi")) {
						Article article = new Article();
						article.setTitle("�û�����");
						article.setDescription("�������֣����Բ�ѯȫ����������һ�ܵ�����Ԥ��.\n\nʹ�ø�ʽ������+������\n\n    ���磺��������");
						article.setPicUrl("http://img0.imgtn.bdimg.com/it/u=80284445,2139803359&fm=21&gp=0.jpg");
						article.setUrl("");
						List<Article> articleList = new ArrayList<Article>();
						articleList.add(article);
						NewsMessage newsMessage = new NewsMessage();
						newsMessage.setToUserName(fromUserName);
						newsMessage.setFromUserName(toUserName);
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setMsgType(MessageUtil.RRESPONSE_MESSAGE_TYPE_NEWS);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respXml = MessageUtil.messageToXml(newsMessage);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return respXml;
	}

}
