package service;

import java.util.List;

import domain.ProjectTeamBean;

public class ProjectTeamServiceImpl implements ProjectTeamService{

	private static ProjectTeamService instance = new ProjectTeamServiceImpl();
	public static ProjectTeamService getInstance() {return instance;}
	private ProjectTeamServiceImpl() {
	}
	
	
	@Override
	public void createProjectTeam(ProjectTeamBean pt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProjectTeamBean> listProjectTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectTeamBean> readProjectTeamByName(String name) {
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
	public ProjectTeamBean updateProjectTeamBean(ProjectTeamBean pt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProjectTeamBean(ProjectTeamBean pt) {
		// TODO Auto-generated method stub
		
	}

}
