package CNPM.Service.User;

import java.util.List;

import CNPM.Entity.*;

public interface ItfIndex {
	public int Save(Thucpham tp);
	
	public int Update(Thucpham tp);
	
	public Thucpham get(Integer id);
	
	public int Delete(Integer id);
	
	public List<Thucpham> list();
	
	public List<Loaisp> Menuloaisp();
	
	public List<Thucpham> getInfoTP(int id);
	
//	public String infoTP(int id);
}
