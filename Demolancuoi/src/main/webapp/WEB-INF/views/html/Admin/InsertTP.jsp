<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm thực phẩm - Admin</title>
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
	<jsp:include page="/WEB-INF/views/html/Admin/Support/HeaderAdmin.jsp" />
	<jsp:include page="/WEB-INF/views/html/Admin/Support/chucnang.jsp" />
	<div class="insert-thucpham">
		<form:form action="them" method="post" modelAttribute="themtp">
	        <div class="insert">
	            <div class="left-insert">
	                <p style="font-size: 25px;text-align: center;margin-top: 5px;">Thông tin thực phẩm</p>
	                <p>Loại thực phẩm:
	                	<form:select path="iDloaisp" style="width: 60%;font-size: 16px;float: right;margin-right: 50px;">
		                	<c:forEach var="itemloaisp" items="${ loaisplist}">
		                		<form:option value="${itemloaisp.iDloaisp }" label="${itemloaisp.tenloaisp }"/>  
		                	</c:forEach>
	                	</form:select></p>
	                <p>Tên thực phẩm:
	                	<form:input type="text" path="tenthucpham"  placeholder="Nhập tên thực phẩm"/></p>
	                <p>Giá:
	                	<form:input type="text" path="gia"  placeholder="Nhập giá tiền" style="width: 40%;margin-right: 154px;"/></p>
	                <p>Số lượng còn:
	                	<form:input type="number" path="soluongcon"  min="0" value="0" style="width: 12%;text-align: center;margin-right: 300px;"/></p>
	                <p>Thông tin thực phẩm:
	                	<form:textarea path="thongtinmota"/>
	                </p>
	                <p style="margin-top: 98px;">Ngày cập nhật:
	                	<form:input path="ngaycapnhat" type="date" min="1900-01-01" max="2023/03/04"
	                	style="width: 25%; margin-right: 230px;"/>
	                </p>
	            </div>
	            <div class="right-insert">
	                <p>Hình ảnh minh họa</p>
	                <img id="upload-img" >
	                <form:input type="file" path="hinhanh"
	                 accept="image/*" id="image-input" onchange="showPreview(event);"/>
	            </div>	
	            <button type="submit" style="font-size: 20px;
	            margin-top: 30px;margin-left: 440px;border-radius: 2px;border: 1px solid black;
	            background: black;color: white;">CREATE MENU</button>
	        </div>
        </form:form>
    </div>
    <script type="text/javascript">
                	<%@include file="/WEB-INF/views/js/Admin/Uploadfile.js" %>
         </script>
    <jsp:include page="/WEB-INF/views/html/Admin/Support/FooterAdmin.jsp" />
</body>
</html>
<style type="text/css">
	<%@include file="/WEB-INF/views/css/Admin/InsertTP.css" %>
</style>