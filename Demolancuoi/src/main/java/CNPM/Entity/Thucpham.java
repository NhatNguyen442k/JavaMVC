package CNPM.Entity;

import java.sql.Date;

public class Thucpham {
	private int iDthucpham;
	private String tenthucpham;
	private String thongtinmota;
	private int gia;
	private int soluongcon;
	private String hinhanh;
	private Date ngaycapnhat;
	private int iDloaisp;
	
	public Thucpham() {
		
	}
	public Thucpham(int iDthucpham, String tenthucpham, String thongtinmota, int gia, int soluongcon, String hinhanh,
			Date ngaycapnhat, int iDloaisp) {
		super();
		this.iDthucpham = iDthucpham;
		this.tenthucpham = tenthucpham;
		this.thongtinmota = thongtinmota;
		this.gia = gia;
		this.soluongcon = soluongcon;
		this.hinhanh = hinhanh;
		this.ngaycapnhat = ngaycapnhat;
		this.iDloaisp = iDloaisp;
	}
	public int getiDthucpham() {
		return iDthucpham;
	}
	public void setiDthucpham(int iDthucpham) {
		this.iDthucpham = iDthucpham;
	}
	public String getTenthucpham() {
		return tenthucpham;
	}
	public void setTenthucpham(String tenthucpham) {
		this.tenthucpham = tenthucpham;
	}
	public String getThongtinmota() {
		return thongtinmota;
	}
	public void setThongtinmota(String thongtinmota) {
		this.thongtinmota = thongtinmota;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getSoluongcon() {
		return soluongcon;
	}
	public void setSoluongcon(int soluongcon) {
		this.soluongcon = soluongcon;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	public Date getNgaycapnhat() {
		return ngaycapnhat;
	}
	public void setNgaycapnhat(Date ngaycapnhat) {
		this.ngaycapnhat = ngaycapnhat;
	}
	public int getiDloaisp() {
		return iDloaisp;
	}
	public void setiDloaisp(int iDloaisp) {
		this.iDloaisp = iDloaisp;
	}
	@Override
	public String toString() {
		return "Thucpham [iDthucpham=" + iDthucpham + ", tenthucpham=" + tenthucpham + ", thongtinmota=" + thongtinmota
				+ ", gia=" + gia + ", soluongcon=" + soluongcon + ", hinhanh=" + hinhanh + ", ngaycapnhat="
				+ ngaycapnhat + ", iDloaisp=" + iDloaisp + "]";
	}
	
	
	
	
}
