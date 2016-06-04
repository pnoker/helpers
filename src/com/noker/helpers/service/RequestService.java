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
		String respContent = "未知的消息类型！";
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
				textMessage.setContent(weather.getName()+" 实时天气\n"+weather.getText()+"\n"+weather.getTemperature()+"℃");
				respXml = MessageUtil.messageToXml(textMessage);
			} else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_IMAGE)) {
				respContent = "你发送的是图片消息！";
			} else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_VOICE)) {
				respContent = "你发送的是图语音消息！";
			} else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_VIDEO)) {
				respContent = "你发送的是视频消息！";
			} else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_SHORTVIDEO)) {
				respContent = "你发送的是小视频消息！";
			} else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_LOCATION)) {
				respContent = "你发送的是地理位置消息！";
			} else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_LINK)) {
				respContent = "你发送的是链接消息！";
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
						article.setTitle("天气助手");
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
						article.setTitle("快递助手");
						article.setDescription("天气助手，可以查询全国各个城市一周的天气预报.\n\n使用格式：天气+城市名\n\n    例如：天气沈阳");
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
						article.setTitle("翻译助手");
						article.setDescription("天气助手，可以查询全国各个城市一周的天气预报.\n\n使用格式：天气+城市名\n\n    例如：天气沈阳");
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
						article.setTitle("图书助手");
						article.setDescription("天气助手，可以查询全国各个城市一周的天气预报.\n\n使用格式：天气+城市名\n\n    例如：天气沈阳");
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
						article.setTitle("周边搜索");
						article.setDescription("天气助手，可以查询全国各个城市一周的天气预报.\n\n使用格式：天气+城市名\n\n    例如：天气沈阳");
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
						article.setTitle("计算器");
						article.setDescription("天气助手，可以查询全国各个城市一周的天气预报.\n\n使用格式：天气+城市名\n\n    例如：天气沈阳");
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
						article.setTitle("贷款");
						article.setDescription("天气助手，可以查询全国各个城市一周的天气预报.\n\n使用格式：天气+城市名\n\n    例如：天气沈阳");
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
						article.setTitle("周公解梦");
						article.setDescription("天气助手，可以查询全国各个城市一周的天气预报.\n\n使用格式：天气+城市名\n\n    例如：天气沈阳");
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
						article.setTitle("人名搜索");
						article.setDescription("天气助手，可以查询全国各个城市一周的天气预报.\n\n使用格式：天气+城市名\n\n    例如：天气沈阳");
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
						article.setTitle("图片搜索");
						article.setDescription("天气助手，可以查询全国各个城市一周的天气预报.\n\n使用格式：天气+城市名\n\n    例如：天气沈阳");
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
						article.setTitle("名车搜索");
						article.setDescription("天气助手，可以查询全国各个城市一周的天气预报.\n\n使用格式：天气+城市名\n\n    例如：天气沈阳");
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
						article.setTitle("菜谱");
						article.setDescription("天气助手，可以查询全国各个城市一周的天气预报.\n\n使用格式：天气+城市名\n\n    例如：天气沈阳");
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
						article.setTitle("百科");
						article.setDescription("天气助手，可以查询全国各个城市一周的天气预报.\n\n使用格式：天气+城市名\n\n    例如：天气沈阳");
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
						article.setTitle("歌词");
						article.setDescription("天气助手，可以查询全国各个城市一周的天气预报.\n\n使用格式：天气+城市名\n\n    例如：天气沈阳");
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
						article.setTitle("用户建议");
						article.setDescription("天气助手，可以查询全国各个城市一周的天气预报.\n\n使用格式：天气+城市名\n\n    例如：天气沈阳");
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
