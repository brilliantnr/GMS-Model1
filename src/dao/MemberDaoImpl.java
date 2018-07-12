package dao;

import java.sql.*;
import java.util.*;

import com.sun.corba.se.impl.ior.GenericTaggedComponent;

import domain.*;
import enums.Vendor;
import factory.*;
import pool.DBConstant;


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
					"   SELECT " + 
					" MEM_ID USERID, " + 
					" TEAM_ID TEAMID, " + 
					" NAME, " + 
					" AGE, " + 
					" ROLL, " +
					" PASSWORD PW " + 
					" FROM MEMBER " + 
					"  WHERE MEM_ID LIKE '%s' AND PASSWORD LIKE '%s'   ",
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
	public void createMember(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MemberBean> listMember() {
		List<MemberBean> lst =null;
		return lst;
	}

	@Override
	public List<MemberBean> readMemberByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean readMemberById(String id) {
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
	
}
