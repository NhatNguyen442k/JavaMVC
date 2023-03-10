package CNPM.Service.User;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import CNPM.Entity.*;

public class IndexServiceIpm implements ItfIndex {
	
	private JdbcTemplate _jdbcsource;

	public IndexServiceIpm(DataSource data) {
		this._jdbcsource = new JdbcTemplate(data);
	}

	@Override
	public int Save(Thucpham tp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Update(Thucpham tp) {
		// TODO Auto-generated method stub
		return 0;
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
	public int Delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Thucpham> list() {
		String sql = "SELECT * FROM thucpham";
		RowMapper<Thucpham> rowmp = new RowMapper<Thucpham>() {
			
			@Override
			public Thucpham mapRow(ResultSet rs, int rowNum) throws SQLException {
				int IDthucpham = rs.getInt("IDthucpham");
				String Tenthucpham = rs.getString("Tenthucpham");
				String Thongtin = rs.getString("Thongtin");
				int Gia = rs.getInt("Gia");
				int Soluongcon = rs.getInt("Soluongcon");
				String Hinhanh = rs.getString("Hinhanh");
				Date Ngaycapnhat = rs.getDate("Ngaycapnhat");
				int IDloaisp = rs.getInt("IDloaisp");
				return new Thucpham(IDthucpham,Tenthucpham,Thongtin
						,Gia,Soluongcon,Hinhanh,Ngaycapnhat,IDloaisp);
			}
		};
		return _jdbcsource.query(sql, rowmp);
	}

	
	
	@Override
	public List<Loaisp> Menuloaisp(){
		String sql = "SELECT * FROM loaisp";
		RowMapper<Loaisp> rowmp = new RowMapper<Loaisp>() {
			
			@Override
			public Loaisp mapRow(ResultSet rs, int rowNum) throws SQLException {
				int IDloaisp = rs.getInt("IDloaisp");
				String Tenloaisp = rs.getString("Tenloaisp");
				return new Loaisp(IDloaisp,Tenloaisp);
			}
		};
		return _jdbcsource.query(sql, rowmp);
	}
	
	@Override
	public List<Thucpham> getInfoTP(int id){
		String sql = "SELECT * FROM thucpham WHERE" +id;
		RowMapper<Thucpham> rowmp = new RowMapper<Thucpham>() {
			@Override
			public Thucpham mapRow(ResultSet rs, int rowNum) throws SQLException {
				int IDthucpham = rs.getInt("IDthucpham");
				String Tenthucpham = rs.getString("Tenthucpham");
				String Thongtin = rs.getString("Thongtin");
				int Gia = rs.getInt("Gia");
				int Soluongcon = rs.getInt("Soluongcon");
				String Hinhanh = rs.getString("Hinhanh");
				Date Ngaycapnhat = rs.getDate("Ngaycapnhat");
				int IDloaisp = rs.getInt("IDloaisp");
				return new Thucpham(IDthucpham,Tenthucpham,Thongtin
						,Gia,Soluongcon,Hinhanh,Ngaycapnhat,IDloaisp);
			}
		};
		return _jdbcsource.query(sql, rowmp);
	}
	
}
