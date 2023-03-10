package CNPM.Entity;

import java.sql.Date;

public class Donhang {
	private int iDdonhang;
	private Date ngaydat;
	private Date ngaygiao;
	private int iDuser;
	
	public Donhang() {
		
	}

	public Donhang(int iDdonhang, Date ngaydat, Date ngaygiao, int iDuser) {
		super();
		this.iDdonhang = iDdonhang;
		this.ngaydat = ngaydat;
		this.ngaygiao = ngaygiao;
		this.iDuser = iDuser;
	}

	public int getiDdonhang() {
		return iDdonhang;
	}

	public void setiDdonhang(int iDdonhang) {
		this.iDdonhang = iDdonhang;
	}

	public Date getNgaydat() {
		return ngaydat;
	}

	public void setNgaydat(Date ngaydat) {
		this.ngaydat = ngaydat;
	}

	public Date getNgaygiao() {
		return ngaygiao;
	}

	public void setNgaygiao(Date ngaygiao) {
		this.ngaygiao = ngaygiao;
	}

	public int getiDuser() {
		return iDuser;
	}

	public void setiDuser(int iDuser) {
		this.iDuser = iDuser;
	}
	
}
