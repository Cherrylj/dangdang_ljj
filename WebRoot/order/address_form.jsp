<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>生成订单 - 当当网</title>
		<link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/page_bottom.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="/dangdang_lj/js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
		$(function (){
			$("#address").change(function(){
				var adr = $(this).val();
				if(adr!=0){
					location="choiceAction?choice="+adr;
				}
			
			})
	
		})
	
	</script>
	</head>
	<body>
		<%@include file="../common/head1.jsp"%>
		<div class="login_step">
			生成订单骤: 1.确认订单 >
			<span class="red_bold"> 2.填写送货地址</span> > 3.订单成功
		</div>
		<div class="fill_message">
			<p>
				选择地址：
				<select id="address">
					<s:if test="address==null">
						<option value="0">
							填写新地址
						</option>
					</s:if>
					<s:else>
						<option value="<s:property value="address.id"/>">
							<s:property value="address.detailed"/>
						</option>
					</s:else>
						<s:property value="#session.list.size()"/>
					<s:iterator value="#session.list" var="d">
						<s:if test="address!=null">
						<s:if test="#d.id!=address.id">
						<option value="<s:property value="#d.id" />">
							<s:property value="#d.detailed"/>
						</option>
						</s:if>
						</s:if>
						<s:else>
						<option value="<s:property value="#d.id" />">
							<s:property value="#d.detailed"/>
						</option>
						</s:else>
					</s:iterator>
				</select>
			</p>
			<form name="ctl00" method="get" action="${pageContext.request.contextPath }/orderAction" id="f">
				<s:if test="address!=null">
				<input type="hidden" name="address.id" value="<s:property value="address.id"/>" id="addressId" />

				<table class="tab_login">
					<tr>
						<td valign="top" class="w1">
							收件人姓名：
						</td>
						<td>
							<input type="text" class="text_input" name="address.addName"
								value="<s:property value="address.addName"/>" id="receiveName" />
							<div class="text_left" id="nameValidMsg">
								<p>
									请填写有效的收件人姓名
								</p>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							收件人详细地址：
						</td>
						<td>
							<input type="text" name="address.detailed" value="<s:property value="address.detailed"/>" class="text_input"
								id="fullAddress" />
							<div class="text_left" id="addressValidMsg">
								<p>
									请填写有效的收件人的详细地址
								</p>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							邮政编码
						</td>
						<td>
							<input type="text" class="text_input" name="address.postalCode" value="<s:property value="address.postalCode"/>"
								id="postalCode" />
							<div class="text_left" id="codeValidMsg">
								<p>
									请填写有效的收件人的邮政编码
								</p>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							电话
						</td>
						<td>
							<input type="text" class="text_input" name="address.tel"
								value="<s:property value="address.tel"/>" id="phone" />
							<div class="text_left" id="phoneValidMsg">
								<p>
									请填写有效的收件人的电话
								</p>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							手机
						</td>
						<td>
							<input type="text" class="text_input" name="address.phone"
								value="<s:property value="address.phone"/>" id="mobile" />
							<div class="text_left" id="mobileValidMsg">
								<p>
									请填写有效的收件人的手机
								</p>
							</div>
						</td>
					</tr>
				</table>
			</s:if>
				
			
			<s:else>
					<input type="hidden" name="address.id" value="<s:property value="address.id"/>" id="addressId" />

				<table class="tab_login">
					<tr>
						<td valign="top" class="w1">
							收件人姓名：
						</td>
						<td>
							<input type="text" class="text_input" name="address.addName"
								value="<s:property value="address.addName"/>" id="receiveName" />
							<div class="text_left" id="nameValidMsg">
								<p>
									请填写有效的收件人姓名
								</p>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							收件人详细地址：
						</td>
						<td>
							<input type="text" name="address.detailed" value="<s:property value="address.detailed"/>" class="text_input"
								id="fullAddress" />
							<div class="text_left" id="addressValidMsg">
								<p>
									请填写有效的收件人的详细地址
								</p>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							邮政编码
						</td>
						<td>
							<input type="text" class="text_input" name="address.postalCode" value="<s:property value="address.postalCode"/>"
								id="postalCode" />
							<div class="text_left" id="codeValidMsg">
								<p>
									请填写有效的收件人的邮政编码
								</p>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							电话
						</td>
						<td>
							<input type="text" class="text_input" name="address.tel"
								value="<s:property value="address.tel"/>" id="address.phone" />
							<div class="text_left" id="phoneValidMsg">
								<p>
									请填写有效的收件人的电话
								</p>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							手机
						</td>
						<td>
							<input type="text" class="text_input" name="address.phone"
								value="<s:property value="address.phone"/>" id="mobile" />
							<div class="text_left" id="mobileValidMsg">
								<p>
									请填写有效的收件人的手机
								</p>
							</div>
						</td>
					</tr>
				</table>
		</s:else>
				<div class="login_in">

					<a href="order_info.jsp"><input id="btnClientRegister" class="button_1" name="submit"
					type="submit" value="取消" /></a>
			
				<input id="btnClientRegister" class="button_1" name="submit"
					type="submit" value="下一步" />
				</div>
			</form>
			
		</div>
		<%@include file="../common/foot1.jsp"%>
	</body>
</html>

