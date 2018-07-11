package dao;

import java.util.List;

import domain.*;

public interface MemberDao {
	public void createMember(MemberBean member);
	public List<MemberBean> listMember();
	public List<MemberBean> readMemberByName(String name);
	public MemberBean readMemberById(String id);
	public int countMember();
	public void updateMember(MemberBean member);
	public void deleteMember(MemberBean member);
	public MemberBean login(MemberBean bean);
}
