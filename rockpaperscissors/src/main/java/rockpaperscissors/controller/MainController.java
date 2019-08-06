package rockpaperscissors.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	public ModelAndView home(String userChoice) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		
		if (userChoice != null) {
			RockPaperScissors result = rps.GetGameResult(Integer.parseInt(userChoice));
			mv.addObject("result", result);
		}
		
		return mv;
	}
}
