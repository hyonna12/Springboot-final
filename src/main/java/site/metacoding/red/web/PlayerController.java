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
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.service.PlayerService;
import site.metacoding.red.web.dto.response.CMRespDto;
import site.metacoding.red.web.dto.response.player.PlayerListDto;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	
	private final PlayerService playerService;

	@GetMapping("/player/playerList")
	public String playerForm(Model model) {
		List<PlayerListDto> playerList = playerService.선수목록보기();
		model.addAttribute("playerList", playerList);
		return "/player/playerList";
	}
	
	@GetMapping("/player/playerSaveForm")
	public String playerSaveForm() {
		return "/player/playerSaveForm";
	}
	
	@GetMapping("/player/playerPositionList")
	public String playerPositionForm(Model model, String position) {
		List<Player> playerList = playerService.포지션별선수보기(position);
		model.addAttribute("PlayerList", playerList);
		return "/player/playerPositionList";
	}
	
	@GetMapping("/player/playerTeamList")
	public String playerTeamList(Model model, String teamName) {
		List<Player> playerList = playerService.팀별선수보기(teamName);
		model.addAttribute("PlayerList", playerList);
		return "/player/playerTeamList";
	}
	
	@PostMapping("/player")
	public @ResponseBody CMRespDto<?> playerUpdate(Player player) {
		playerService.선수등록하기(player);
		return new CMRespDto<>(1, "선수 등록 성공", null);
	}
	
	@DeleteMapping("/player/{id}")
	public @ResponseBody CMRespDto<?> playerDelete(@PathVariable Integer id) {
		playerService.선수삭제하기(id);
		return new CMRespDto<>(1, "선수 삭제", null);
	}
}
