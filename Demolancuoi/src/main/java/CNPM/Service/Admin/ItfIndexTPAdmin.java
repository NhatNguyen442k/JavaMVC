package CNPM.Service.Admin;

import java.util.List;

import CNPM.Dto.AccountQTDto;
import CNPM.Dto.QTthucphamDto;
import CNPM.Entity.Loaisp;
import CNPM.Entity.Thucpham;

public interface ItfIndexTPAdmin {
	public List<QTthucphamDto> listthucpham();
	
	public int taomoithucpham(Thucpham qttp);
	
	public Thucpham Detailthucpham(Integer id);
	
	public int Editthucpham(Thucpham tp);
	
	public int Deletethucpham(Integer id);
}
