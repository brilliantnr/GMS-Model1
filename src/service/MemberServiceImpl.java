package service;

import java.util.List;

import dao.MemberDaoImpl;
import domain.*;

public class MemberServiceImpl implements MemberService{

	private static MemberService instance = new MemberServiceImpl();
	public static MemberService getInstance() {return instance;}
	private MemberServiceImpl() {
	}
	
	@Override
	public void createMember(MemberBean member) {
		
	}

	@Override
	public List<MemberBean> listMember() {
		return null;
	}

	@Override
	public List<MemberBean> readMemberByName(String name) {
		return null;
	}

	@Override
	public MemberBean readMemberById(String id) {
		return null;
	}

	@Override
	public int countMember() {
		return 0;
	}

	@Override
	public void updateMember(MemberBean member) {
		
	}

	@Override
	public void deleteMember(MemberBean member) {
		
	}
	@Override
	public MemberBean login(MemberBean member) {
		System.out.println(member.getUserid());
		System.out.println(member.getPassword());
		MemberBean t = MemberDaoImpl.getInstance().login(member);
		
		return t;
	}
		/*public boolean login(MemberBean member) {
		boolean flag = flase;
		if(MemberDaoImpl.getInstance().login(member)==null){
			flag=true;
		};
		return falg;
		*/
		/*public boolean login(MemberBean member) {
		 * return (MemberDaoImpl.getInstance().login(member)!=null);
		 */
		
	
}