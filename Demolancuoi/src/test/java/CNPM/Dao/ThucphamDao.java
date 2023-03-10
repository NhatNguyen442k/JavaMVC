package CNPM.Dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import CNPM.Entity.Thucpham;
import CNPM.Service.User.IndexServiceIpm;
import CNPM.Service.User.ItfIndex;;

public class ThucphamDao{

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
	void testGet() {
		Integer id = 1;
		Thucpham tp = dao.get(id);
		assertNotNull(tp);
	}
	
	@Test
	void testList() {
		List<Thucpham> list = dao.list();
		assertTrue(list.isEmpty());
	}
	
//	@Test
//	void testGetinfo() {
//		int id = 1;
//		List<Thucpham list = dao.getInfoTP(id);
//		for(Thucpham a:list) {
//			System.out.println(list);
//		}
//		assertTrue(list.isEmpty());
//	}
}
