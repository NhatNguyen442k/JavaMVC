<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản trị - Thông tin tài khoản</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.1.1/css/all.css">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
</head>
<body>
	<jsp:include page="/WEB-INF/views/html/Admin/Support/HeaderAdmin.jsp" />
	<jsp:include page="/WEB-INF/views/html/Admin/Support/chucnang.jsp" />
	<div class="edit-account">
		<form:form action="edittaikhoan" method="post" modelAttribute="khachhangtaikhoan">
	        <div class="account">
	            <div class="left-account">
	                <p style="font-size: 30px;text-align: center;font-family: 'Times New Roman', Times, serif;
	                color: black;font-weight: bold;"
	                >Thông tin tài khoản</p>
	                <form:hidden path="iDuser"/>
	                <p>Tên tài khoản</p>
	                    <form:input type="text" path="taikhoan" class="taikhoan" disabled="true"/>
	                <p>Họ và tên</p>
	                    <form:input type="text" path="tenkhach" class="hoten" disabled="true" />
	                <p>Số điện thoại</p>
	                    <form:input type="tel" path="sdt" class="sdt"  disabled="true" />
	                <p>Giới tính</p>
	                    <form:input type="text" path="gioitinh" class="gioitinh" disabled="true"  />
	                <p>Địa chỉ</p>
	                    <form:input type="text" path="diachi" class="diachi" disabled="true" />
	            </div>
	            <div class="right-account">
	                <p>Set ROLE</p>
	                	<form:select path="iDrole" >
			                	<form:option value="1" label="Admin"/>  
			                	<form:option value="2" label="User"/> 
		                </form:select>
	            </div>
	            <button type="submit" class="btndangky">CẬP NHẬT ROLE</button>
	        </div>
        </form:form>
    </div>
    <jsp:include page="/WEB-INF/views/html/Admin/Support/FooterAdmin.jsp" />
</body>
</html>
<style type="text/css">
	<%@include file="/WEB-INF/views/css/Admin/EditQTaccount.css" %>
</style>