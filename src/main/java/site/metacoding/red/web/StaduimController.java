package site.metacoding.red.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StaduimController {
	
	@GetMapping("/stadium/stadiumList")
	public String stadiumForm() {
		return "/stadium/stadiumList";
	}
	
	@GetMapping("/stadium/stadiumSaveForm")
	public String stadiumSaveForm() {
		return "/stadium/stadiumSaveForm";
	}
	
	@PostMapping("/stadium/{id}/stadiumSaveForm")
	public String stadiumUpdate() {
		return null;
	}
	
	
}
