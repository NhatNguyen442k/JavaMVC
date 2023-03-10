<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản trị - Thông tin tài khoản</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.1.1/css/all.css">
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/html/Admin/Support/HeaderAdmin.jsp" />
	<jsp:include page="/WEB-INF/views/html/Admin/Support/chucnang.jsp" />
	<div class="index-taikhoan">
		<jsp:include page="/WEB-INF/views/html/Admin/Support/labelaccount.jsp" />
		<c:forEach var="accountitem" items="${accountquantri }">
			<div class="show-taikhoan">
	            <div class="taikhoan">
	                <div class="indexrole">
	                    <p>${accountitem.tenrole}</p>
	                </div>
	                <div class="indexaccount">
	                    <p>${accountitem.taikhoan}</p>
	                </div>
	                <div class="indexpass">
	                    <p>${accountitem.matkhau}</p>
	                </div>
	                <div class="indexhoten">
	                    <p>${accountitem.tenkhach}</p>
	                </div>
	                <div class="indexgioitinh">
	                    <p>${accountitem.gioitinh}</p>
	                </div>
	                <div class="indexphone">
	                    <p>${accountitem.sdt}</p>
	                </div>
	                <div class="indexaddress">
	                    <p>${accountitem.diachi}</p>
	                </div>
	                <div class="controltk">
	                    <a href="Thongtin?id=${accountitem.iDuser }" style="text-decoration: none">
	                    <button type="submit" style="color: white;background: 
	                    greenyellow;">Cập nhật</button></a>
	                    <a href="Deletetaikhoan?id=${accountitem.iDuser }" style="text-decoration: none">
	                    <button type="submit" style="color: wheat;background: black;
	                    ">Xóa</button></a>
	                </div>
	            </div>
	         </div>
	     </c:forEach>
	</div>
	<div class="pagination">
        <li class="btn-prev btn-active fas fa-angle-left"></li>
        <div class="numberpage">
            <li class="active">1</li>
            <li>2</li>
            <li>3</li>
        </div>
        <li class="btn-next fas fa-angle-right"></li>
    </div>
    <script type="text/javascript">
                	<%@include file="/WEB-INF/views/js/Admin/PagenumberAC.js" %>
    </script>
    <jsp:include page="/WEB-INF/views/html/Admin/Support/FooterAdmin.jsp" />
</body>
</html>
<style type="text/css">
	<%@include file="/WEB-INF/views/css/Admin/QTaccount.css" %>
</style>