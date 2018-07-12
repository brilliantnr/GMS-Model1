package dao;

import java.sql.*;
import java.util.*;

import pool.DBConstant;
/* 
oracle.jdbc.driver.OracleDriver
 jdbc:oracle:thin:@localhost:1521:xe
 rachel
 7003
 * */
public class TestDao {
	private static TestDao instance = new TestDao();
	public static TestDao getInstance() {return instance;}
	private TestDao() {}
	
	public List<String> selectAge(){
		List<String> ssn =new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "rachel", "7003");
			String sql ="SELECT "
					+ " AGE FROM MEMBER";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				ssn.add(rs.getString("AGE"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ssn;
	}
	
	
	public void updateSsn(String ssn,int i){
		try {
			Class.forName(DBConstant.ORACLE_DRIVER);
			Connection conn = DriverManager.getConnection(DBConstant.CONNECTION_URL,DBConstant.USERNAME,DBConstant.PASSWORD);
			String sql =String.format("UPDATE MEMBER SET SSN = '%s' WHERE MEM_ID LIKE '%02d' ",ssn,i);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
