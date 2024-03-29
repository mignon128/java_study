<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank</title>
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

a {
	line-height: 70px;
	font-size: 20px;
	color: white;
}

a:hover {
	color: white;
	font-weight: 600;
}

section {
	height: 100%;
	overflow: hidden;
}

.container {
	display: flex;
	flex-wrap: wrap;
	height: 100%;
	width: 700px;
	margin: 0 auto;
	align-items: center;
}

.container .title-wrap {
	width: 100%;
	line-height: 60px;
	padding-top: 100px;
	text-align: center;
}

.container .title-wrap .title {
	display: inline-block;
	height: 100%;
	font-size: 36px;
	text-align: center;
	padding: 0 8px;
	position: relative;
	font-family: "Jalnan";
}

.container .title-wrap .title:before {
	position: absolute;
	content: '';
	width: 100%;
	height: 14px;
	bottom: 7px;
	left: 0;
	z-index: -1;
	background: #EDE6DB;
}

.container>.form-wrap {
	display: flex;
	height: 100%;
	align-items: flex-start;
	width: 100%;
}

.form-wrap>form {
	width: 100%;
}

.content {
	height: 50px;
	width: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
	margin-top: 30px;
}

.content label {
	width: 11%;
}

.content>input {
	height: 35px;
	line-height: 35px;
	padding-left: 5px;
	width: 55%;
	height: 50px;
	font-size: 15px;
}

.content>input:focus {
	outline: none;
	border-color: rgba(65, 125, 122, .6);
	box-shadow: 0 0 6px 2px rgba(65, 125, 122, .6);
}

.btn-group {
	display: flex;
	width: 100%;
	height: 50px;
	margin-top: 30px;
	justify-content: center;
}

.i-btn {
	display: flex;
	justify-content: space-around;
	height: 100%;
	width: 60%;
}

.i-btn>input {
	justify-content: center;
	border-style: none;
	font-size: 20px;
	background: #417D7A;
	color: white;
	border-radius: 30px;
	width: 150px;
	height: 50px;
	cursor: pointer;
	font-family: "Jalnan";
}

.i-btn>.in-btn {
	font-size: 20px;
	background: #417D7A;
	color: white;
	border-radius: 30px;
	width: 150px;
	height: 50px;
	line-height: 50px;
	text-align: center;
	font-family: "Jalnan";
}

.i-btn>.in-btn:hover {
	font-weight: normal;
}
</style>
</head>
<body>
	<header>
		<%@ include file="../incl/no_login_header.jsp"%>
	</header>
	<section>
		<div class="container">
			<div class="title-wrap">
				<h3 class="title">로그인</h3>
			</div>
			<div class="form-wrap">
				<form action="login" method="post">
					<div class="content">
						<label>아이디</label><input type="text" name="userId"><br>
					</div>
					<div class="content">
						<label>비밀번호</label><input type="password" name="passwd"><br>
					</div>
					<div class="btn-group">
						<div class="i-btn">
							<input type="submit" value="로그인" class="in-btn" />
							<a href="/banking/customer/add_customer" class="in-btn">회원가입</a>
						</div>
					</div>
				</form>
			</div>
		</div>
	</section>
</body>
</html>