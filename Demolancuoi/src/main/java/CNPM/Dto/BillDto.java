package CNPM.Dto;

public class BillDto {
	private int idDonhang;
	private String taikhoan;
	private String tenkhach;
	private int sdt;
	private String diachi;
	private int tongsl;
	private int tongtien;
	private String note;
	private int iDuser;
	public BillDto() {
		
	}
	public BillDto(int idDonhang) {
		this.idDonhang=idDonhang;
	}
	public BillDto(int idDonhang, String taikhoan, String tenkhach, int sdt, String diachi,
			int tongsl, int tongtien, String note,int iDuser) {
		super();
		this.idDonhang = idDonhang;
		this.taikhoan = taikhoan;
		this.tenkhach = tenkhach;
		this.sdt = sdt;
		this.diachi = diachi;
		this.tongsl = tongsl;
		this.tongtien = tongtien;
		this.note = note;
		this.iDuser =iDuser;
	}
	
	public int getiDuser() {
		return iDuser;
	}
	public void setiDuser(int iDuser) {
		this.iDuser = iDuser;
	}
	public int getIdDonhang() {
		return idDonhang;
	}
	public void setIdDonhang(int idDonhang) {
		this.idDonhang = idDonhang;
	}
	public String getTaikhoan() {
		return taikhoan;
	}
	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}
	public String getTenkhach() {
		return tenkhach;
	}
	public void setTenkhach(String tenkhach) {
		this.tenkhach = tenkhach;
	}
	public int getSdt() {
		return sdt;
	}
	public int setSdt(int sdt) {
		return sdt;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getTongsl() {
		return tongsl;
	}
	public void setTongsl(int tongsl) {
		this.tongsl = tongsl;
	}
	public int getTongtien() {
		return tongtien;
	}
	public void setTongtien(int tongtien) {
		this.tongtien = tongtien;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	

}
