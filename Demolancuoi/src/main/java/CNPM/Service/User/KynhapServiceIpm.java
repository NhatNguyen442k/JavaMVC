package CNPM.Service.User;

import java.sql.*;
import java.sql.Date;
import java.util.*;

import javax.sql.DataSource;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import CNPM.Dto.AccountQTDto;
import CNPM.Entity.Khachhang;
import CNPM.Entity.Thucpham;

public class KynhapServiceIpm implements ItfKynhap {

	private JdbcTemplate _jdbcsource;

	public KynhapServiceIpm(DataSource data) {
		this._jdbcsource = new JdbcTemplate(data);
	}

	@Override
	public int Addtaikhoan(Khachhang user) {
		user.setMatkhau(BCrypt.hashpw(user.getMatkhau(), BCrypt.gensalt(12)));
		String sql = "INSERT INTO khachhang(Taikhoan,Matkhau,Tenkhach,Gioitinh,SDT,Diachi,IDrole)"
				+ "VALUES('"+user.getTaikhoan()+"','"+user.getMatkhau()+"','"+user.getTenkhach()
				+"','"+user.getGioitinh()+"','"+user.getSdt()+"','"+user.getDiachi()+"',2)";
		return _jdbcsource.update(sql);
	}

	@Override
	public Khachhang Checktaikhoan(Khachhang user) {
		String pass = user.getMatkhau();
		String sql = "SELECT * FROM khachhang WHERE Taikhoan='"+user.getTaikhoan()+"'";
		RowMapper<Khachhang> rowmp = new RowMapper<Khachhang>() {
			
			@Override
			public Khachhang mapRow(ResultSet rs, int rowNum) throws SQLException {
				int idr = rs.getInt("IDrole");
				int ids = rs.getInt("IDuser");
				String tk = rs.getString("Taikhoan");
				String mk = rs.getString("Matkhau");
				String ten = rs.getString("Tenkhach");
				String gt = rs.getString("Gioitinh");
				int sdt = rs.getInt("SDT");
				String dc = rs.getString("Diachi");
				return new Khachhang(ids, tk, mk, ten, gt, sdt, dc,idr);
			}
		};
		user =_jdbcsource.queryForObject(sql, rowmp);
		if(user != null) {
			if(BCrypt.checkpw(pass, user.getMatkhau())) {
				return user;
			}
			else {
				return null;
			}
		}
		return null;
	}


}
