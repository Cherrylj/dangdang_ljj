<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>
	<span class="more"><a href="#" target="_blank">更多&gt;&gt;</a> </span>最新上架图书
</h2>
<div class="book_c_04">
<s:iterator value="list">
	<!--最新上架图书开始-->
	<div class="second_d_wai">
		<div class="img">
			<a href="${pageContext.request.contextPath }/titleAction?id3=<s:property value="id"/>" target='_blank'><img
					src="<s:property value="cover"/>" border=0 / class="imgs"> </a>
		</div>
		<div class="shuming">
			<a href="${pageContext.request.contextPath }/titleAction?id3=<s:property value="id"/>" target="_blank"><s:property value="pname"/></a><a href="#" target="_blank"></a>
		</div>
		<div class="price">
			定价：￥<s:property value="pricing"/>
		</div>
		<div class="price">
			当当价：￥<s:property value="sellingPrice"/>
		</div>
	</div>
	<div class="book_c_xy_long"></div>
	<!--最新上架图书结束-->
</s:iterator>
</div>
<div class="clear"></div>