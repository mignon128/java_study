<%@page import="java.net.URLEncoder, java.util.*"%>
<%@page import="com.varxyz.banking.customer.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank</title>
<link rel="stylesheet" href="../css/default.css">
<link rel="stylesheet" href="../css/header.css">
<link rel="stylesheet" href="../css/reservation.css">
<style>
.title-wrap {
	text-align: center;
	margin-bottom: 30px;
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
	bottom: -4px;
	left: 0;
	z-index: -1;
	background: #EDE6DB;
}

.wrap {
	min-height: calc(100vh - 200px);
	height: auto;
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
			<h3 class="title">고객 리스트
			</h3>
		</div>
		<div class="rezInfo">
			<c:forEach var="fav" items="${favorites}">
				<table>
					<tbody>
						<tr>
							<th>주차장명</th>
							<td>${fav.parkingName}</td>
						</tr>
						<tr>
							<th>주차장위치</th>
							<td>${fav.parkingAddr}</td>
						</tr>
						<tr>
							<th>주차장번호</th>
							<td>${fav.parkingTel}</td>
						</tr>
					</tbody>
				</table>
			</c:forEach>
		</div>
	</div>
</body>
</html>