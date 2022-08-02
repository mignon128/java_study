<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<style>
.gnb ul li a {
	line-height: 70px;
	font-size: 20px;
	color: white; 
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
	width: calc(70% - 17px);
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

.address1 {
	width: 250px;
	margin-right: 10px;
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
		<%@ include file="../incl/no_login_header.jsp"%>
	</header>
	<main>
		<section>
			<div class="today">
				<span><span>오늘 매출</span> <span id="today"></span></span>
				<button>상세보기</button>
			</div>
		</section>
		<section class="detail today_detail">
			<div>
				<h3 class="sales_today_detail_title">
					<span>매출 상세</span>
					<span>
						<button class="sort_name reverse">이름순</button>
						<button class="sort_price reverse">가격순</button>
					</span>
				</h3>
				<div class="sales_today_detail">
					<div>메뉴</div>
					<div>수량</div>
					<div>가격</div>
				</div>
			</div>
		</section>
		<section class="graph_section" onselectstart="return false;">
			<div class="box">
				<button class="year_btn">연 매출</button>
				<button class="month_btn">이번 달 매출</button>
				<button class="week_btn">이번 주 매출</button>
				<input type="month" name="date" id="date">
				<button class="other_month_search">검색</button>
				<h1>1월 총 합계</h1>
				<div>(단위 : 만원)</div>
				<div class="graph_box">
					<ul>
						<!-- 
						<li>
							<span class="sales"></span>
							<div class="graph"></div>
							<span class="graph_date"></span>
						</li>
						 -->
					</ul>
					<div class="graph_background">
						<div></div>
						<div></div>
						<div></div>
						<div></div>
						<div></div>
					</div>
				</div>
			</div>
		</section>
		<section class="detail other_detail">
			<div>
				<h3 class="sales_today_detail_title">
					<span id="other_detail_date"></span> <span>
						<button class="sort_name reverse">이름순</button>
						<button class="sort_price reverse">가격순</button>
					</span>
				</h3>
				<div class="sales_today_detail">
					<!-- <div>메뉴</div>
  					<div>수량</div>
  					<div>가격</div> -->
				</div>
			</div>
		</section>
	</main>
</body>
</html>
