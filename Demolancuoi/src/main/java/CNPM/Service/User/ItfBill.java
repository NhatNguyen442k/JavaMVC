package CNPM.Service.User;

import java.util.HashMap;

import CNPM.Dto.BillDto;
import CNPM.Dto.GiohangDto;

public interface ItfBill {
	
	public int Addbill(BillDto bill);
	
	public void AddbillDetail(HashMap<Long, GiohangDto> cart);
}
