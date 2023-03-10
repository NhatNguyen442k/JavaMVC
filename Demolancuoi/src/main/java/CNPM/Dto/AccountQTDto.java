package CNPM.Dto;

public class AccountQTDto {
	private int iDuser;
	private String taikhoan;
	private String matkhau;
	private String tenkhach;
	private String gioitinh;
	private int sdt;
	private String diachi;
	private int iDrole;
	private String tenrole;
	public AccountQTDto() {
		
	}
	public AccountQTDto(int iDuser, String taikhoan, String matkhau, String tenkhach, String gioitinh, int sdt,
			String diachi, int iDrole, String tenrole) {
		super();
		this.iDuser = iDuser;
		this.taikhoan = taikhoan;
		this.matkhau = matkhau;
		this.tenkhach = tenkhach;
		this.gioitinh = gioitinh;
		this.sdt = sdt;
		this.diachi = diachi;
		this.iDrole = iDrole;
		this.tenrole = tenrole;
	}
	public int getiDuser() {
		return iDuser;
	}
	public void setiDuser(int iDuser) {
		this.iDuser = iDuser;
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
	public int getiDrole() {
		return iDrole;
	}
	public void setiDrole(int iDrole) {
		this.iDrole = iDrole;
	}
	public String getTenrole() {
		return tenrole;
	}
	public void setTenrole(String tenrole) {
		this.tenrole = tenrole;
	}
	@Override
	public String toString() {
		return "AccountQTDto [iDuser=" + iDuser + ", taikhoan=" + taikhoan + ", matkhau=" + matkhau + ", tenkhach="
				+ tenkhach + ", gioitinh=" + gioitinh + ", sdt=" + sdt + ", diachi=" + diachi + ", iDrole=" + iDrole
				+ ", tenrole=" + tenrole + "]";
	}
	
	
}
