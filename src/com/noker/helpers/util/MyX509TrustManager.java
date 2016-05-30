package com.noker.helpers.util;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/*任务管理器*/
public class MyX509TrustManager implements X509TrustManager { // 自定义信任管理器类实现X509TrustManager接口的3个方法

	@Override
	public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {// 检查客户端证书
		// TODO Auto-generated method stub

	}

	@Override
	public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {// 检查服务器端证书
		// TODO Auto-generated method stub

	}

	@Override
	public X509Certificate[] getAcceptedIssuers() {// 返回受信任的X509证书数组
		// TODO Auto-generated method stub
		return null;
	}

}
