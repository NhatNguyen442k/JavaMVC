package CNPM.Service.Admin;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import CNPM.Dto.AccountQTDto;
import CNPM.Dto.QTthucphamDto;
import CNPM.Entity.Khachhang;


class AccountAdminDao {

	private DriverManagerDataSource data;
//	private ItfIndexACAdmin daos;
//	private ItfIndexTPAdmin daos;
	
//	@BeforeEach
//	public void SetupData() {
//		data = new DriverManagerDataSource();
//		data.setDriverClassName("com.mysql.jdbc.Driver");
//		data.setUrl("jdbc:mysql://localhost:3306/qlquanlau_php");
//		data.setUsername("root");
//		data.setPassword("");
//		daos = new IndexTPServiceAdminIpm(data);
//		daos = new ACServiceAdminIpm(data);
//	}
	
//	@Test
//	void testList() {
//		List<Khachhang> list = daos.list();
//		System.out.print(list);
//		assertTrue(list.isEmpty());
//	}
	
//	@Test
//	void testList() {
//		List<QTthucphamDto> list = daos.listthucpham();;
//		System.out.print(list);
//		assertTrue(list.isEmpty());
//	}


}
