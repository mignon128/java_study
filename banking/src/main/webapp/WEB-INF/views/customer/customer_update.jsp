<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.varxyz.banking.customer.Customer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Bank</title>
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
	background: #417D7A;
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
	padding-bottom: 160px;
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

.container>#content-wrapper {
	display: flex;
	height: 100%;
	align-items: flex-start;
	width: 100%;
	padding: 0 80px;
}

.content {
	width: 100%;
}

.add_customer {
	padding-top: 20px;
	width: 100%;
}

.add {
	height: 60px;
	width: 100%;
	display: flex;
	justify-content: left;
	align-items: center;
	margin-top: 10px;
}

.customer_id {
	flex-wrap: wrap;
}

span.id {
	display: block;
	width: 100%;
	font-size: 13px;
	color: red;
	margin-left: 15px;
	margin-top: 5px;
	text-align: right;
}

.phone {
	height: 60px;
	flex-wrap: wrap;
}

.add>input {
	width: 100%;
	height: 45px;
	line-height: 45px;
	padding-left: 5px;
	font-size: 15px;
}

.add>input:focus {
	outline: none;
	border-color: rgba(65, 125, 122, .6);
	box-shadow: 0 0 6px 2px rgba(65, 125, 122, .6);
}

.add>select.phoneNum_selec:focus {
	outline: none;
	border-color: rgba(65, 125, 122, .6);
	box-shadow: 0 0 6px 2px rgba(65, 125, 122, .6);
}

select.phoneNum_selec {
	height: 45px;
	width: 30%;
	font-size: 15px;
}

input.phoneNum {
	width: 100%;
}

span.phoneNum_middle {
	margin: 0 5px;
}

span.phone {
	margin-top: 5px;
	display: block;
	text-align: right;
	font-size: 13px;
	color: red;
	margin-left: 15px;
	width: 100%;
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

.i-btn .btn {
	display: flex;
	justify-content: center;
	height: 100%;
	background: #417D7A;
	border-radius: 30px;
	width: 150px;
	height: 50px;
}

button.btn-inner {
	color: white;
	border-style: none;
	height: 100%;
	width: 75px;
	font-size: 20px;
	background: none;
	cursor: pointer;
	font-family: "Jalnan";
}

.i-btn .in-btn {
	font-size: 20px;
	color: white;
	line-height: 50px;
	text-align: center;
	font-family: "Jalnan";
}

.i-btn .in-btn:hover {
	font-weight: normal;
}

#footer {
	height: 160px;
	background: #f1f1f1;
}

.copyright {
	width: 700px;
	height: 100%;
	margin: 0 auto;
	position: relative;
	padding-top: 40px;
}

.copyright-logo {
	position: absolute;
	right: 0;
	top: 40px;
	width: 80px;
	height: 80px;
	background-image: url("/chacha/image/logo.png");
}

.copyright-txt p {
	margin-top: 5px;
}

.copyright-txt p a {
	line-height: 0;
}

.copyright .copyright-logo a {
	color: transparent;
}

.copyright a, .copyright p {
	font-size: 15px;
	color: #000;
}
</style>
</head>
<body>
	<header>
		<%@ include file="../incl/header.jsp"%>
	</header>
	<section>
		<div class="container">
			<div class="title-wrap">
				<h3 class="title">정보수정</h3>
			</div>
			<div id="content-wrapper">
				<div class="content">
					<form class="add_customer" action="customer_update" method="post">
						<div class="add customer_id">
							<input type="text" name="userId" value="${userId}" readonly>
							<span class="id">* 아이디는 수정이 되지 않습니다.</span>
						</div>
						<div class="add">
							<input type="password" name="password" placeholder="비밀번호"
								value="${customer.passwd }">
						</div>
						<div class="add">
							<input type="text" name="name" placeholder="이름"
								value="${customer.name }">
						</div>
						<div class="add">
							<input type="text" name="ssn" placeholder="주민번호"
								value="${customer.ssn }">
						</div>
						<div class="add">
							<input type="text" class="phoneNum" name="phoneNum"
								placeholder="휴대폰번호" value="${customer.phone }">
						</div>
						<div class="btn-group">
							<div class="i-btn">
								<div class="btn">
									<button type="submit" class="btn-inner">확인</button>
								</div>
								<div class="btn">
									<a href="/my_page" class="in-btn">MyPage</a>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
</body>
</html>