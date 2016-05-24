package com.noker.helpers.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.noker.helpers.service.RequestService;
import com.noker.helpers.util.SignUtil;

/*请求处理核心类*/
public class RequestServlet extends HttpServlet {

	private static final long serialVersionUID = -768617069090778850L;

	/* 用于微信服务器请求校验 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String signature = request.getParameter("signature");// 微信加密签名
		String timestamp = request.getParameter("timestamp");// 时间戳
		String nonce = request.getParameter("nonce");// 随机数
		String echostr = request.getParameter("echostr");// 随机字符串
		PrintWriter out = response.getWriter();
		if (SignUtil.checkSignature(signature, timestamp, nonce)) {// 请求校验，若校验成功则原样返回随机字符串，表示接入成功，否则失败
			out.print(echostr);
		}
		out.close();
		out = null;
	}

	/* 用于处理用户信息 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");// 设置编码格式为UTF-8,防止中文乱码
		response.setCharacterEncoding("UTF-8");
		String signature = request.getParameter("signature");// 微信加密签名
		String timestamp = request.getParameter("timestamp");// 时间戳
		String nonce = request.getParameter("nonce");// 随机数
		PrintWriter out = response.getWriter();
		if (SignUtil.checkSignature(signature, timestamp, nonce)) {
			String respXml = RequestService.processRequest(request);// 调用核心服务类，接收处理请求
			out.print(respXml);
		}
		out.close();
		out = null;
	}
}
