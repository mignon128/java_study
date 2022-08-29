<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/default.css'/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/header.css'/>" />
<style>
.gnb ul li a {
	line-height: 70px;
	font-size: 20px;
	color: white;
	font-family: "Jalnan";
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

.add_user {
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

.add label {
	height: 60px;
	width: 20%;
	display: flex;
	justify-content: left;
	align-items: center;
	margin-top: 10px;
}

label.accType {
	margin-right: -19px;
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

.add>select.accType_selec:focus {
	outline: none;
	border-color: rgba(65, 125, 122, .6);
	box-shadow: 0 0 6px 2px rgba(65, 125, 122, .6);
}

select.accType {
	height: 45px;
	width: 30%;
	font-size: 15px;
	justify-content: center;
	text-align: center;
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
</style>
</head>
<body>
	<header>
		<%@ include file="../incl/header.jsp"%>
	</header>
	<section>
		<div class="container">
			<div class="title-wrap">
				<h3 class="title">계좌신청</h3>
			</div>
			<div id="content-wrapper">
				<div class="content">
					<form action="add_account" method="post">
						<div class="add">
							<label class="accType">계좌 타입</label>
							<select class="accType" name="accType">
								<option value="S">savingsAccount</option>
								<option value="C">checkingAccount</option>
							</select>
						</div>
						<div class="add">
							<label>금액</label><input type="text" name="balance">
						</div>
						<div class="btn-group">
							<div class="i-btn">
								<div class="btn">
									<button type="submit" class="btn-inner">확인</button>
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