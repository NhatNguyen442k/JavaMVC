package CNPM.Service.User;

import java.util.HashMap;

import CNPM.Dto.GiohangDto;
import CNPM.Entity.Thucpham;

public interface ItfGiohang {
	public HashMap<Long, GiohangDto> addCart(long id, HashMap<Long,GiohangDto> cart);

	public Thucpham get(Integer id);


	public HashMap<Long, GiohangDto> EditCart(long id, int tongsl, HashMap<Long, GiohangDto> cart);

	public HashMap<Long, GiohangDto> DeleteCart(long id, HashMap<Long, GiohangDto> cart);

	public int Tongsoluongsp(HashMap<Long, GiohangDto> cart);

	public double Tongtiensp(HashMap<Long, GiohangDto> cart);
}
  