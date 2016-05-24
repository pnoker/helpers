package com.noker.helpers.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noker.helpers.service.RequestService;
import com.noker.helpers.util.SignUtil;

/*�����������*/
public class RequestServlet extends HttpServlet {

	private static final long serialVersionUID = -768617069090778850L;

	/* ����΢�ŷ���������У�� */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String signature = request.getParameter("signature");// ΢�ż���ǩ��
		String timestamp = request.getParameter("timestamp");// ʱ���
		String nonce = request.getParameter("nonce");// �����
		String echostr = request.getParameter("echostr");// ����ַ���
		PrintWriter out = response.getWriter();
		if (SignUtil.checkSignature(signature, timestamp, nonce)) {// ����У�飬��У��ɹ���ԭ����������ַ�������ʾ����ɹ�������ʧ��
			out.print(echostr);
		}
		out.close();
		out = null;
	}

	/* ���ڴ����û���Ϣ */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");// ���ñ����ʽΪUTF-8,��ֹ��������
		response.setCharacterEncoding("UTF-8");
		String signature = request.getParameter("signature");// ΢�ż���ǩ��
		String timestamp = request.getParameter("timestamp");// ʱ���
		String nonce = request.getParameter("nonce");// �����
		PrintWriter out = response.getWriter();
		if (SignUtil.checkSignature(signature, timestamp, nonce)) {
			String respXml = RequestService.processRequest(request);// ���ú��ķ����࣬���մ�������
			out.print(respXml);
		}
		out.close();
		out = null;
	}
}
