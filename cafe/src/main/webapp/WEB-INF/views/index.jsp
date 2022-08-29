<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cafe</title>
<style>
.gnb ul li a {
	line-height: 70px;
	font-size: 20px;
	color: white;
	font-family: "Jalnan";
}

body, html {
	width: 100%;
	height: 100%;
	overflow: hidden;
}

* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

ul, li {
	list-style: none;
}

a {
	text-decoration: none;
	color: #333;
}

#header {
	height: 80px;
	width: 100%;
	text-align: center;
	font-size: 20px;
	background: #B9CCED;
}

#header.login_on {
	position: fixed;
	z-index: 10;
}

.header-wrap {
	height: 100%;
	width: 60%;
	margin: 0 auto;
	position: relative;
}

.gnb {
	padding-left: 90px;
	width: 100%;
	height: 100%;
}

.gnb .left-gnb {
	float: left;
	height: 100%;
}

.gnb .right-gnb {
	float: right;
	height: 100%;
}

ul {
	height: 100%;
	padding: 5px 0;
}

ul li {
	float: left;
	height: 100%;
	margin-left: 30px;
}

ul li:first-child {
	margin-left: 0;
}

#header a {
	line-height: 70px;
	font-size: 20px;
	color: white;
}

#header a:hover {
	color: white;
	font-weight: 600;
}

.content-wrapper {
	display: flex;
	height: 100%;
	align-items: flex-start;
	width: 100%;
	padding: 0 80px;
	flex-wrap: wrap;
}

.content {
	height: 50px;
	width: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
	margin-top: 30px;
	font-family: "Jalnan";
}

.content h4 {
	font-size: 18px;
}

.list {
	height: 70%;
	margin-top: 0;
}

.info-list {
	padding: 0 150px;
}

.info-list li {
	width: 350px;
	height: 350px;
	line-height: 350px;
	text-align: center;
	margin-top: 200px;
	justify-content: center;
	position: relative;
	border: 1px solid black;
	margin-bottom: 50px;
}

.info-list li>a {
	bottom: 5px;
	left: 0;
	color: #000;
	width: 100%;
	font-size: 18px;
}

.info-list li>a:before {
	content: '';
	height: 14px;
	width: 0;
	bottom: 3px;
	left: 50%;
	background: #EDE6DB;
	z-index: -10;
	transition: 0.7s;
}

.info-list li>a.on:before {
	position: absolute;
	content: '';
	height: 14px;
	width: 70%;
	bottom: 3px;
	left: 36px;
	background: #EDE6DB;
	z-index: -10;
}
</style>
</head>
<body>
	<header>
		<%@ include file="incl/header.jsp"%>
	</header>
	<div class="content-wrapper">
		<div class="content list">
			<ul class="info-list">
				<li><a href="/cafe/admin/order" class="list">주문하기</a></li>
				<li><a href="/cafe/manager/mypage" class="list">관리자</a></li>
			</ul>
		</div>
	</div>
</body>
</html>