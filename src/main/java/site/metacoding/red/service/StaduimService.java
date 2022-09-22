package site.metacoding.red.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.stadium.StadiumDao;
import site.metacoding.red.web.dto.request.stadium.StadiumDto;

@RequiredArgsConstructor
@Service
public class StaduimService {
	private final StadiumDao stadiumDao;

	public void 경기장목록보기() {
		stadiumDao.findAll();
	}

	public void 경기장등록하기(StadiumDto stadiumDto) {
		stadiumDao.insert(stadiumDto);
	}

	public void 경기장삭제하기(Integer id) {
		StadiumDto stadiumPS = stadiumDao.findById(id);
		
		stadiumDao.deleteById(id);
	}

}
