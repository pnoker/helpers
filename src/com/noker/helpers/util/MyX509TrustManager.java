package com.noker.helpers.util;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/*���������*/
public class MyX509TrustManager implements X509TrustManager { // �Զ������ι�������ʵ��X509TrustManager�ӿڵ�3������

	@Override
	public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {// ���ͻ���֤��
		// TODO Auto-generated method stub

	}

	@Override
	public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {// ����������֤��
		// TODO Auto-generated method stub

	}

	@Override
	public X509Certificate[] getAcceptedIssuers() {// ���������ε�X509֤������
		// TODO Auto-generated method stub
		return null;
	}

}
