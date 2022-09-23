package site.metacoding.red.service;

import java.util.List;


import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;


@RequiredArgsConstructor
@Service
public class PlayerService {
	private final PlayerDao playerDao;

	public List<Player> 선수목록보기() {
		return playerDao.findAll();
	}

	public void 선수등록하기(Player player) {
		playerDao.insert(player);
	}

	public void 선수삭제하기(Integer id) {
		playerDao.deleteById(id);
	}
	
	public List<Player> 포지션별선수보기(String position) {
		return playerDao.findByPosition(position);
	}
	
	public List<Player> 팀별선수보기(String teamName) {
		return playerDao.findByTeam(teamName);
		
	}

}
