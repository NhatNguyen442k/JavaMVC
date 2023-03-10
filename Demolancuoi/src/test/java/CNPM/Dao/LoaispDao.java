package CNPM.Dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import CNPM.Entity.Loaisp;
import CNPM.Service.User.IndexServiceIpm;
import CNPM.Service.User.ItfIndex;

public class LoaispDao {
	
	private DriverManagerDataSource data;
	private ItfIndex dao;
	
	@BeforeEach
	public void SetupData() {
		data = new DriverManagerDataSource();
		data.setDriverClassName("com.mysql.jdbc.Driver");
		data.setUrl("jdbc:mysql://localhost:3306/qlquanlau_php");
		data.setUsername("root");
		data.setPassword("");
		dao = new IndexServiceIpm(data);
	}
	@Test
	void testMenuloaisp() {
		List<Loaisp> list = dao.Menuloaisp();
		assertTrue(list.isEmpty());
	}

}
