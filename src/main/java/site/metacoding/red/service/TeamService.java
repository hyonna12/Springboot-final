package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;


@RequiredArgsConstructor
@Service
public class TeamService {

	private final TeamDao teamDao;

	public List<Team> 팀목록보기() {
		return teamDao.findAll();
	}

	public void 팀등록하기(Team team) {
		teamDao.insert(team);
	}

	public void 팀삭제하기(Integer id) {
		Team playerPS = teamDao.findById(id);
		
		teamDao.deleteById(id);
	}
	
	
}
