package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.expulsion.Expulsion;
import site.metacoding.red.domain.expulsion.ExpulsionDao;
import site.metacoding.red.web.dto.response.expulsion.ExpulsionListDto;

@RequiredArgsConstructor
@Service
public class ExpulsionService {
	private final ExpulsionDao expulsionDao;

	public List<ExpulsionListDto> 퇴출선수목록보기() {
		return expulsionDao.findAll();
	}

	public void 퇴출사유등록하기(Expulsion expulsion) {
		expulsionDao.insert(expulsion);
	}
	
}
