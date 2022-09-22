package site.metacoding.red.domain.team;

import java.util.List;

public interface TeamDao {
	public void insert(Team team);
	public void findById(Integer id);
	public List<Team> findAll();
	public void update(Team team);
	public void deleteById(Integer id);
}
