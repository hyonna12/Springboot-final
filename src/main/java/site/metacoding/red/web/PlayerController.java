package site.metacoding.red.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayerController {

	@GetMapping("/player/playerList")
	public String playerForm() {
		return "/player/playerList";
	}
	
	@GetMapping("/player/playerSaveForm")
	public String playerSaveForm() {
		return "/player/playerSaveForm";
	}
	
	@GetMapping("/player/playerPositionList")
	public String playerPositionForm() {
		return "/player/playerPositionList";
	}
	
	@GetMapping("/player/playerTeamList")
	public String playerTeamList() {
		return "/player/playerTeamList";
	}
}
