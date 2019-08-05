package rockpaperscissors.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import rockpaperscissors.RockPaperScissors;

@Controller
public class MainController {
	@Autowired
	private RockPaperScissors rps;
	
	@GetMapping("/")
	public String home(HttpServletRequest request, ModelMap model) {
		String UserChoice = request.getParameter("button");
		
		if (UserChoice != null) {
			int choice = Integer.parseInt(UserChoice);
			
			RockPaperScissors result = rps.GetGameResult(choice);
			model.addAttribute("result", result);
		}
		
		return "index";
	}
}
