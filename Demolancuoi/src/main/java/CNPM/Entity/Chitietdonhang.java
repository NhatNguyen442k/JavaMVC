package CNPM.Entity;

public class Chitietdonhang {
	private int iDthucpham;
	private int iDdonhang;
	private int iDuser;
	private int soluong;
	private double gia;
	public Chitietdonhang() {

	}
	public Chitietdonhang(int iDthucpham, int iDdonhang,int iDuser, int soluong, double gia) {
		super();
		this.iDthucpham = iDthucpham;
		this.iDdonhang = iDdonhang;
		this.iDuser = iDuser;
		this.soluong = soluong;
		this.gia = gia;
	}
	public Chitietdonhang(int iDthucpham, int iDdonhang, int soluong, double gia) {
		super();
		this.iDthucpham = iDthucpham;
		this.iDdonhang = iDdonhang;
		this.soluong = soluong;
		this.gia = gia;
	}
	public int getiDthucpham() {
		return iDthucpham;
	}
	public void setiDthucpham(int iDthucpham) {
		this.iDthucpham = iDthucpham;
	}
	public int getiDdonhang() {
		return iDdonhang;
	}
	public void setiDdonhang(int iDdonhang) {
		this.iDdonhang = iDdonhang;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public int getiDuser() {
		return iDuser;
	}
	public void setiDuser(int iDuser) {
		this.iDuser = iDuser;
	}
}
