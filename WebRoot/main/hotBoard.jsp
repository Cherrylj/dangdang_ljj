<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		<h2 class="t_xsrm">
			新书热卖榜
		</h2>
		
		<div id="NewProduct_1_o_t" onmouseover="">
		<s:iterator value="list">
<ul>
	
	<li><a  target='_blank' href="${pageContext.request.contextPath }/titleAction?id3=<s:property value="id"/>"><s:property value="pname"/></a></li>
</ul></s:iterator>
	<h3 class="second">
		<span class="dot_r"> </span><a href="#" target="_blank">更多&gt;&gt;</a>
	</h3>
</div>
