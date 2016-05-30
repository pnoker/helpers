package com.noker.helpers.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.noker.helpers.menu.Menu;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

public class MenuUtil {
	private static Logger log = LoggerFactory.getLogger(MenuUtil.class);
	private final static String menu_creat_url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";// ²Ëµ¥´´½¨
	private final static String menu_get_url = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";// ²Ëµ¥²éÑ¯
	private final static String menu_delete_url = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";// ²Ëµ¥É¾³ý

	public static boolean createMenu(Menu menu, String accessToken) {
		boolean result = false;
		String url = menu_creat_url.replace("ACCESS_TOKEN", accessToken);
		String jsonMenu = JSONObject.fromObject(menu).toString();
		JSONObject jsonObject = CommonUtil.httpsRequest(url, "POST", jsonMenu);
		if (null != jsonObject) {
			int errorCode = jsonObject.getInt("errcode");
			String errMsg = jsonObject.getString("errmsg");
			if (0 == errorCode) {
				result = true;
			} else {
				result = false;
				log.error("´´½¨²Ëµ¥Ê§°Ü errcode:{} errmsg:{}", errorCode, errMsg);
			}
		}
		return result;
	}

	public static String getMenu(String accessToken) {
		String result = null;
		String requestUrl = menu_get_url.replace("ACCESS_TOKEN", accessToken);
		JSONObject jsonObject = CommonUtil.httpsRequest(requestUrl, "GET", null);
		if (null != jsonObject) {
			result = jsonObject.toString();
		}
		return accessToken;
	}

	public static boolean deleteMenu(String accessToken) {
		boolean result = false;
		String requestUrl = menu_delete_url.replace("ACCESS_TOKEN", accessToken);
		JSONObject jsonObject = CommonUtil.httpsRequest(requestUrl, "GET", null);
		if (null != jsonObject) {
			int errorCode = jsonObject.getInt("errcode");
			String errorMsg = jsonObject.getString("errmsg");
			if (0 == errorCode) {
				result = true;
			} else {
				result = false;
				log.error("É¾³ý²Ëµ¥Ê§°Ü errcode:{} errmsg:{}", errorCode, errorMsg);
			}
		}
		return result;
	}
}
