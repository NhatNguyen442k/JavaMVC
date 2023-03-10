package CNPM.Service.User;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import CNPM.Dto.GiohangDto;
import CNPM.Entity.Thucpham;

public class GiohangServiceIpm implements ItfGiohang {

	
	private JdbcTemplate _jdbcsource;
	@Autowired
	private IndexServiceIpm productDao;

	public GiohangServiceIpm(DataSource data) {
		this._jdbcsource = new JdbcTemplate(data);
	}
	@Override
	public Thucpham get(Integer id) {
		String sql = "SELECT * FROM thucpham WHERE IDthucpham=" +id;
		ResultSetExtractor<Thucpham> extt = new ResultSetExtractor<Thucpham>() {
			
			@Override
			public Thucpham extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					String name = rs.getString("Tenthucpham");
					String mota = rs.getString("Thongtin");
					int gia = rs.getInt("Gia");
					int sl = rs.getInt("Soluongcon");
					String img = rs.getString("Hinhanh");
					Date ngaycn = rs.getDate("Ngaycapnhat");
					int idloai = rs.getInt("IDloaisp");
					return new Thucpham(id,name,mota,gia,sl,img,ngaycn,idloai);
				}
				return null;
			}
		};
		return _jdbcsource.query(sql,extt);
	}
	@Override
	public HashMap<Long, GiohangDto> addCart(long id, HashMap<Long, GiohangDto> cart) {
		GiohangDto item = new GiohangDto();
		Thucpham tp = productDao.get((int)id);
		if(tp!=null && cart.containsKey(id)) {
			item = cart.get(id);
			item.setTongsl(item.getTongsl()+1);
			item.setTongtien(item.getTongsl()*item.getTp().getGia());
		}
		else {
			item.setTp(tp);
			item.setTongsl(1);
			item.setTongtien(tp.getGia());
		}
		cart.put((long) id, item);
		return cart;
	}
	
	@Override
	public HashMap<Long, GiohangDto> EditCart(long id,int tongsl, HashMap<Long, GiohangDto> cart) {
		if(cart == null) {
			return cart;
		}
		GiohangDto item = new GiohangDto();
		if(cart.containsKey(id)) {
			item = cart.get(id);
			item.setTongsl(tongsl);
			double totalmoney = tongsl * item.getTp().getGia();
			item.setTongtien(totalmoney);
		}
		
		cart.put((long) id, item);
		return cart;
	}
	
	@Override
	public HashMap<Long, GiohangDto> DeleteCart(long id, HashMap<Long, GiohangDto> cart) {
		if(cart == null) {
			return cart;
		}
		if(cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}
	
	@Override
	public int Tongsoluongsp(HashMap<Long, GiohangDto> cart) {
		int tongsp=0;
		for(Map.Entry<Long, GiohangDto> item: cart.entrySet()) {
			tongsp +=item.getValue().getTongsl();
		}
		return tongsp;
	}
	
	@Override
	public double Tongtiensp(HashMap<Long, GiohangDto> cart) {
		int tongtien=0;
		for(Map.Entry<Long, GiohangDto> item: cart.entrySet()) {
			tongtien +=item.getValue().getTongtien();
		}
		return tongtien;
	}
}
