package site.metacoding.red.domain.expulsion;

import java.util.List;

import site.metacoding.red.web.dto.request.expulsion.ExpulsionDto;

public interface ExpulsionDao {
	public void insert(ExpulsionDto expulsionDto);
	public void findById(Integer id);
	public List<ExpulsionDto> findAll();
	public void update(ExpulsionDto expulsionDto);
	public void deleteById(Integer id);
}
