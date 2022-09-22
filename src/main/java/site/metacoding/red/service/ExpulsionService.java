package site.metacoding.red.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.expulsion.ExpulsionDao;
import site.metacoding.red.web.dto.request.expulsion.ExpulsionDto;

@RequiredArgsConstructor
@Service
public class ExpulsionService {
	private final ExpulsionDao expulsionDao;

	public void 퇴출선수목록보기() {
		expulsionDao.findAll();
	}

	public void 퇴출사유등록하기(ExpulsionDto expulsionDto) {
		expulsionDao.insert(expulsionDto);
	}
	
}
