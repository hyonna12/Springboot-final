package site.metacoding.red.domain.stadium;

import java.util.List;

public interface StadiumDao {
	public void insert(Stadium stadium);
	public void findById(Integer id);
	public List<Stadium> findAll();
	public void update(Stadium stadium);
	public void deleteById(Integer id);
}
