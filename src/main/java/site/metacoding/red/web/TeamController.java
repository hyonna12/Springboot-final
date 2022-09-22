package site.metacoding.red.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {

	@GetMapping("/team/teamList")
	public String teamForm() {
		return "/team/teamList";
	}
	
	@GetMapping("/team/teamSaveForm")
	public String teamSaveForm() {
		return "/team/teamSaveForm";
	}
	
}
