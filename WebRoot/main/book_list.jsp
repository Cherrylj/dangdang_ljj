<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>当当图书 – 全球最大的中文网上书店</title>
		<script type="text/javascript" src="../js/prototype-1.6.0.3.js">
		</script>
		<link href="${pageContext.request.contextPath }/css/book.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/css/second.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/css/secBook_Show.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath }/css/list.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>
  <script type="text/javascript">
  	$(function(){
  		$(".imgs").mouseover(function(e){
  			var bigImg = $("<img id='bImg' src='"+$(this).prop("src")+"'/>");
  			bigImg.css({
  				"top":e.pageY+5,
  				"left":e.pageX+10,
  				"position":"absolute",
  				"height":200
  			});
  			$("body").append(bigImg);
  		}).mouseout(function(){
  			$("#bImg").remove();
  		}).mousemove(function(e){
  			$("#bImg").css({
  				"top":e.pageY+5,
  				"left":e.pageX+10,
  				"position":"absolute",
  				"height":200
  			});
  		});
  	});
  	function changeCount(id){
  		var count = $("#"+id).val();
  		//alert(count);
  		location.href="${pageContext.request.contextPath }/changeCount?count="+count+"&id="+id;
  	}
  	
  	function buyBook(id){
		///alert(id);
     	$("#"+id).prop("src","${pageContext.request.contextPath }/cartAction?id="+id);
     	setTimeout(function(){
     		$("#"+id).prop("src","/dangdang_lj/images/load.gif");
     	}, 10);
     	setTimeout(function(){
     		$("#"+id).prop("src","/dangdang_lj/images/label3.gif");
     	},1000);
     	setTimeout(function(){
     		$("#"+id).prop("src","${pageContext.request.contextPath }/images/buttom_goumai.gif");
     	},1500);
     }
  </script>
	</head>
	<body>
		&nbsp;

		<!-- 头部开始 -->
		<%@include file="../common/head.jsp"%>
		<!-- 头部结束 -->

		<div style="width: 962px; margin: auto;">
			<a href=""><img src="${pageContext.request.contextPath }/images/default/book_banner_081203.jpg" border="0" /> </a>
		</div>
		
		<div class='your_position'>
			您现在的位置:&nbsp;
			<a href='${pageContext.request.contextPath}/main/main.jsp'>当当图书</a> &gt;&gt;
			<s:if test="flag">
			<a href='${pageContext.request.contextPath }/firstAction?id1=<s:property value="category.id"/>'><font style='color: #cc3300'><strong><s:property value="category.classify"/></strong> </font></a>
		   	</s:if>
		 	<s:else >
		   	<a href='${pageContext.request.contextPath }/firstAction?id1=<s:property value="category.id"/>'><font style='color: gray'><strong><s:property value="category.classify"/></strong> </font></a>&gt;&gt;
		    <font style='color: #cc3300'><strong><s:property value="cname"/></strong> </font>
			</s:else>
		</div>

		<div class="book">

			<!--左栏开始-->
			<div id="left" class="book_left">
				<div id="__fenleiliulan">
					<div class=second_l_border2>
						<h2>
							分类浏览
						</h2>
						<ul>
							<li>
								<div>
									<div class=second_fenlei>
										&middot;全部&nbsp;(<s:property value="category.count"/>)
									</div>
								</div>
							</li>
							<div class="clear"></div>
							<s:iterator value="category.list">
							<!--2级分类开始-->
							<li>
								<div>
									<div class=second_fenlei>
										&middot;
									</div>
									<div class=second_fenlei>
									<s:if test="cname.equals(classify)">
										<a href="${pageContext.request.contextPath }/firstAction?id1
							=<s:property value="id1"/>&id2=<s:property value="id"/>&cname=<s:property value="classify"/>"><font style='color: #cc3300'><strong><s:property value="classify"/></strong></font>&nbsp;(<s:property value="count"/>)</a>
									</s:if>
									<s:else>
									<a href="${pageContext.request.contextPath }/firstAction?id1
							=<s:property value="id1"/>&id2=<s:property value="id"/>&cname=<s:property value="classify"/>"><s:property value="classify"/>&nbsp;(<s:property value="count"/>)</a>
									
									</s:else>
									</div>
								</div>
							</li>
						    <div class="clear"></div>
							
							<!--2级分类结束-->
							</s:iterator>
							<li>
								<div></div>
							</li>
						</ul>
					</div>
				</div>
			</div>

			<!--左栏结束-->

			<!--中栏开始-->
			<div class="book_center">

				<!--图书列表开始-->
				<div id="divRight" class="list_right">

					<div id="book_list" class="list_r_title">
						<div class="list_r_title_text">
							排序方式
						</div>
						<select onchange='' name='select_order' size='1'
							class='list_r_title_ml'>
							<option value="">
								按上架时间 降序
							</option>
						</select>
						<div id="divTopPageNavi" class="list_r_title_text3">

							<!--分页导航开始-->
							
							<div class='list_r_title_text3a'>
							<s:if test="pageNum>1">
								<a name=link_page_next
									href="${pageContext.request.contextPath }/firstAction?id1=<s:property value='id1'/>
											&id2=<s:property value='id2'/>&pageNum=<s:property value='pageNum-1'/>">
								<img src='${pageContext.request.contextPath }/images/page_up.gif' /> </a>
							</s:if>
							</div>
							
							<s:else>
							<div class='list_r_title_text3a'>
								<img src='${pageContext.request.contextPath }/images/page_up_gray.gif' />
							</div>
							</s:else>
							<div class='list_r_title_text3b'>
								第<font ><s:property value="pageNum"/></font>页/共<s:property value="totalPage"/>页
							</div>
							<s:if test="pageNum<totalPage">
							<div class='list_r_title_text3a'>
								<a name=link_page_next
									href="${pageContext.request.contextPath }/firstAction?id1=<s:property value='id1'/>
											&id2=<s:property value='id2'/>&pageNum=<s:property value='pageNum+1'/>">
									<img src='${pageContext.request.contextPath }/images/page_down.gif' /> </a>
							</div>
							</s:if>
							<s:else>
							<div class='list_r_title_text3a'>
								<img src='${pageContext.request.contextPath }/images/page_down_gray.gif' />
							</div>
							</s:else>
							<!--分页导航结束-->
						</div>
					</div>
					
					<!--商品条目开始-->
						
						<div class="list_r_line"></div>
						<div class="clear"></div>
					<s:iterator value="list">
						<div class="list_r_list">
							<span class="list_r_list_book"><a name="link_prd_img" href='${pageContext.request.contextPath }/titleAction?id3=<s:property value="id"/>'>
								<img src="<s:property value="cover"/>" class="imgs"/> </a> </span>
							<h2>
								<a name="link_prd_name" href='${pageContext.request.contextPath }/titleAction?id3=<s:property value="id"/>'><s:property value="pname"/></a>
							</h2>
							<h3>
								顾客评分：<s:property value="grade"/>
							</h3>
							<h4 class="list_r_list_h4">
								作 者:
								<a href='#' name='作者'><s:property value="author"/></a>
							</h4>
							<h4>
								出版社：
								<a href='#' name='出版社'>人民邮电出版社</a>
							</h4>
							<h4>
								出版时间：2009-01-01
							</h4>
							<h5>
								这是一本好书，描述了Struts、Hibernate和Spring等框架的整合应用！
							</h5>
							<div class="clear"></div>
							<h6>
								<span class="del">￥<s:property value="pricing"/></span>
								<span class="red">￥<s:property value="sellingPrice"/></span>
								节省：￥<s:property value="pricing-sellingPrice"/>
							</h6>
							<span class="list_r_list_button"> 
							<a href="javascript:void(0)"> 
							<img src='${pageContext.request.contextPath }/images/buttom_goumai.gif' id="<s:property value='id'/>" onclick="buyBook(<s:property value='id'/>)"/> </a>
							<span id="cartinfo"></span>
						</div>
						<div class="clear"></div>
				</s:iterator>
						<!--商品条目结束-->

					<div class="clear"></div>
					<div id="divBottomPageNavi" class="fanye_bottom">
					</div>

				</div>
				<!--图书列表结束-->

			</div>
			<!--中栏结束-->
			<div class="clear"></div>
		</div>

		<!--页尾开始 -->
		<%@include file="../common/foot.jsp"%>
		<!--页尾结束 -->
	</body>
</html>
