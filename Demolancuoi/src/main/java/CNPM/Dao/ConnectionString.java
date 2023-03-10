package CNPM.Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class ConnectionString {
	 private static String URL = "jdbc:mysql://localhost:3306/qlquanlau_php";
	 private static String USER ="root";
	 private static String PASSWORD ="";
	 
	 public static void main(String[] args) throws SQLException {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connect = DriverManager.getConnection(URL,USER,PASSWORD);
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
}

