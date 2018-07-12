package dao;

import java.sql.*;
import java.util.*;

import domain.*;
import pool.DBConstant;

public class MemberDaoImpl implements MemberDao{

	private static MemberDao instance = new MemberDaoImpl();
	public static MemberDao getInstance() {return instance;}
	private MemberDaoImpl() {}

	@Override
	public void createMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MemberBean> listMember() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberBean> readMemberByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean readMemberById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMember() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(MemberBean member) {
		// TODO Auto-generated method stub
	}
	@Override
	public MemberBean login(MemberBean bean) {
		System.out.println("dao로 넘어온 bean의 아이디 : " + bean.getUserid());
		System.out.println("dao로 넘어온 bean의 비번 : " + bean.getPassword());
		MemberBean m = null;
			try {    //surround with try/catch
				Class.forName(DBConstant.DB_DRIVER);
				Connection conn = DriverManager.getConnection(DBConstant.CONNECTION_URL,DBConstant.USERNAME,DBConstant.PASSWORD);
				String sql = String.format(
						"   SELECT " 
						+	" MEM_ID USERID, " 
						+	" TEAM_ID TEAMID, " 
						+ 	" NAME, " 
						+	" AGE, " 
						+	" ROLL, " 
						+	" PASSWORD PW " 
						+ 	" FROM MEMBER " 
						+	"  WHERE MEM_ID LIKE '%s' AND PASSWORD LIKE '%s'   "
						,bean.getUserid(),bean.getPassword()); 
					
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);

				while(rs.next()){
					m = new MemberBean();
					m.setUserid(rs.getString("USERID"));
					m.setTeamId(rs.getString("TEAMID"));
					m.setName(rs.getString("NAME"));
					m.setSsn(rs.getString("AGE"));
					m.setRoll(rs.getString("ROLL"));
					m.setPassword(rs.getString("PW"));
				}
				
			} catch (Exception e) {   //Exception의 최상위는 Exception 이라서 다른 것 지우고 Exception만 남김.
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return m;
	}
}
