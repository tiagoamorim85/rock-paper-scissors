package rockpaperscissors.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import rockpaperscissors.RockPaperScissors;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String home(HttpServletRequest request, ModelMap model) {
		
		String UserChoice = request.getParameter("button");
		if (UserChoice != null) {
			RockPaperScissors rps = new RockPaperScissors();
			
			int choice = Integer.parseInt(UserChoice);
			
			RockPaperScissors result = rps.GetResult(choice);
			model.addAttribute("result", result);
			model.addAttribute("computer_choice", result.getComputerChoice());
			System.out.println(result);
		}
		
		return "index";
	}
	
	@PostMapping("/play")
	public String play( HttpServletRequest request) {
		String choice = request.getParameter("button");
		System.out.println(choice);
		
		return "index";
	}

}
