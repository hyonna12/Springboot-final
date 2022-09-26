package site.metacoding.red.domain.expulsion;

import java.util.List;

import site.metacoding.red.web.dto.response.expulsion.ExpulsionListDto;


public interface ExpulsionDao {
	public void insert(Expulsion expulsion);
	public void findById(Integer id);
	public List<ExpulsionListDto> findAll();
	public void update(Expulsion expulsion);
	public void deleteById(Integer id);
}
