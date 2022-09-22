package site.metacoding.red.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaduimController {
	
	@GetMapping("/")
	public String MainForm() {
		return "main";
	}
	
	@GetMapping("/stadiumList")
	public String stadiumForm() {
		return "/stadium/stadiumList";
	}
	
	@GetMapping("/stadiumSaveForm")
	public String stadiumSaveForm() {
		return "/stadium/stadiumSaveForm";
	}
	
	@GetMapping("/playerList")
	public String playerForm() {
		return "/player/playerList";
	}
	
	@GetMapping("/playerSaveForm")
	public String playerSaveForm() {
		return "/player/playerSaveForm";
	}
	
	@GetMapping("/playerPositionList")
	public String playerPositionForm() {
		return "/player/playerPositionList";
	}
	
	@GetMapping("/teamList")
	public String teamForm() {
		return "/team/teamList";
	}
	
	@GetMapping("/teamSaveForm")
	public String teamSaveForm() {
		return "/team/teamSaveForm";
	}
	
	@GetMapping("/teamPlayerList")
	public String teamPlayerForm() {
		return "/team/teamPlayerList";
	}
	
	@GetMapping("/expulsionPlayerList")
	public String expulsionPlayerForm() {
		return "/expulsion/expulsionPlayerList";
	}
	
	@GetMapping("/expulsionReasonForm")
	public String expulsionReasonForm() {
		return "/expulsion/expulsionReasonForm";
	}
}
