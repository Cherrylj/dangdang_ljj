<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>图书详情</title>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/book_detail.css"/>
		<link href="${pageContext.request.contextPath }/css/public_footer.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>
  	<script type="text/javascript">
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
		<br/>
		<div><h1><s:property value="book.pname"/></h1></div>
		丛书名：<s:property value="book.pname"/>
		<hr/>
		<table width="80%" border="0" align="center" cellspacing="0" cellpadding="5">
			<tr>
				<td rowspan="9" width="20%" valign="top"><img src="<s:property value="book.cover"/>" width="120px" height="170px" /></td>
				<td colspan="2">作者：<s:property value="book.author"/></td>
			</tr>
			<tr>
				<td colspan="2">出版社：地球出版社</td>
			</tr>
			<tr>
				<td>出版时间： <s:property value="book.dateIssued"/></td>
				<td>字数：1万</td>
			</tr>
			<tr>
				<td>版次：1</td>
				<td>页数：1000</td>
			</tr>
			<tr>
				<td>印刷时间：1997-10-21</td>
				<td>开本：16开</td>
			</tr>
			<tr>
				<td>印次：2</td>
				<td>纸张：500</td>
			</tr>
			<tr>
				<td>ISBN：<s:property value="book.ISBN"/></td>
				<td>包装：平装</td>
			</tr>
			<tr>
				<td colspan="2">定价：￥<s:property value="book.pricing"/>&nbsp;&nbsp;&nbsp;&nbsp;
				<font color="red">当当价：￥<s:property value="book.sellingPrice"/></font>&nbsp;&nbsp;&nbsp;&nbsp;
				节省：￥<s:property value="book.pricing-book.sellingPrice"/></td>
			</tr>
			<tr>
				<td colspan="2"><a href="javascript:void(0)"><img src="${pageContext.request.contextPath }/images/buttom_goumai.gif" id="<s:property value='book.id'/>" onclick="buyBook(<s:property value='book.id'/>)"/></a></td>
			</tr>
		</table>
		<hr style="border:1px dotted #666"/>
		<h2>编辑推荐</h2>
		<h3>在这本书里，我力图说明儿童早期教育中的某些问题，尤其要让读者认识到一个事实：我们的工作成就不仅仅是创建了一种新的教育模式。我们得出的结论已经显现于这本书名之中――发现孩子！
――玛丽娅•蒙台梭利（本书作者）

今天，人类社会迫切需要重建教育方法；为此而奋斗，也就是为人类复兴而奋斗！
　――塞吉（玛丽娅•蒙台梭利博士的老师）

蒙台梭利理论体系的精华是她对下面这个真理的有力论断或再论断：除非在自由的气氛中，儿童即不可能发展自己，也不可能受到有益的研究。
　　 ――E•G•霍尔姆斯（哈佛大学教育学院教授）
		</h3>
		<p>&nbsp;&nbsp;</p>
		<hr style="border:1px dotted #666"/>
		<h2>内容简介</h2>
		<h3>上课头疼的故事
		</h3>
		<p>&nbsp;&nbsp;</p>
		<hr style="border:1px dotted #666"/>
		<h2>作者简介</h2>
		<h3>我写的 作者是好人</h3>
		<p>&nbsp;&nbsp;</p>
		<hr style="border:1px dotted #666"/>
		<h2>目录</h2>
		<h3>这真是一本好书~</h3>
		<p>&nbsp;&nbsp;</p>
		<hr style="border:1px dotted #666"/>
		<h2>媒体评论</h2>
		<h3>好，非常畅销!难得的一本好书</h3>
		<p>&nbsp;&nbsp;</p>
		<hr style="border:1px dotted #666"/>
		<h2>书摘插图</h2>
	<h3>第2章 对教育方法的历史回顾
		儿童之家使用的教育体系实际上已经向前迈出了一大步。假如人们认为我和正常儿童相处所得的经验相对短暂，那么此经验建立在以往对非正常儿童的教育经验基础之上，因此也代表着一段相当长期的思想。
		假如我们想开发出科学的教育体系，就必须开辟出一条前所未有的新路。教师们必须接受专业培训，同时而学校也必须进行转变。假如教师们都接受了观察与实验的培训，那他们必须在学校里执行这些活动。
		因此，科学教育体系的基本需求是有一个能允许儿童自由发展个性的学校。如果某种教育体系是基于对学生个体的研究，那么其研究方式应该是对行动自由的儿童进行观察和研究，而不是对一个受压制的学生进行观察和研究。
		在人类学和实验心理学的帮助下，在一个人应试教育为主的学校里，开发新型教育方法，是最愚蠢的想法。
		每个领域的实验科学，都是由使用自己独特的方法中发展而来。细菌学起源于分离并培育微生物。犯罪学、医学和教育学也都分别在不同类型的个体上使用过最初的人体测量方法，如在罪犯上、精神病人、医院里的临床病人、学生身上等。实验心理学在开始阶段就要指出执行实验的精确技术。</h3>
	<p>&nbsp;&nbsp;</p>
		<!--页尾开始 -->
		<div class="public_footer">
			<div class="public_footer_bottom">
				<div class="public_footer_icp" style="line-height: 48px;">
					Copyright (C) 当当网 2004-2008, All Rights Reserved
					<a href="#" target="_blank"><img src="${pageContext.request.contextPath }/images/bottom/validate.gif" border="0" align="middle" /> </a>
					<a href="#" target="_blank" style="color: #666;">京ICP证041189号</a>
				</div>
			</div>
		</div>
		<!--页尾结束 -->
	</body>
</html>
