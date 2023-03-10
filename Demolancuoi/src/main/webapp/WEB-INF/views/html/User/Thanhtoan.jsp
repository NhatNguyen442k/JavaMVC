<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thanh toán đơn hàng</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.1.1/css/all.css">
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/html/Trangchu/Header.jsp" />
	<jsp:include page="/WEB-INF/views/html/Trangchu/Dropmenu.jsp" />
	<div class="thanhtoan-bill">
		<form:form action="Bill" method="post" modelAttribute="bill"> 
	        <div class="info-bill">
	            <br/>
	            <p class="bill-header">Thanh toán đơn hàng</p>
	            <div class="info-tenkhach">
	                <p>Họ và tên*
	                <form:hidden path="iDuser" value="${Logininfo.iDuser }"/>
	                <form:input type="text" path="" value="${Logininfo.tenkhach }"/></p>
	            </div>
	            <div class="info-sdt">
	                <p>Số điện thoại*
	                <form:input type="tel" path="sdt"/></p>
	            </div>
	            <div class="info-diachi">
	                <p>Địa chỉ*
	                <form:input type="text" path="diachi"	value="${Logininfo.diachi }"/></p>
	            </div>
	            <br>
	            <br>
	            <div class="info-phuongthuc" style="margin-top: 0px;">
	                <p>Thanh toán*
	                <form:select path="">
	                    <form:option value="" label="Trực tiếp"></form:option>
	                    <form:option value="" label="Thẻ ngân hàng"></form:option>
	                    <form:option value="" label="Momo"></form:option>
	                </form:select></p>
	            </div>
	            <div class="info-ghichu">
	                <p>Ghi nhớ
	                <form:textarea type="text" path="note"/></p>
	            </div>
	            <br>
	            <button type="submit">THANH TOÁN</button>
	            <br>
	        </div>
        </form:form>
    </div>
</body>
</html>
<style type="text/css">
		<%@include file="/WEB-INF/views/css/User/Bill.css" %>
</style>