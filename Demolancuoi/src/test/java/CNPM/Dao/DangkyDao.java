package CNPM.Dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import CNPM.Service.User.ItfKynhap;
import CNPM.Service.User.KynhapServiceIpm;

public class DangkyDao {

	private DriverManagerDataSource data;
	private ItfKynhap dao;
	
	@BeforeEach
	public void SetupData() {
		data = new DriverManagerDataSource();
		data.setDriverClassName("com.mysql.jdbc.Driver");
		data.setUrl("jdbc:mysql://localhost:3306/qlquanlau_php");
		data.setUsername("root");
		data.setPassword("");
		dao = new KynhapServiceIpm(data);
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
