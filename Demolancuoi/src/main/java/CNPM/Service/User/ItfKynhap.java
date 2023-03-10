package CNPM.Service.User;

import java.util.List;

import CNPM.Entity.Khachhang;

public interface ItfKynhap {
	public int Addtaikhoan(Khachhang user);
	
	public Khachhang Checktaikhoan(Khachhang user);
}
