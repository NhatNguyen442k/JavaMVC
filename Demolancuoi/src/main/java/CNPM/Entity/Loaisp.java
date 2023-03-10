package CNPM.Entity;

public class Loaisp {
	private int iDloaisp;
	private String tenloaisp;
	public Loaisp(int iDloaisp, String tenloaisp) {
		super();
		this.iDloaisp = iDloaisp;
		this.tenloaisp = tenloaisp;
	}
	public int getiDloaisp() {
		return iDloaisp;
	}
	public void setiDloaisp(int iDloaisp) {
		this.iDloaisp = iDloaisp;
	}
	public String getTenloaisp() {
		return tenloaisp;
	}
	public void setTenloaisp(String tenloaisp) {
		this.tenloaisp = tenloaisp;
	}
}
