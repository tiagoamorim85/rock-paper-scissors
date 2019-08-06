package rockpaperscissors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import rockpaperscissors.RockPaperScissors;

@Controller
public class MainController {
	@Autowired
	private RockPaperScissors rps;
	
	@GetMapping("/")
	public ModelAndView home(Integer userChoice) {
		ModelAndView mv = new ModelAndView("index");
		
		if (userChoice != null) {
			RockPaperScissors result = rps.GetGameResult(userChoice);
			mv.addObject("result", result);
		}
		
		return mv;
	}
}
