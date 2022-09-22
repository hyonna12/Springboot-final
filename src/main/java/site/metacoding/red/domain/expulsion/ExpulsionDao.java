package site.metacoding.red.domain.expulsion;

import java.util.List;

public interface ExpulsionDao {
	public void insert(Expulsion expulsion);
	public void findById(Integer id);
	public List<Expulsion> findAll();
	public void update(Expulsion expulsion);
	public void deleteById(Integer id);
}
