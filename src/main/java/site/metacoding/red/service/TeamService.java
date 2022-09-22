package site.metacoding.red.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.team.TeamDao;
import site.metacoding.red.web.dto.request.team.TeamDto;


@RequiredArgsConstructor
@Service
public class TeamService {

	private final TeamDao teamDao;

	public void 선수목록보기() {
		teamDao.findAll();
	}

	public void 선수등록하기(TeamDto teamDto) {
		teamDao.insert(teamDto);
	}

	public void 선수삭제하기(Integer id) {
		TeamDto playerPS = teamDao.findById(id);
		
		teamDao.deleteById(id);
	}
	
	
}
