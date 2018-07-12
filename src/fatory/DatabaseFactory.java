package fatory;
import enums.Vendor;
import pool.DBConstant;

public class DatabaseFactory {
	 public Database createDatabase(Vendor v,String id, String pass) {
		 Database db =null;
		String driver = "", url ="";
		 switch (v) {
		case ORACLE:
			//temp = new Oracle();
			//어떻게 conn을 리턴받게 할까
			driver= DBConstant.ORACLE_DRIVER;
			url = DBConstant.CONNECTION_URL;
			db = new Oracle(driver, url, id, pass);
			break;
		case MARIADB:
			driver= DBConstant.MariaDB_DRIVER;
			url = DBConstant.CONNECTION_URL;
			db = new MariaDB(driver, url, id, pass);
			break;
		case MYSQL:
			driver= DBConstant.MySQL_DRIVER;
			url = DBConstant.CONNECTION_URL;
			db = new MySQL(driver, url, id, pass);
			break;
		case MSSQL:

			break;		
		}
		 return db;
	 }
}
