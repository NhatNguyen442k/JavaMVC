package CNPM.Service.Admin;

import java.util.List;

import CNPM.Dto.AccountQTDto;
import CNPM.Entity.Role;

public interface ItfIndexACAdmin {
	public List<Role> listrole();
	
	public List<AccountQTDto> listaccountAdmin();
	
	public AccountQTDto DetailTaikhoan(Integer id);
	
	public int EditTaikhoan(AccountQTDto acdto);
	
	public int DeleteTaikhoan(Integer id);
}
