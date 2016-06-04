package com.noker.weixin.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.noker.helpers.menu.Button;
import com.noker.helpers.menu.ClickButton;
import com.noker.helpers.menu.ComplexButton;
import com.noker.helpers.menu.Menu;
import com.noker.helpers.message.model.Token;
import com.noker.helpers.util.CommonUtil;
import com.noker.helpers.util.MenuUtil;

public class MenuManager {
	private static Logger log = LoggerFactory.getLogger(MenuManager.class);

	private static Menu getMenu() {
		ClickButton btn11 = new ClickButton();
		btn11.setName("天气助手");
		btn11.setType("click");
		btn11.setKey("weatherHelper");

		ClickButton btn12 = new ClickButton();
		btn12.setName("快递助手");
		btn12.setType("click");
		btn12.setKey("deliverHelper");

		ClickButton btn13 = new ClickButton();
		btn13.setName("翻译助手");
		btn13.setType("click");
		btn13.setKey("interpeterHelper");

		ClickButton btn14 = new ClickButton();
		btn14.setName("图书助手");
		btn14.setType("click");
		btn14.setKey("bookHelper");

		ClickButton btn15 = new ClickButton();
		btn15.setName("附近搜索");
		btn15.setType("click");
		btn15.setKey("nearbySearch");

		ClickButton btn21 = new ClickButton();
		btn21.setName("天气助手");
		btn21.setType("click");
		btn21.setKey("weatherHelper1");

		ClickButton btn22 = new ClickButton();
		btn22.setName("快递助手");
		btn22.setType("click");
		btn22.setKey("deliverHelper1");

		ClickButton btn23 = new ClickButton();
		btn23.setName("翻译助手");
		btn23.setType("click");
		btn23.setKey("interpeterHelper1");

		ClickButton btn24 = new ClickButton();
		btn24.setName("图书助手");
		btn24.setType("click");
		btn24.setKey("bookHelper1");

		ClickButton btn25 = new ClickButton();
		btn25.setName("附近搜索");
		btn25.setType("click");
		btn25.setKey("nearbySearch1");

		ClickButton btn31 = new ClickButton();
		btn31.setName("天气助手");
		btn31.setType("click");
		btn31.setKey("weatherHelper2");

		ClickButton btn32 = new ClickButton();
		btn32.setName("快递助手");
		btn32.setType("click");
		btn32.setKey("deliverHelper2");

		ClickButton btn33 = new ClickButton();
		btn33.setName("翻译助手");
		btn33.setType("click");
		btn33.setKey("interpeterHelper2");

		ClickButton btn34 = new ClickButton();
		btn34.setName("图书助手");
		btn34.setType("click");
		btn34.setKey("bookHelper2");

		ClickButton btn35 = new ClickButton();
		btn35.setName("附近搜索");
		btn35.setType("click");
		btn35.setKey("nearbySearch2");

		ComplexButton mainBtn1 = new ComplexButton();
		mainBtn1.setName("生活助手");
		mainBtn1.setSub_button(new Button[] { btn11, btn12, btn13, btn14, btn15 });

		ComplexButton mainBtn2 = new ComplexButton();
		mainBtn2.setName("生活导航");
		mainBtn2.setSub_button(new Button[] { btn21, btn22, btn23, btn24, btn25 });

		ComplexButton mainBtn3 = new ComplexButton();
		mainBtn3.setName("帮助反馈");
		mainBtn3.setSub_button(new Button[] { btn31, btn32, btn33, btn34, btn35 });
		Menu menu = new Menu();
		menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });

		return menu;
	}

	public static void main(String[] args) {
		String appId = "wx1c781ee933991411";
		String appSecret = "6705b14d5fe0979a58225d9d780c24a2";
		Token token = CommonUtil.getToken(appId, appSecret);
		if (null != token) {
			boolean result = MenuUtil.createMenu(getMenu(), token.getAccessToken());
			if (result) {
				log.info("菜单创建成功！");
			} else {
				log.info("菜单创建失败！");
			}
		}
	}
}
