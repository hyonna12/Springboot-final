package site.metacoding.red.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExpulsionController {

	@GetMapping("/expulsion/expulsionPlayerList")
	public String expulsionPlayerForm() {
		return "/expulsion/expulsionPlayerList";
	}
	
	@GetMapping("/expulsion/expulsionReasonForm")
	public String expulsionReasonForm() {
		return "/expulsion/expulsionReasonForm";
	}
}
