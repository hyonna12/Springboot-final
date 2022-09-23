package site.metacoding.red.domain.stadium;

import java.util.List;

import site.metacoding.red.web.dto.response.stadium.StadiumDto;

public interface StadiumDao {
	public void insert(Stadium stadium);
	public Stadium findById(Integer id);
	public List<Stadium> findAll();
	public void update(Stadium stadium);
	public void deleteById(Integer id);
}