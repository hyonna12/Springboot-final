package site.metacoding.red.domain.player;

import java.util.List;


public interface PlayerDao {
	public void insert(Player player);
	public Player findById(Integer id);
	public List<Player> findAll();
	public void update(Player palyer);
	public void deleteById(Integer id);
	
	public List<Player> findByPosition(String position);
	public List<Player> findByTeam(String teamName);
}
