<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail - Thông tin chi tiết</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.1.1/css/all.css">
</head>
<body>
	<jsp:include page="/WEB-INF/views/html/Trangchu/Header.jsp" />
	<jsp:include page="/WEB-INF/views/html/Trangchu/Dropmenu.jsp" />
		<form class="thongtindetail" method="get" action="<c:url value="/AddGiohang/${detailtp.iDthucpham }"/>">
	            <div class="detail-rol-1">
	                <div class="box"> 
	                    <span ></span>
	                    <span style="margin-left: 58px;"></span>
	                    <span ></span>
	                    <span style="margin-left: -58px;"></span>
	                        <img src="/QuanLyQuanLau/FontEnd/IMAGES/DangNhap/Lautuxuyen.jpg" alt="" srcset="">
	                  </div>
	            </div>
	            <div class="detail-rol-2">
	                <label style="font-size:30px;font-weight:bold;'">${detailtp.tenthucpham }</label> 
	                <c:if test="${detailtp.iDloaisp != 1 }">
	                	<label style="color:red;">Giá: ${detailtp.gia }.000 VNĐ</label>
	                	<label style="opacity:70%;">Số lượng còn:${detailtp.soluongcon }</label>
	                </c:if>
	            </div>
	            <div class="detail-rol-3">
	            	<p style="font-size:22px;opacity:90%;">MÔ TẢ SẢN PHẨM</p>
	            	<br>
	                <label style="opacity:50%;">${detailtp.thongtinmota} </label>	
	            </div>
	            <div class="detail-rol-4">
	            	<a href="AddGiohang/${detailtp.iDthucpham }">
	                	<button type="submit"/>ĐẶT MÓN</button>
	                </a>
	            </div>
	     </form>
     <jsp:include page="/WEB-INF/views/html/Trangchu/Footer.jsp" />
</body>
</html>
<style type="text/css">
	<%@include file="/WEB-INF/views/css/User/Detail.css" %>
</style>