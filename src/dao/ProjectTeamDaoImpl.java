package dao;

import java.util.List;

import domain.ProjectTeamBean;

public class ProjectTeamDaoImpl implements ProjectTeamDao{

	private static ProjectTeamDao instance = new ProjectTeamDaoImpl();
	public static ProjectTeamDao getInstance() {return instance;}
	private ProjectTeamDaoImpl() {}

	@Override
	public void createProjectTeam(ProjectTeamBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProjectTeamBean> listProjectTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectTeamBean> readProjectTeamByName(String word) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String readProjectTeamBySeq(int teamSeq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countProjectTeamBean() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ProjectTeamBean updateProjectTeamBean(ProjectTeamBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProjectTeamBean(ProjectTeamBean bean) {
		// TODO Auto-generated method stub
		
	}

}
