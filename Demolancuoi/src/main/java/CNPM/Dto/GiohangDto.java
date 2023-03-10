package CNPM.Dto;

import CNPM.Entity.Thucpham;

public class GiohangDto {
	private int tongsl;
	private double tongtien;
	private Thucpham tp;
	public GiohangDto() {

	}
	
	public GiohangDto(int tongsl, double tongtien, Thucpham tp) {
		this.tongsl = tongsl;
		this.tongtien = tongtien;
		this.tp = tp;
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
	public Thucpham getTp() {
		return tp;
	}
	public void setTp(Thucpham tp) {
		this.tp = tp;
	}
	
}
