<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chi tiết giỏ hàng</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.1.1/css/all.css">
<script src="https://code.jquery.com/jquery-3.6.3.js" crossorigin="anonymous"></script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/html/Trangchu/Header.jsp" />
	<jsp:include page="/WEB-INF/views/html/Trangchu/Dropmenu.jsp" />
	<div class="giohang">
            <label>GIỎ HÀNG</label>
    </div>
    <div class="thongtingiohang">
            <div class="giohang-rol1">
                <label>Tên sản phẩm</label>
                <label style="width: 400px; margin-left: 100px;margin-right: 100px;">Hình ảnh</label>
                <label>Ngày đặt</label>
                <label>Đơn giá</label>
                <label>Số lượng</label>
                <label>Thành tiền</label>
                <label>Thao tác</label>
            </div>
            <div class="index-giohang">
		                <c:forEach var="itemgiohang" items="${ Dathang}">
		                 	
		                	<div class="giohang-rol2">
		                        <p style="width: 140px;;margin-right: 10px;">${itemgiohang.value.tp.tenthucpham }</p>
		                        <img src="/QuanLyQuanLau/FontEnd/IMAGES/DangNhap/Lautuxuyen.jpg">
		                        <p>${ itemgiohang.value.tp.ngaycapnhat}</p>
		                        <p style="width: 90px;">${ itemgiohang.value.tp.gia}.000 VNĐ</p>
		                        <input type="number" min="1" id="tongsl-${itemgiohang.key }" placeholder="1" value="${itemgiohang.value.tongsl }">
		                        <p style="width: 110px;">${itemgiohang.value.tongtien}</p>
		                        <div class="controltp">
				                <button type="submit" data-id="${itemgiohang.key}"
				                    class="editgh" style="width: 90px;height: auto;font-size: 16px;
				                    margin-left: 20px;float: left;border: 1px solid black;
				                    transform: translateY(280%);">EDIT</button>
			                        <a href="DeleteGiohang?id=${itemgiohang.key }">
			                        	<button type="submit">DELETE</button>
			                        </a>
		                         </div>
	                		</div>
	                	
		                </c:forEach>
            </div>
            <script type="text/javascript">
           		<%@include file="/WEB-INF/views/js/User/GiohangEdit.js" %>
    		</script>
            
            <div class="giohang-rol3">
                <button type="submit" >Xóa tất cả</button>
                <p>Tổng sản phẩm:${totaltongsl }</p>
                <p style="margin-left: 200px;">Tổng thanh toán:${totaltongtien }</p>
                <button type="submit" style="float: right; width: 150px;
                background-color: red; color: white;">
                <a href="Bill" style="text-decoration: none">Thanh toán</a></button>
            </div>
    </div>
    <jsp:include page="/WEB-INF/views/html/Trangchu/Footer.jsp" />
</body>
</html>
<style type="text/css">
		<%@include file="/WEB-INF/views/css/User/Giohang.css" %>
</style>

