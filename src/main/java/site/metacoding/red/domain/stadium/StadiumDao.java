package site.metacoding.red.domain.stadium;

import java.util.List;

import site.metacoding.red.web.dto.request.stadium.StadiumDto;

public interface StadiumDao {
	public void insert(StadiumDto stadiumDto);
	public StadiumDto findById(Integer id);
	public List<Stadium> findAll();
	public void update(StadiumDto stadiumDto);
	public void deleteById(Integer id);
	
}
