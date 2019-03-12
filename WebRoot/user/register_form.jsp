<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>用户注册 - 当当网</title>
<link href="${pageContext.request.contextPath }/css/login.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/page_bottom.css" rel="stylesheet" type="text/css" />
<style>
.erro {
	color: red;
}

.ok {
	
}

.success {
	color: green;
}
</style>
<script src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>
<script>
  $(function(){
		$("input").blur(function(){
			var str = /^[A-Za-z\d]+([-_.][A-Za-z\d]+)*@([A-Za-z\d]+[-.])+[A-Za-z\d]{2,4}$/;
			$(this).parent().find(".ok").remove();
			if($(this).is("#txtEmail")){
				if($(this).val()==""){
					$(this).next().append("<span  class='erro ok'> 邮箱不能为空 </span>");
				}else{
					if($(this).val().length>8 && str.test($(this).val())){
						$(this).next().append("<span  class='success ok'> 正确</span>");
					}else{
						$(this).next().append("<span  class='erro ok'> 邮箱格式不正确 </span>");
					}
				}
			}
			if($(this).is("#txtNickName")){
				if($(this).val()==""){
					$(this).next().append("<span  class='erro ok'> 昵称不能为空 </span>");
				}else{
					if($(this).val().length<2){
						$(this).next().append("<span  class='erro ok'> 昵称格式不正确 </span>");
					}else{
						$(this).next().append("<span  class='success ok'> 正确</span>");
					}
				}
			}
			if($(this).is("#txtPassword")){
				if($(this).val()==""){
					$(this).next().append("<span  class='erro ok'> 密码不能为空 </span>");
				}else{
					if($(this).val().length<6){
						$(this).next().append("<span  class='erro ok'> 密码格式不正确 </span>");
					}else{
						$(this).next().append("<span  class='success ok'> 正确</span>");
					}
				}
			}
			if($(this).is("#txtRepeatPass")){
				if($(this).val()==""){
					$(this).next().append("<span  class='erro ok'> 密码不能为空 </span>");
				}else{
					if($(this).val()!=$("#txtPassword").val()){
						$(this).next().append("<span  class='erro ok'> 密码错误 </span>");
					}else{
						$(this).next().append("<span  class='success ok'> 正确</span>");
					}
				}
			}
			if($(this).is("#validateCode")){
				if($(this).val()==""){
					$(this).next().append("<span  class='erro ok'> 验证码不能为空 </span>");
				}
			}
			
		});
		
		$("#f").submit(function(){
			$("input").trigger("blur");
			console.log($(".erro").length>0)
			if($(".erro").length>0){
				return false;
			}
		});
		
		$("#validateImage").click(function(){
			$(this).prop("src","${pageContext.request.contextPath }/captcha?time="+new Date().getTime());
		});
		$("#changeCode").click(function(){
			$("#validateImage").prop("src","${pageContext.request.contextPath }/captcha?time="+new Date().getTime());
		});
	});
  </script>
</head>
<body>
	<%@include file="../common/head1.jsp"%>
	<div class="login_step">
		注册步骤: <span class="red_bold">1.填写信息</span> > 2.验证邮箱 > 3.注册成功
	</div>
	<div class="fill_message">
		<form name="ctl00" method="post" action="${pageContext.request.contextPath}/registAction?" id="f">
			<h2>以下均为必填项</h2>
			<h2><span id="email.info" style="color:blue"><s:property value="message"/></span></h2>
			<table class="tab_login">
				<tr>
					<td valign="top" class="w1">请填写您的Email地址：</td>
					<td><input name="user.email" type="text" id="txtEmail"
						class="text_input" />
						<div class="text_left" id="emailValidMsg">
							<p>请填写有效的Email地址，在下一步中您将用此邮箱接收验证邮件。</p>
							<span id="email.info" style="color:red"></span>
						</div></td>
				</tr>
				<tr>
					<td valign="top" class="w1">设置您在当当网的昵称：</td>
					<td><input name="user.username" type="text" id="txtNickName"
						class="text_input" />
						<div class="text_left" id="nickNameValidMsg">
							<p>您的昵称可以由小写英文字母、中文、数字组成，</p>
							<p>长度4－20个字符，一个汉字为两个字符。</p>
							<span id="name.info" style="color:red"></span>
						</div></td>
				</tr>
				<tr>
					<td valign="top" class="w1">设置密码：</td>
					<td><input name="user.password" type="password" id="txtPassword"
						class="text_input" />
						<div class="text_left" id="passwordValidMsg">
							<p>您的密码可以由大小写英文字母、数字组成，长度6－20位。</p>
							<span id="password.info" style="color:red"></span>
						</div></td>
				</tr>
				<tr>
					<td valign="top" class="w1">再次输入您设置的密码：</td>
					<td><input name="password1" type="password" id="txtRepeatPass"
						class="text_input" />
						<div class="text_left" id="repeatPassValidMsg">
							<span id="password1.info" style="color:red"></span>
						</div></td>
				</tr>
				<tr>
					<td valign="top" class="w1">验证码：</td>
					<td><img class="yzm_img" align="middle" id="validateImage" src="/dangdang_lj/captcha" width="150" height="40"/>
							<input type="text" name="validateCode" id="validateCode" class="yzm_input"/>
						<div class="text_left t1">
							<p class="t1">
								<span id="vcodeValidMsg">请输入图片中的四个字母。</span> <span
									id="number.info" style="color:red"></span> <a href="javascript:void(0)" id="changeCode">看不清楚？换个图片</a>
							</p>
						</div></td>
				</tr>
			</table>

			<div class="login_in">

				<input id="btnClientRegister" class="button_1" name="submit"
					type="submit" value="注 册" />
			</div>
		</form>
	</div>
	<%@include file="../common/foot1.jsp"%>
</body>
</html>

