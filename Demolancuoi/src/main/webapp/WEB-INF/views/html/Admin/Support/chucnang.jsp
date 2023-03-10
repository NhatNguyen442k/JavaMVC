<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Button chức năng - ADmin</title>
</head>
<body>
	<div class="menu">
        <div class="dropdown">
            <form action="http://localhost:8015/Demolancuoi/Admin/QT-IndexAC">
                <button type="submit" class="btndropdown">Tài khoản</button>
            </form>
        </div>
        <div class="dropdown">
            <form action="http://localhost:8015/Demolancuoi/Admin/QT-IndexTP">
                <button class="btndropdown">Thực phẩm</button>
            </form>
        </div>
        <div class="dropdown">
            <form action="http://localhost:8015/Demolancuoi/Admin/QT-InsertTP">
                <button class="btndropdown">Thêm thực phẩm</button>
            </form>
        </div>
        <div class="dropdown">
        </div>
        <div class="dropdown">
            <button class="btndropdown">Đóng góp</button>
        </div>
    </div>
</body>
</html>
<style type="text/css">
  <%@include file="/WEB-INF/views/css/Admin/Support/chucnang.css" %>
</style>