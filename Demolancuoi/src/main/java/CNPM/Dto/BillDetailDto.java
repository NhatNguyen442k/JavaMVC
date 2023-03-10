package CNPM.Dto;

public class BillDetailDto {
	private int iDdonhang;
	private int iDthucpham;
	private int tongsl;
	private double tongtien;
	public BillDetailDto() {
		super();
	}
	public BillDetailDto(int iDdonhang, int iDthucpham, int tongsl, double tongtien) {
		super();
		this.iDdonhang = iDdonhang;
		this.iDthucpham = iDthucpham;
		this.tongsl = tongsl;
		this.tongtien = tongtien;
	}
	public int getiDdonhang() {
		return iDdonhang;
	}
	public void setiDdonhang(int iDdonhang) {
		this.iDdonhang = iDdonhang;
	}
	public int getiDthucpham() {
		return iDthucpham;
	}
	public void setiDthucpham(int iDthucpham) {
		this.iDthucpham = iDthucpham;
	}
	public int getTongsl() {
		return tongsl;
	}
	public void setTongsl(int tongsl) {
		this.tongsl = tongsl;
	}
	public double getTongtien() {
		return tongtien;
	}
	public void setTongtien(double tongtien) {
		this.tongtien = tongtien;
	}
	
}
