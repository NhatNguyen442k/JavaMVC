<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dropdown - Menu</title>
</head>
<body>
	<div class="menus">
            <div class="dropdowntc">
                <button class="btndropdowntc">
                <a href="Trangchu" style="text-decoration: none;color:black">Trang Chủ</a></button>
            </div>
            <div class="dropdowntc">
                <button type="submit" class="btndropdowntc">
                <a href="Index" style="text-decoration: none;color:black">Thực đơn</a></button>
            </div>
            <div class="dropdowntc">
                <button class="btndropdowntc">Giới thiệu</button>
            </div>
            <div class="dropdowntc">
                <button class="btndropdowntc">Liên hệ</button>
            </div>
            <div class="dropdowntc">
            </div>
            <div class="dropdowntc">
                <button class="btndropdowntc">Đóng góp</button>
            </div>
     </div>	
</body>
</html>
<style>
.menus{
    max-width: auto;
    min-height: 60px;
    margin: auto;
    margin-top: 10px;
    padding-left: 25px;
    padding-right: 25px;
    /* border: 1px solid red ; */
    text-align: center;
}


.dropdowntc {
    position: relative;
    display: inline-block;
    text-align: left;
  }

.btndropdowntc {
    background-color: transparent;
    color: black;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
    width: 150px;
}

  
  
.dropdowntc:hover .btndropdowntc {
    background-color: transparent;
    color: aqua;
    font-size: 18px;
    transition: all 1s;
}
</style>