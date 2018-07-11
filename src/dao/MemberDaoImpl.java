package dao;

import java.util.List;

import domain.*;

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
		// TODO Auto-generated method stub
		return null;
	}

}
