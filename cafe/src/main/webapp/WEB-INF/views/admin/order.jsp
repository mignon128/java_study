<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cafe</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/default.css'/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/header.css'/>" />
<style>
.wrap {
	margin-top: 100px;
	height: 100%;
}

.main-nav {
	width: 100%;
	min-height: 50px;
	padding: 15px;
	display: flex;
	align-items: flex-start;
	flex-wrap: wrap;
	margin: 0 auto;
	background: #eee;
	position: relative;
}

.tab-list {
	text-align: center;
	width: 220px;
	margin: 10px;
}
</style>
</head>
<body>
	<header>
		<%@ include file="../incl/header.jsp"%>
	</header>
	<div class="wrap">
		<nav class="main-nav">
			<ul class="menu-tab list">
				<c:forEach var="cateList" items="${cateList }">
					<li><a href="<c:url value="/category//${cateList.cateName}"/>"></a></li>
					
				</c:forEach>
				<c:forEach var="menuList" items="${menuList }">
					<div>
						<img src="/resources/img/${menuList.imgName}">
						<div class="name">${menuList.name }</div>
						<div class="price">${menuList.price }</div>
					</div>
				</c:forEach>
			</ul>
		</nav>
	</div>

</body>
</html>
