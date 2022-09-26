package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.expulsion.Expulsion;
import site.metacoding.red.service.ExpulsionService;
import site.metacoding.red.web.dto.response.CMRespDto;
import site.metacoding.red.web.dto.response.expulsion.ExpulsionListDto;

@RequiredArgsConstructor
@Controller
public class ExpulsionController {

	private final ExpulsionService expulsionService;
	
	@GetMapping("/expulsion/expulsionPlayerList")
	public String expulsionPlayerForm(Model model) {
		List<ExpulsionListDto> expulsionList = expulsionService.퇴출선수목록보기();
		model.addAttribute("expulsionList", expulsionList);
		return "/expulsion/expulsionPlayerList";
	}
	
	@GetMapping("/expulsion/expulsionReasonForm")
	public String expulsionReasonForm() {
		return "/expulsion/expulsionReasonForm";
	}

	@PostMapping("/expulsion")
	public @ResponseBody CMRespDto<?> expulsionUpdate(Expulsion expulsion) {
		expulsionService.퇴출사유등록하기(expulsion);
		return new CMRespDto<>(1, "사유 등록 성공", null);
	}
	
	
}
