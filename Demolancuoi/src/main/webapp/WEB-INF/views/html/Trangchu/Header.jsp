<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Header Trang chu</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.1.1/css/all.css">
<link rel="stylesheet" type="text/css" href="/WEB-INF/views/css/Trangchu/Header.css">
</head>
<body>
	<div class="header">
	    <div class="container">
	        <div class="navbar">
	            <div class="logo">
	                <a href="Trangchu">
	                <img src="<c:url value='/static/Trangchu/logo.png'/>" width="150px">
	                </a>
	            </div>
	            <input type="search" class="btntimkiem" placeholder="Tìm kiếm" >
	            <a href="" class="facebook">
	                <i class="fab fa-facebook-f"></i>
	            </a>
	            <a href="" class="google">
	                <i class="fab fa-google-plus-g"></i>
	            </a>
	            <a href="" class="youtube">
	                <i class="fab fa-youtube"></i>
	            </a>
	            <c:if test="${empty Logininfo }">
		            <a href="Dangnhap"  class="dangnhap">
		            <i class="fa-solid fa-power-off" style="color: white; margin-right: 2px;"></i>
		            <label type="submit" class="btndangnhap">ĐĂNG NHẬP</label>
		            </a>
	            </c:if>
	            <c:if test="${not empty Logininfo }">
		            	<div class="action">
		            			<c:if test="${Logininfo.gioitinh == 'Nam' }">
						        	<div class="profile" onclick="menuTogle();">
						            	<img src="<c:url value='/static/Trangchu/AnhdaidienNam.png'/>">
						        	</div>
					        	</c:if>
					        	<c:if test="${Logininfo.gioitinh == 'Nữ' }">
						        	<div class="profile" onclick="menuTogle();">
						            	<img src="<c:url value='/static/Trangchu/AnhdaidienNu.png'/>">
						        	</div>
					        	</c:if>
					            <div class="menu">
					                <h3>Welcome<br><span>${Logininfo.tenkhach }</span></h3>
					                <ul>
					                    <li><img src="<c:url value='/static/Trangchu/profile.png'/>"><a href="">Tài khoản</a></li>
					                    <li><img src="<c:url value='/static/Trangchu/editprofile.png'/>"><a href="">Đổi mật khẩu</a></li>
					                    <li><img src="<c:url value='/static/Trangchu/inbox.png'/>"><a href="Giohang">Giỏ hàng(${totaltongsl})</a></li>
					                    <li><img src="<c:url value='/static/Trangchu/help.png'/>"><a href="">Trợ giúp</a></li>	
					                    <li><img src="<c:url value='/static/Trangchu/setting.png'/>"><a href="">Cài đặt</a></li>
					                    <li><img src="<c:url value='/static/Trangchu/logout.png'/>"><a href="Dangxuat">Đăng xuất</li>
					                </ul>
					            </div>
					    </div>
	            </c:if>
	        </div>
	    </div>
	</div>
	<script type="text/javascript">
        function menuTogle(){
            const togglemenu = document.querySelector('.menu');
            togglemenu.classList.toggle('active')
        }
    </script> 
</body>
</html>
<style type="text/css">
<%@include file="/WEB-INF/views/css/Trangchu/Header.css" %>/>
</style>