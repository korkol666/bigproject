<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div id="nav" style="width:15%;background-color:#f4f4f4">
		<ul class="nav nav-pills nav-stacked">

					
				<li class="active"><a href="welcome.jsp" target="main"><i class="glyphicon glyphicon-home"></i> &nbsp; 后台首页 </a>
					<!-- 动态生成菜单 -->
					<c:forEach items="${menus}" var="m">
				<li><a href="${m.url }" target="main" ><i class="${m.icon }"></i> &nbsp; ${m.mname }</a>
		
		</c:forEach>
		</ul>
	</div>
</body>
</html>