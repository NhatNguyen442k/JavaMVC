<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản trị - Chỉnh sửa thực phẩm</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.1.1/css/all.css">
</head>
<body>
	<jsp:include page="/WEB-INF/views/html/Admin/Support/HeaderAdmin.jsp" />
	<jsp:include page="/WEB-INF/views/html/Admin/Support/chucnang.jsp" />
	
	<div class="edit-thucpham">
		<form:form action="edittp" method="post" modelAttribute="findthucpham">
	        <div class="edit">
	            <div class="left-edit">
	                <p style="font-size: 25px;text-align: center;margin-top: 5px;">Thông tin thực phẩm</p>
	                <form:hidden path="iDthucpham"/>
	                <p>Loại thực phẩm:
	                	<form:select path="iDloaisp" style="width: 60%;font-size: 16px;float: right;margin-right: 50px;">
		                	<c:forEach var="itemloaisp" items="${ selectloaisp}">
			                	<form:option value="${itemloaisp.iDloaisp }" label="${itemloaisp.tenloaisp }"/>  
			                </c:forEach>
		                </form:select></p>
	                <p>Tên thực phẩm:
	                    <form:input type="text" path="tenthucpham" /></p>
	                <p>Giá:
	                    <form:input type="text" path="gia" style="width: 40%;margin-right: 154px;"/></p>
	                <p>Số lượng còn:
	                    <input type="number" path="soluongcon" min="0" value="0" 
	                    style="width: 12%;text-align: center;margin-right: 300px;"/></p>
	                <p>Thông tin thực phẩm:
	                    <form:textarea name="" path="thongtinmota"/></textarea>
	                </p>
	                <p style="margin-top: 98px;">Ngày cập nhật:
	                    <form:input type="date"  path="ngaycapnhat" min="1900-01-01" max="2023/03/04"
	                    style="width: 25%; margin-right: 230px;"/>
	                </p>
	            </div>
	            <div class="right-edit">
	                <p>Hình ảnh minh họa</p>
	                <img id="upload-img" >
	                <form:input type="file" path="hinhanh"
	                accept="image/*" id="image-input" onchange="showPreview(event);"/>
	            </div>
	            <script type="text/javascript">
                	<%@include file="/WEB-INF/views/js/Admin/Uploadfile.js" %>
         		</script>
	            <button type="submit" value="Edittp" style="font-size: 20px;
	            margin-top: 30px;margin-left: 440px;border-radius: 2px;border: 1px solid black;
	            background: black;color: white;">EDIT THỰC PHẨM</button>
	        </div>
        </form:form>
    </div>
    <jsp:include page="/WEB-INF/views/html/Admin/Support/FooterAdmin.jsp" />
</body>
</html>
<style type="text/css">
	<%@include file="/WEB-INF/views/css/Admin/EditQTthucpham.css" %>
</style>