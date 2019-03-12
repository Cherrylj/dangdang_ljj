<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="book_l_border1" id="__FenLeiLiuLan">
	<div class="book_sort_tushu">
		<h2>
			分类浏览
		</h2>
		<s:iterator value="list" var="t">
		<!--1级分类开始-->
			<div class="bg_old" onmouseover="this.className = 'bg_white';"
				onmouseout="this.className = 'bg_old';">
				<h3>
					[<a href='${pageContext.request.contextPath }/firstAction?id1=<s:property value="id"/>'> <s:property value="classify"/></a>]
				</h3>
				<ul class="ul_left_list">
						<s:iterator value="list" >
						<!--2级分类开始-->
						<li>
							<a href='${pageContext.request.contextPath }/firstAction?id1
							=<s:property value="#request.t.id"/>&id2=<s:property value="id"/>&cname=<s:property value="classify"/>'><s:property value="classify"/></a>
																	
						<!--2级分类结束-->
						</s:iterator>
				</ul>
				<div class="empty_left">
				</div>
			</div>

			<div class="more2">
			</div>
			<!--1级分类结束-->
		
		</s:iterator>

		<div class="bg_old">
			<h3>
				&nbsp;
			</h3>
		</div>
	</div>
</div>
