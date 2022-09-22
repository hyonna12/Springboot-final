package site.metacoding.red.domain.player;

import java.util.List;

import site.metacoding.red.web.dto.request.player.PlayerDto;

public interface PlayerDao {
	public void insert(PlayerDto playerDto);
	public PlayerDto findById(Integer id);
	public List<PlayerDto> findAll();
	public void update(PlayerDto palyerDto);
	public void deleteById(Integer id);
	
	public List<PlayerDto> findByPosition(String position);
	public List<PlayerDto> findByTeam(String team);
}
