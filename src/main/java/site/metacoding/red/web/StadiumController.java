package site.metacoding.red.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.service.StadiumService;
import site.metacoding.red.web.dto.response.stadium.StadiumDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {
	
	private final StadiumService stadiumService;
	
	@GetMapping("/stadium/stadiumList")
	public String stadiumForm() {
		stadiumService.경기장목록보기();
		return "/stadium/stadiumList";
	}
	
	@GetMapping("/stadium/stadiumSaveForm")
	public String stadiumSaveForm() {
		return "/stadium/stadiumSaveForm";
	}
	
	@PostMapping("/stadium")
	public String stadiumUpdate(StadiumDto stadiumDto) {
		stadiumService.경기장등록하기(stadiumDto);
		return "경기장 등록";
	}
	
	
}
