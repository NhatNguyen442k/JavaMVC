<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập tài khoản</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.1.1/css/all.css">
</head>
<body>
	<div class="giaodien">
            <div class="left">
                <img class="imgdn" src="<c:url value='/static/DK-DN/dangnhap.png'/>">
            </div>
            <div class="right" style="background-color: white;">
            <form:form class="nhapdulieu" method="post" action="Dangnhap" modelAttribute="account">  
                    <label class="label" >ĐĂNG NHẬP TÀI KHOẢN</label>
                    <label class="labeltentaikhoan">Tên tài khoản</label>
                    <i class="fa-solid fa-user-edit">
                    	<form:input type="text" path="taikhoan" name="username"
                    	class="taikhoan" placeholder="Nhập số điện thoại hoặc email" />  
                    </i>
                    <label class="labelmatkhau">Mật khẩu</label>
                    <i class="fa-solid fa-keyboard">
                    	<form:input type="password" path="matkhau" name="password"
                    	class="matkhau" placeholder="Nhập mật khẩu" />
                        <i class="fa-solid fa-eye" id="eye"></i>
                    </i>
                    <label class="error">${loginstatus }</label>
                    <button type="submit" class="dangnhap" value="Dangnhap">ĐĂNG NHẬP</button>
                    <span class="note">--------------- Tùy chọn tài khoản ---------------</span>
                    <div style="margin-bottom: 70px;">
                    <button type="submit" class="quenmatkhau">Quên mật khẩu</button>    
                    <button type="submit" class="dangky" value="Dangky"><a href="Dangky"
                    style="text-decoration: none;color:black;">Đăng ký ngay</a></button>
                    </div>
                    <label class="chuthich">TIỂU MÀN THẦU HOTPOT</label>
             </form:form>
                
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.6.3.js"
        crossorigin="anonymous"></script>
        <script type="text/javascript">
        	<%@include file="/WEB-INF/views/js/DK-DN/IConEye.js" %>
        </script>
</body>
</html>
<style type="text/css">
  <%@include file="/WEB-INF/views/css/DK-DN/Dangnhap.css" %>
</style>