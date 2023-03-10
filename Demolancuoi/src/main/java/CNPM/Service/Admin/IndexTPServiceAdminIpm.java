package CNPM.Service.Admin;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import CNPM.Dto.AccountQTDto;
import CNPM.Dto.QTthucphamDto;
import CNPM.Entity.Loaisp;
import CNPM.Entity.Thucpham;

public class IndexTPServiceAdminIpm implements ItfIndexTPAdmin {

	private JdbcTemplate _jdbcsource;

	public IndexTPServiceAdminIpm(DataSource data) {
		this._jdbcsource = new JdbcTemplate(data);
	}
	
	@Override
	public List<QTthucphamDto> listthucpham() {
		String sql= "SELECT * FROM loaisp AS b, thucpham AS a "
				+ "WHERE a.IDloaisp = b.IDloaisp ORDER BY b.IDloaisp";
		RowMapper<QTthucphamDto> rowmp = new RowMapper<QTthucphamDto>() {
				
				@Override
				public QTthucphamDto mapRow(ResultSet rs, int rowNum) throws SQLException {
						int idlsp = rs.getInt("IDloaisp");
						int idtp = rs.getInt("IDthucpham");
						String loaisp = rs.getString("Tenloaisp");
						String thucpham = rs.getString("Tenthucpham");
						String info = rs.getString("Thongtin");
						int money= rs.getInt("Gia");
						int slot = rs.getInt("Soluongcon");
						String images = rs.getString("Hinhanh");
						Date date = rs.getDate("Ngaycapnhat");
						return new QTthucphamDto(idlsp,idtp,loaisp,thucpham,images,date,money,slot,info);
				}	
		};
		return _jdbcsource.query(sql, rowmp);
	}

	@Override
	public int taomoithucpham(Thucpham qttp) {
		String sql ="INSERT INTO thucpham(Tenthucpham,Thongtin,Gia,Soluongcon,Hinhanh,Ngaycapnhat,IDloaisp) "
				+ "VALUES('"+qttp.getTenthucpham()+"','"+qttp.getThongtinmota()+"',"
				+qttp.getGia()+","+qttp.getSoluongcon()+",'"+qttp.getHinhanh()+"','"+qttp.getNgaycapnhat()+"',"+qttp.getiDloaisp()+")";
		return _jdbcsource.update(sql);
	}


	@Override
	public int Editthucpham(Thucpham tp) {
		String sql ="UPDATE thucpham SET Tenthucpham ='"+tp.getTenthucpham()+"',"
				+ "Thongtin='"+tp.getThongtinmota()+"',Gia='"+tp.getGia()+"',"
				+ "Soluongcon='"+tp.getSoluongcon()+"',Hinhanh='"+tp.getHinhanh()+"',"
				+ "Ngaycapnhat='"+tp.getNgaycapnhat()+"',IDloaisp="+tp.getiDloaisp()+" "
				+ "WHERE IDthucpham = "+tp.getiDthucpham();
		return _jdbcsource.update(sql);
	}

	@Override
	public int Deletethucpham(Integer id) {
		String sql = "DELETE FROM thucpham WHERE IDthucpham="+id;
		return _jdbcsource.update(sql);
	}

	@Override
	public Thucpham Detailthucpham(Integer id) {
		String sql = "SELECT * FROM thucpham WHERE IDthucpham = " +id;
		ResultSetExtractor<Thucpham> truyendulieu = new ResultSetExtractor<Thucpham>() {
			
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
		return _jdbcsource.query(sql, truyendulieu);
	}
}
