package site.metacoding.red.domain.team;

import java.util.List;

import site.metacoding.red.web.dto.response.team.TeamListDto;


public interface TeamDao {
	public void insert(Team team);
	public Team findById(Integer id);
	public List<TeamListDto> findAll();
	public void update(Team team);
	public void deleteById(Integer id);
}
