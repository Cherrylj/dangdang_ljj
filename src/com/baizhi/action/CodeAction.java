package com.baizhi.action;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.baizhi.utils.ValidateImageCodeUtils;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class CodeAction extends ActionSupport{
	public String captcha() throws IOException{
		//��ȡ��֤�������
		String securityCode = ValidateImageCodeUtils.getSecurityCode();
		//��securityCode����session������
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.setValue("#session.code", securityCode);
		//������֤��ͼƬ������ΪsecurityCode
		BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
		//����֤��ͼƬͨ���������Ӧ���ͻ��ˣ��Ȼ�ȡresponse���ٻ�ȡ�����
		HttpServletResponse response = ServletActionContext.getResponse();
		ServletOutputStream out = response.getOutputStream();
		//�������淽��
				/**
				 * ��һ�������� ��֤��ͼƬ����
				 * �ڶ��������� ͼƬ�ĸ�ʽ
				 * ������������ ����ֽ���
				 */
		ImageIO.write(image, "png", out);
		return null;
	}
}
