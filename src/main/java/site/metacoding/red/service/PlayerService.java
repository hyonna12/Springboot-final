package site.metacoding.red.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;
import site.metacoding.red.web.dto.request.player.PlayerDto;


@RequiredArgsConstructor
@Service
public class PlayerService {
	private final PlayerDao playerDao;

	public void 선수목록보기() {
		playerDao.findAll();
	}

	public void 선수등록하기(PlayerDto playerDto) {
		playerDao.insert(playerDto);
	}

	public void 선수삭제하기(Integer id) {
		PlayerDto playerPS = playerDao.findById(id);
		
		playerDao.deleteById(id);
	}
	
	public void 포지션별선수보기(String position) {
		playerDao.findByPosition(position);
	}
	
	public void 팀별선수보기(String team) {
		playerDao.findByTeam(team);
		
	}

}
