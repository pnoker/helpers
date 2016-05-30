package com.noker.weixin.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.noker.helpers.menu.Button;
import com.noker.helpers.menu.ClickButton;
import com.noker.helpers.menu.ComplexButton;
import com.noker.helpers.menu.Menu;
import com.noker.helpers.pojo.Token;
import com.noker.helpers.util.CommonUtil;
import com.noker.helpers.util.MenuUtil;

public class MenuManager {
	private static Logger log = LoggerFactory.getLogger(MenuManager.class);

	private static Menu getMenu() {
		ClickButton btn11 = new ClickButton();
		btn11.setName("��������");
		btn11.setType("click");
		btn11.setKey("weatherHelper");

		ClickButton btn12 = new ClickButton();
		btn12.setName("�������");
		btn12.setType("click");
		btn12.setKey("deliverHelper");

		ClickButton btn13 = new ClickButton();
		btn13.setName("��������");
		btn13.setType("click");
		btn13.setKey("interpeterHelper");

		ClickButton btn14 = new ClickButton();
		btn14.setName("ͼ������");
		btn14.setType("click");
		btn14.setKey("bookHelper");

		ClickButton btn15 = new ClickButton();
		btn15.setName("��������");
		btn15.setType("click");
		btn15.setKey("nearbySearch");

		ComplexButton mainBtn1 = new ComplexButton();
		mainBtn1.setName("��������");
		mainBtn1.setSub_button(new Button[] { btn11, btn12, btn13, btn14, btn15 });

		Menu menu = new Menu();
		menu.setButton(new Button[] { mainBtn1 });
		
		return menu;
	}
	public static void main(String[] args){
		String appId = "";
		String appSecret = "";
		Token token = CommonUtil.getToken(appId, appSecret);
		if(null != token){
			boolean result = MenuUtil.createMenu(getMenu(), token.getAccessToken());
			if(result){
				log.info("�˵������ɹ���");
			}else{
				log.info("�˵�����ʧ�ܣ�");
			}
		}
	}
}
