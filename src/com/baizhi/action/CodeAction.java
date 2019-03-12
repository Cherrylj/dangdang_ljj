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
		//获取验证码随机数
		String securityCode = ValidateImageCodeUtils.getSecurityCode();
		//将securityCode存入session作用域
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.setValue("#session.code", securityCode);
		//创建验证码图片，参数为securityCode
		BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
		//将验证码图片通过输出流响应到客户端，先获取response，再获取输出流
		HttpServletResponse response = ServletActionContext.getResponse();
		ServletOutputStream out = response.getOutputStream();
		//调用神奇方法
				/**
				 * 第一个参数： 验证码图片对象
				 * 第二个参数： 图片的格式
				 * 第三个参数： 输出字节流
				 */
		ImageIO.write(image, "png", out);
		return null;
	}
}
