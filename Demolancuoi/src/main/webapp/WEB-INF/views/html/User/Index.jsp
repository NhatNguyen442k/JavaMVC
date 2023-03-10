<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index - Danh sách thực phẩm</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.1.1/css/all.css">
<script src="https://code.jquery.com/jquery-3.6.3.js" crossorigin="anonymous"></script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/html/Trangchu/Header.jsp" />
	<jsp:include page="/WEB-INF/views/html/Trangchu/Dropmenu.jsp" />
	<div class="slideshow">
            <div class="dieuhuong">
                <i class="fa fa-chevron-circle-left" onclick="Preview()"></i>
                <i class="fa fa-chevron-circle-right" onclick="Next()"></i>
            </div>
            <div class="chuyen-slide">
                <img src="https://lauwang.vn/wp-content/uploads/2023/02/silde-web-thang-1-scaled.jpg">
                <img src="https://jianghu.com.vn/wp-content/uploads/2020/12/banner-footer1.jpg">
                <img src="https://lauwang.vn/wp-content/uploads/2022/08/DSCF5299-Edit-1-scaled-700x500.jpg">
            </div>
            <script type="text/javascript">
                	<%@include file="/WEB-INF/views/js/User/SlideShow.js" %>
            </script>
     </div>
     <div class="thongtinindex">
            <div class="index-rol-1">
                <ul class="dropdown">
                	<c:forEach var="menuloaisp" items="${indexmenuloaisp}">
	                    <li class="btndropdown"><button class="menu">${menuloaisp.tenloaisp }</button>
	                    <ul>
	                    	<c:forEach var="itemtpmenu" items="${indextphome}">
	                    		<c:if test="${itemtpmenu.iDloaisp == menuloaisp.iDloaisp}">
		                        	<li><a href="#">${itemtpmenu.tenthucpham }</a></li>
		                        </c:if>
	                        </c:forEach>
	                    </ul>
	                    </li>
                    </c:forEach>
                </ul>
                <script type="text/javascript">
                	<%@include file="/WEB-INF/views/js/User/Index.js" %>
            </script>
       		</div>
       		<div class="index-rol-2">
                <c:forEach var="itemtp" items="${indextphome}">
                	<a href="Detail?id=${itemtp.iDthucpham }"/>
	                	<div class="index-sp">
	                		<img src="${itemtp.hinhanh }">
	                		<label>${itemtp.tenthucpham }</label>
	                		<c:if test="${itemtp.iDloaisp != 1 }">
	                			<label>${itemtp.gia }.000 VNĐ</label>
	                		</c:if>
	                		<c:if test="${itemtp.iDloaisp == 1 }">
	                			<label style="opacity:0%">${itemtp.iDthucpham } VNĐ</label>
	                		</c:if>
	                	</div>
	                </a>
                </c:forEach>
            </div>
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
                	<%@include file="/WEB-INF/views/js/User/Pagenumber.js" %>
         </script>
        <jsp:include page="/WEB-INF/views/html/Trangchu/Footer.jsp" />
</body>
</html>
<style type="text/css">
	<%@include file="/WEB-INF/views/css/Trangchu/SlideShow.css" %>	
	<%@include file="/WEB-INF/views/css/User/Index.css" %>
</style>