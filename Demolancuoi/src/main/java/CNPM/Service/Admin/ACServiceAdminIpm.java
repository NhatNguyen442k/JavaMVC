package CNPM.Service.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import CNPM.Dto.AccountQTDto;
import CNPM.Entity.Khachhang;
import CNPM.Entity.Role;



public class ACServiceAdminIpm implements ItfIndexACAdmin {

	private JdbcTemplate _jdbcsource;
	
	public ACServiceAdminIpm(DataSource data) {
		this._jdbcsource = new JdbcTemplate(data);
	}
	
	@Override
	public List<AccountQTDto> listaccountAdmin() {
		String sql = "SELECT * FROM role AS a, khachhang AS b "
				+ "WHERE a.IDrole = b.IDrole ORDER BY a.IDrole";
		RowMapper<AccountQTDto> rowmp = new RowMapper<AccountQTDto>() {

			@Override
			public AccountQTDto mapRow(ResultSet rs, int rowNum) throws SQLException {
					int idr = rs.getInt("IDrole");
					String tenr = rs.getString("Tenrole");
					int ids = rs.getInt("IDuser");
					String tk = rs.getString("Taikhoan");
					String mk = rs.getString("Matkhau");
					String ten = rs.getString("Tenkhach");
					String gt = rs.getString("Gioitinh");
					int sdt = rs.getInt("SDT");
					String dc = rs.getString("Diachi");
					return new AccountQTDto(ids, tk, mk, ten, gt, sdt, dc,idr,tenr);
			}
			
		};
		return _jdbcsource.query(sql, rowmp);
	}

	@Override
	public AccountQTDto DetailTaikhoan(Integer id) {
		String sql = "SELECT * FROM role AS a, khachhang AS b "
				+ "WHERE a.IDrole = b.IDrole AND IDuser="+id
				+ " ORDER BY a.IDrole ";
		ResultSetExtractor<AccountQTDto> rseac = new ResultSetExtractor<AccountQTDto>() {
			
			@Override
			public AccountQTDto extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					int idr = rs.getInt("IDrole");
					String tenr = rs.getString("Tenrole");
					int ids = rs.getInt("IDuser");
					String tk = rs.getString("Taikhoan");
					String mk = rs.getString("Matkhau");
					String ten = rs.getString("Tenkhach");
					String gt = rs.getString("Gioitinh");
					int sdt = rs.getInt("SDT");
					String dc = rs.getString("Diachi");
					return new AccountQTDto(ids, tk, mk, ten, gt, sdt, dc,idr,tenr);
				}
				return null;
			}
		};
		return _jdbcsource.query(sql, rseac);
	}

	@Override
	public int EditTaikhoan(AccountQTDto acdto) {
		String sql ="UPDATE khachhang SET IDrole ="+acdto.getiDrole()
				+ " WHERE IDuser = "+acdto.getiDuser();
		return _jdbcsource.update(sql);
	}

	@Override
	public int DeleteTaikhoan(Integer id) {
		String sql = "DELETE FROM khachhang WHERE IDuser="+id;
		return _jdbcsource.update(sql);
	}

	@Override
	public List<Role> listrole() {
		String sql ="SELECT * FROM role";
		RowMapper<Role> rmp = new RowMapper<Role>() {
			
			@Override
			public Role mapRow(ResultSet rs, int rowNum) throws SQLException {
				if(rs.next()) {
					int id = rs.getInt("IDrole");
					String ten = rs.getString("Tenrole");
					return new Role(id,ten);
				}
				return null;
			}
		};
		return _jdbcsource.query(sql,rmp);
	}


}
