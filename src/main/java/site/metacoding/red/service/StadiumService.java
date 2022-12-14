package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.stadium.StadiumDao;
import site.metacoding.red.web.dto.response.stadium.StadiumDto;

@RequiredArgsConstructor
@Service
public class StadiumService {
	private final StadiumDao stadiumDao;

	public List<Stadium> 경기장목록보기() {
		return stadiumDao.findAll();
	}
	
	public void 경기장등록하기(Stadium stadium) {
		stadiumDao.insert(stadium);
	}

	public void 경기장삭제하기(Integer id) {
		stadiumDao.deleteById(id);
	}

}
