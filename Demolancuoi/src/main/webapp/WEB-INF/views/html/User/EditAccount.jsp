<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chỉnh sửa thông tin tài khoản</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.1.1/css/all.css">
</head>
<body>
	<jsp:include page="/WEB-INF/views/html/Trangchu/Header.jsp" />
	<div class="account-info">
        <div class="infoac">
            <div class="left-info-account">
                <ul class="dropdown">
                    <li>
                        <button class="menu">Tài khoản của tôi</button>
                    <ul>
                        <li><i class="fas fa-user-circle"></i><a href="#">Hồ sơ</a></li>
                        <li><i class="fas fa-key"></i><a href="#">Đổi mật khẩu</a></li>
                        <li><i class="fas fa-message"></i><a href="#">Góp ý</a></li>
                    </ul>
                    </li>
                    <li>
                        <button type="submit" class="menu">Giỏ hàng</button>
                    </li>
                </ul>
            </div>
            <script type="text/javascript">
                	<%@include file="/WEB-INF/views/js/User/Index.js" %>
            </script>
            <div class="font-info">
	            <div class="right-info-account">
	                <div class="thongbaoac">
	                    <p style="font-size: 18px; font-weight: bold;">Hồ sơ của tôi</p>
	                    <p>Quản lý thông tin hồ sơ để bảo mật</p>
	                </div>
	                <div class="thaydoiac">
	                    <p>Tài khoản đăng nhập
	                    <input type="text" value="Vysimple" disabled></p>
	                    <p>Họ và tên
	                        <input type="text" value="Trần Triệu Vy"></p>
	                    <li>
	                        <label class="labelgioitinh">Giới tính</label>
	                        <input type="radio" id="" name="selector" class="rdnam" 
	                        style="width: 15px;float: none;">
	                        <label for="f-option" class="nam">Nam</label>
	                        <input type="radio" id="" name="selector" class="rdnu" 
	                        style="width: 15px; float: none;margin-left: 50px;" checked>
	                        <label for="s-option" class="nu">Nữ</label>
	                    </li>
	                    <p style="margin-top: 60px;">Số điện thoại
	                        <input type="text" value="123456789"></p>
	                    <p>Địa chỉ
	                        <input type="text" value="255 XLHN, Hiệp Phú, Q.9, TP.HCM"></p>
	                </div>
	            </div>
	            <div class="image-qcac">
	                <img src="<c:url value="/sourceinput/images/Lautuxuyen.png"/>">
	            </div>
	            </div>
	            <div class="accept-acount">
	                <button type="submit">Lưu</button>
	            </div>
        </div>
    </div>
    <jsp:include page="/WEB-INF/views/html/Trangchu/Footer.jsp" />
</body>
</html>
<style type="text/css">
	<%@include file="/WEB-INF/views/css/User/Editaccount.css" %>
</style>