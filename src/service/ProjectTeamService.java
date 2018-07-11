package service;

import java.util.List;
import domain.*;

public interface ProjectTeamService {
	public void createProjectTeam(ProjectTeamBean bean);
	public List<ProjectTeamBean> listProjectTeam();
	public List<ProjectTeamBean> readProjectTeamByName(String word);
	public String readProjectTeamBySeq(int teamSeq);
	public int countProjectTeamBean();
	public ProjectTeamBean updateProjectTeamBean(ProjectTeamBean bean);
	public void deleteProjectTeamBean(ProjectTeamBean bean);
}
