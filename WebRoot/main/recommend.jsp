<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>
	编辑推荐
</h2>

<div id=__bianjituijian/danpin>
	<div class=second_c_02>
	<s:iterator value="list">
		<div class=second_c_02_b1>
			<div class=second_c_02_b1_1>
				<a href='${pageContext.request.contextPath }/titleAction?id3=<s:property value="id"/>' target='_blank'><img src="<s:property value="cover" />" width=70 border=0 class="imgs"/> </a>
			</div>
			<div class=second_c_02_b1_2>
				<h3>
					<a href='${pageContext.request.contextPath }/titleAction?id3=<s:property value="id"/>' target='_blank' title='输赢'><s:property value="pname"/> </a>
				</h3>
				<h4>
					作者：<s:property value="author"/> 著
					<br />
					出版社：×××&nbsp;&nbsp;&nbsp;&nbsp;出版时间：2006-7-1
				</h4>
				<h5>
					简介
				</h5>
				<h6>
					定价：￥<s:property value="pricing"/>&nbsp;&nbsp;当当价：￥<s:property value="sellingPrice"/>
				</h6>
				<div class=line_xx></div>
			</div>
		</div>
	</s:iterator>
		
	</div>
</div>
