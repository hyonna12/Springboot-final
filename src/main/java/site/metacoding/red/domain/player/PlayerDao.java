package site.metacoding.red.domain.player;

import java.util.List;

public interface PlayerDao {
	public void insert(Player player);
	public void findById(Integer id);
	public List<Player> findAll();
	public void update(Player palyer);
	public void deleteById(Integer id);
}
