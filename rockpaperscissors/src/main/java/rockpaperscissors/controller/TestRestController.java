package rockpaperscissors.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rockpaperscissors.RockPaperScissors;

@RestController
@EnableAutoConfiguration
public class TestRestController {

	@GetMapping("/home")
	public RockPaperScissors hello(@RequestParam(value="choice") int choice) {
		RockPaperScissors rps = new RockPaperScissors();

		return rps.GetResult(choice);
	}

}
