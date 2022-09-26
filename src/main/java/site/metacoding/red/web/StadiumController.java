package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.service.StadiumService;
import site.metacoding.red.web.dto.response.CMRespDto;
import site.metacoding.red.web.dto.response.stadium.StadiumDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {
	
	private final StadiumService stadiumService;
	
	@GetMapping("/stadium/stadiumList")
	public String stadiumForm(Model model) {
		List<Stadium> stadiumList = stadiumService.경기장목록보기();
		model.addAttribute("stadiumList", stadiumList);
		return "/stadium/stadiumList";
	}
	
	@GetMapping("/stadium/stadiumSaveForm")
	public String stadiumSaveForm() {
		return "/stadium/stadiumSaveForm";
	}
	
	@PostMapping("/stadium")
	public @ResponseBody CMRespDto<?> stadiumUpdate(Stadium stadium) {
		System.out.println("등록됨");
		stadiumService.경기장등록하기(stadium);
		return new CMRespDto<>(1, "경기장 등록 성공", null);
	}
	
	@DeleteMapping("/stadium/{id}")
	public @ResponseBody CMRespDto<?> stadiumDelete(@PathVariable Integer id) {
		stadiumService.경기장삭제하기(id);
		return new CMRespDto<>(1, "게시글 삭제", null);
	}
	
	
}
