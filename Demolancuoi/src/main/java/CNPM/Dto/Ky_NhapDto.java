package CNPM.Dto;

public class Ky_NhapDto {
	private int iDrole;
	private String taikhoan;
	private String matkhau;
	private int iDuser;
	private String tenkhach;
	private String gioitinh;
	private int sdt;
	private String diachi;
	
	public Ky_NhapDto() {
		
	}

	public Ky_NhapDto(int iDrole, String taikhoan, String matkhau, int iDuser, String tenkhach, String gioitinh,
			int sdt, String diachi) {
		super();
		this.iDrole = iDrole;
		this.taikhoan = taikhoan;
		this.matkhau = matkhau;
		this.iDuser = iDuser;
		this.tenkhach = tenkhach;
		this.gioitinh = gioitinh;
		this.sdt = sdt;
		this.diachi = diachi;
	}

	public int getiDrole() {
		return iDrole;
	}

	public void setiDrole(int iDrole) {
		this.iDrole = iDrole;
	}

	public String getTaikhoan() {
		return taikhoan;
	}

	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public int getiDuser() {
		return iDuser;
	}

	public void setiDuser(int iDuser) {
		this.iDuser = iDuser;
	}

	public String getTenkhach() {
		return tenkhach;
	}

	public void setTenkhach(String tenkhach) {
		this.tenkhach = tenkhach;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	
}
