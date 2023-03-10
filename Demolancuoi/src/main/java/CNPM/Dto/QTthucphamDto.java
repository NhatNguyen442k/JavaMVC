package CNPM.Dto;

import java.sql.Date;

public class QTthucphamDto {
	private int iDl;
	private String loaisp;
	private int idtp;
	private String thucpham;
	private String images;
	private Date date;
	private int money;
	private int slot;
	private String info;
	public QTthucphamDto() {

	}
	public QTthucphamDto(int iDl,int idtp, String loaisp, String thucpham, String images, Date date, int money, int slot,
			String info) {
		super();
		this.iDl = iDl;
		this.idtp = idtp;
		this.loaisp = loaisp;
		this.thucpham = thucpham;
		this.images = images;
		this.date = date;
		this.money = money;
		this.slot = slot;
		this.info = info;
	}
	public int getiDl() {
		return iDl;
	}
	public void setiDl(int iDl) {
		this.iDl = iDl;
	}
	public String getLoaisp() {
		return loaisp;
	}
	public void setLoaisp(String loaisp) {
		this.loaisp = loaisp;
	}
	public String getThucpham() {
		return thucpham;
	}
	public void setThucpham(String thucpham) {
		this.thucpham = thucpham;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getSlot() {
		return slot;
	}
	public void setSlot(int slot) {
		this.slot = slot;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getIdtp() {
		return idtp;
	}
	public void setIdtp(int idtp) {
		this.idtp = idtp;
	}
	
}
