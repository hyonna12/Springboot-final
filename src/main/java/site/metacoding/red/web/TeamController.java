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
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.service.TeamService;
import site.metacoding.red.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class TeamController {
	
private final TeamService teamService;
	
	@GetMapping("/team/teamList")
	public String teamForm(Model model) {
		List<Team> teamList = teamService.팀목록보기();
		model.addAttribute("teamList", teamList);
		return "/team/teamList";
	}
	
	@GetMapping("/team/teamSaveForm")
	public String teamSaveForm() {
		return "/team/teamSaveForm";
	}
	
	@PostMapping("/team")
	public @ResponseBody CMRespDto<?> teamUpdate(Team team) {
		teamService.팀등록하기(team);
		return new CMRespDto<>(1, "팀 등록 성공", null);
	}
	
	@DeleteMapping("/team/{id}")
	public @ResponseBody CMRespDto<?> teamDelete(@PathVariable Integer id) {
		teamService.팀삭제하기(id);
		return new CMRespDto<>(1, "팀 삭제", null);
	}
	
	
	
}
