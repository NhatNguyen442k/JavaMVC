package CNPM.Service.User;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import CNPM.Dto.BillDetailDto;
import CNPM.Dto.BillDto;
import CNPM.Dto.GiohangDto;

public class BillServiceIpm implements ItfBill {

	
	private JdbcTemplate _jdbcsource;
	
	public BillServiceIpm(DataSource data) {
		this._jdbcsource = new JdbcTemplate(data);
	}
	
	@Override
	public int Addbill(BillDto bill) {
		String sql = "INSERT INTO donhang(Ngaydat,Ngaygiao,Note,Iduser) "
				+ "VALUES('"+LocalDate.now()+
				"','"+LocalDate.now()+"','"+bill.getNote()+"',"+bill.getiDuser()+")";
		return _jdbcsource.update(sql);
	}
 
	@Override
	public void AddbillDetail(HashMap<Long, GiohangDto> cart) {
		String sql1="SELECT MAX(IDdonhang) FROM donhang";
		int id = _jdbcsource.queryForObject(sql1, new Object[] {}, Integer.class);
		BillDetailDto bill = new BillDetailDto();
		String sql2="INSERT INTO chitietdonhang(IDdonhang,IDthucpham,Soluong,Gia) "
				+ "VALUES("+bill.getiDdonhang()+","+bill.getiDthucpham()+","
				+bill.getTongsl()+""+","+bill.getTongtien()+")";
		for(Map.Entry<Long, GiohangDto> item: cart.entrySet()) {
			BillDetailDto billDetail = new BillDetailDto();
			billDetail.setiDdonhang(1);
			billDetail.setiDthucpham(item.getValue().getTp().getiDthucpham());
			billDetail.setTongsl(item.getValue().getTongsl());
			billDetail.setTongtien(item.getValue().getTongtien());
			_jdbcsource.update(sql2, billDetail);
		}
	}




}
