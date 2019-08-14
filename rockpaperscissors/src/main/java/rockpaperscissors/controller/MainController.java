package rockpaperscissors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import rockpaperscissors.service.RockPaperScissors;

@Controller
public class MainController {
	@Autowired
	private RockPaperScissors rps;
	
	@GetMapping("/")
	public ModelAndView home(Integer userChoice) {
		ModelAndView mv = new ModelAndView("index");

		mv.addObject("showResult", false);
		
		if (userChoice != null) {
			try {
				RockPaperScissors result = rps.GetGameResult(userChoice);
				mv.addObject("result", result);
				mv.addObject("error", false);
				mv.addObject("showResult", true);
			} catch (Exception e) {
				mv.addObject("error", true);
			}
		}
		
		return mv;
	}
}
