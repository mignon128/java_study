<%@page import="java.net.URLEncoder, java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bank</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/default.css'/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/header.css'/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/reservation.css'/>" />
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
			<h3 class="title">고객 리스트</h3>
		</div>
		<div class="rezInfo">
			<c:forEach var="customer" items="${cusotmerList}">
				<table>
					<tbody>
						<tr>
							<th>E-mail</th>
							<td>${customer.email}</td>
						</tr>
						<tr>
							<th>비밀번호</th>
							<td>${customer.passwd}</td>
						</tr>
						<tr>
							<th>이름</th>
							<td>${customer.name}</td>
						</tr>
						<tr>
							<th>주민번호</th>
							<td>${customer.ssn}</td>
						</tr>
						<tr>
							<th>연락처</th>
							<td>${customer.phone}</td>
						</tr>
					</tbody>
				</table>
			</c:forEach>
		</div>
	</div>
</body>
</html>