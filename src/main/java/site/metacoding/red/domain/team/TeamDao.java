package site.metacoding.red.domain.team;

import java.util.List;

import site.metacoding.red.web.dto.request.team.TeamDto;

public interface TeamDao {
	public void insert(TeamDto teamDto);
	public TeamDto findById(Integer id);
	public List<TeamDto> findAll();
	public void update(TeamDto teamDto);
	public void deleteById(Integer id);
}
