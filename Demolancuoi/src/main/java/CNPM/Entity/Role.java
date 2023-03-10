package CNPM.Entity;

public class Role {
	private int iDrole;
	private String tenrole;
	
	
	public Role(int iDrole, String tenrole) {
		super();
		this.iDrole = iDrole;
		this.tenrole = tenrole;
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
	
}
