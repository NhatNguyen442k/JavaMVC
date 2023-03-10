<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản trị - Thông tin thực phẩm</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.1.1/css/all.css">
        <script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/html/Admin/Support/HeaderAdmin.jsp" />
	<jsp:include page="/WEB-INF/views/html/Admin/Support/chucnang.jsp" />
	<div class="index-thucpham"> 
			<jsp:include page="/WEB-INF/views/html/Admin/Support/labelthucpham.jsp" />
            <c:forEach var="listthucpham" items="${quantriindexthucpham}">
	            <div class="show-thucpham">
	                <div class="thucpham">	
	                    <div class="loaitp">
	                        <p>${listthucpham.loaisp }</p>
	                    </div>
	                    <div class="tentp">
	                        <p>${listthucpham.thucpham }</p>
	                    </div>
	                    <div class="imagetp">
	                        <img src="${listthucpham.images }">
	                    </div>
	                    <div class="timetp">
	                        <p>${listthucpham.date }</p>
	                    </div>
	                    <div class="moneytp">
	                        <p>${listthucpham.money }.000 VNĐ</p>
	                    </div>
	                    <div class="soluongtp">
	                        <p>${listthucpham.slot }</p>
	                    </div>
	                    <div class="infotp">
	                        <p>${listthucpham.info }</p>
	                    </div>
	                    <div class="controltp">
	                        <a href="DetailTP?id=${listthucpham.idtp }" style="text-decoration: none">
	                        <button type="submit" style="color: white;
	                        background: greenyellow;">Cập nhật</button></a>
	                        <a href="DeleteTP?id=${listthucpham.idtp }" style="text-decoration: none">
	                        <button type="submit" style="color: wheat;background: black;">Xóa</button></a>
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
                	<%@include file="/WEB-INF/views/js/Admin/PagenumberAD.js" %>
         </script>
        <jsp:include page="/WEB-INF/views/html/Admin/Support/FooterAdmin.jsp" />
</body>
</html>
<style type="text/css">
	<%@include file="/WEB-INF/views/css/Admin/QTthucpham.css" %>
</style>
