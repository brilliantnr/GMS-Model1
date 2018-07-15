package dao;

import java.sql.*;
import java.util.*;

import com.sun.corba.se.impl.ior.GenericTaggedComponent;
import com.sun.javafx.fxml.BeanAdapter;

import domain.*;
import enums.MemberQuery;
import enums.Vendor;
import factory.*;
import pool.DBConstant;
//★ MemberQuery.LOGIN.toString() <- Enum 사용 
//insert,update,delete는 리턴타입 void 니까
//-> .executeUpdate(sql) 로 사용해야함.

public class MemberDaoImpl implements MemberDao{
	private static MemberDao instance = new MemberDaoImpl();
	public static MemberDao getInstance() {return instance;}
	private MemberDaoImpl() {
	}
			
	@Override
	public MemberBean login(MemberBean bean) {
		MemberBean m = null;
		try {
			ResultSet rs = DatabaseFactory.createDatabase(
					Vendor.ORACLE,
					DBConstant.USERNAME,
					DBConstant.PASSWORD)
			.getConnection().createStatement().executeQuery(String.format(
					MemberQuery.LOGIN.toString(),
					bean.getUserid(), bean.getPassword()));    

			while(rs.next()) {
				m=new MemberBean();
				m.setUserid(rs.getString("USERID"));
				m.setTeamId(rs.getString("TEAMID"));
				m.setName(rs.getString("NAME"));
				m.setAge(rs.getString("AGE"));
				m.setRoll(rs.getString("ROLL"));
				m.setPassword("PW");
				}
			} catch (Exception e) { e.printStackTrace();}
		return m;
	}	

	@Override
	public void insertMember(MemberBean member) {
		try {
			int rs=
			DatabaseFactory.createDatabase(
					Vendor.ORACLE, DBConstant.USERNAME, DBConstant.PASSWORD)
			.getConnection().createStatement().executeUpdate(
					String.format(MemberQuery.INSERT_MEMBER.toString(),
							member.getUserid(),member.getName(),member.getSsn(),member.getPassword()));
			System.out.println("가입결과:"+rs);
		} catch (Exception e) {e.printStackTrace();}
		
	}

	@Override
	public List<MemberBean> listMember() {
		List<MemberBean> lst =null;
		return lst;
	}

	@Override
	public List<MemberBean> selectMemberByName(String name) {
		
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
	public MemberBean findId(String name, String ssn) {
		MemberBean member = new MemberBean();
		try {
			DatabaseFactory.createDatabase(Vendor.ORACLE, DBConstant.USERNAME, DBConstant.PASSWORD)
			.getConnection().createStatement().executeQuery(String.format(
					MemberQuery.FIND_ID.toString(), member.getName(),member.getSsn()));
			
		} catch (Exception e) {e.printStackTrace();}
		
		return null;
	}
	@Override
	public MemberBean selectMemberById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
