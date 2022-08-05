<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cafe</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/default.css'/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/header.css'/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/reservation.css'/>" />
<style>
.gnb ul li a {
	line-height: 70px;
	font-size: 20px;
	color: white;
	font-family: "Jalnan";
}

.title-wrap {
	width: 100%;
	line-height: 60px;
	padding-top: 100px;
	text-align: center;
	margin-bottom: 50px;
}

.title-wrap .title {
	display: inline-block;
	height: 100%;
	font-size: 36px;
	text-align: center;
	padding: 0 8px;
	position: relative;
	font-family: "Jalnan";
}

.title-wrap .title:before {
	position: absolute;
	content: '';
	width: 100%;
	height: 14px;
	bottom: 7px;
	left: 0;
	z-index: -1;
	background: #EDE6DB;
}

.rezInfo th {
	width: 25%;
}
</style>
</head>
<body>
	<header>
		<%@ include file="../incl/header.jsp"%>
	</header>
	<div class="wrap">
		<div class="title-wrap">
			<h3 class="title">메뉴등록 성공</h3>
		</div>
		<div class="rezInfo">
			<table>
				<tbody>
					<tr>
						<th>메뉴 이름</th>
						<td>${menu.name }</td>
					</tr>
					<tr>
						<th>메뉴 가격</th>
						<td>${menu.price }</td>
					</tr>
					<tr>
						<th>메뉴 사이즈</th>
						<td>${menu.size }</td>
					</tr>
					<tr>
						<th>메뉴 칼로리</th>
						<td>${menu.kcal }</td>
					</tr>
					<tr>
						<th>메뉴 재고</th>
						<td>${menu.count }</td>
					</tr>
					<tr>
						<th>메뉴 이미지</th>
						<td><img alt="" src="<c:url value="/resources/img/${menu.imgName}"/>"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>