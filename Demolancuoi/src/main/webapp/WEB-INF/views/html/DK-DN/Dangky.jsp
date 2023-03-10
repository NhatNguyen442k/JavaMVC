<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng ký tài khoản</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.1.1/css/all.css">
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
	<div class="giaodien">
            <div class="left">
                <img class="imgdn" src="<c:url value='/static/DK-DN/dangky.png'/>">
            </div>
            <div class="right" style="background-color: white;">
            	<form:form action="save" method="post" modelAttribute="users" class="nhapdulieu">
                    <label class="label" >ĐĂNG KÝ TÀI KHOẢN</label>
                    <label class="labeltentaikhoan">Tên tài khoản</label>
                    <i class="fa-solid fa-user">
                    	<form:input type="text" path="taikhoan" class="taikhoan" placeholder="Nhập tên đăng nhập"/>  
                    </i>
                    <label class="labelmatkhau">Mật khẩu</label>	
                    <i class="fa-solid fa-key">
                    	<form:input type="password" path="matkhau" class="matkhau" placeholder="Nhập mật khẩu"/> 
                        <i class="fa-solid fa-eye" id="eye"></i>
                    </i>
                    <span class="note">--------------- Thông tin tài khoản ---------------</span>
                    <label class="labelhoten">Họ và tên</label>
                    <i class="fa-solid fa-worm">
                    	<form:input type="text" path="" class="ho" placeholder="Họ" id="ten"  onblur="getFullname()"/> 
                    	<form:input type="text" path="tenkhach" class="ten" id="ten" placeholder="Tên"/> 
                    </i>
                    <label class="labelsdt">Số điện thoại</label>
                    <i class="fa-solid fa-phone">
                    	<form:input type="tel" path="sdt" class="sdt" placeholder="Số điện thoại"/> 
                    </i>
                    <li>
                        <label class="labelgioitinh">Giới tính</label>
                        <form:radiobutton  path="gioitinh" class="rdnam" value="Nam"/> 
                        <label for="f-option" class="nam">Nam</label>
                        <form:radiobutton  path="gioitinh" class="rdnu" value="Nữ"/> 
                        <label for="s-option" class="nu">Nữ</label>
                    </li>
                    <label class="labeldiachi">Địa chỉ</label>
                    <i class="fa-solid fa-home">
                    	<form:input type="text" path="diachi" class="diachi" placeholder="Địa chỉ"/> 
                    </i>
                    <button type="submit" class="btndangky">ĐĂNG KÝ</button>
                    <div style="margin-top: 10px;">
                    </div>
                    <label class="chuthich">TIỂU MÀN THẦU HOTPOT</label>
                </form:form>
            </div>
    </div>
    <script type="text/javascript">
        	<%@include file="/WEB-INF/views/js/DK-DN/IConEye.js" %>
    </script>
    <script>
	    function getFullname(){
	    	var firstname = document.getElementById("ho").value;
	    	var lastname document.getElementById("ten").value;
	    	var fullname = firstname+" "+lastname;
	    	document.getElementById("ten").value = fullname;
	    }
    </script>
    
</body>
</html>
<style type="text/css">
  <%@include file="/WEB-INF/views/css/DK-DN/Dangky.css" %>
</style>