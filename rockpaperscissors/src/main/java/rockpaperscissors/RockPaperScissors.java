package rockpaperscissors;

import java.util.Random;

public class RockPaperScissors {
	// Map of possible results
	private static final String[][] Results = {
			{"Tie", "Computer", "User"},
			{"User", "Tie", "Computer"},
			{"Computer", "User", "Tie"}
	};
	
	private static final String[] Choices = {"Rock", "Paper", "Scissors"};
	
	private int userChoice;
	private int computerChoice;
	private String result;
	
	// Generate Computer's choice
	private int GenerateComputerChoice() {
		Random rand = new Random();
		return rand.nextInt(3);
	}
	
	// Get the result of the game
	public RockPaperScissors GetGameResult(int userChoice) {
		this.userChoice = userChoice;
		this.computerChoice = GenerateComputerChoice();
		
		String resAux = Results[this.userChoice][this.computerChoice];
		
		if (resAux != "Tie") {
			resAux += " wins";
		} 
		
		resAux += "!";
		
		this.result = resAux;
		
		return this;
	}

	/**
	 * @return the userChoice
	 */
	public String getUserChoice() {
		return Choices[this.userChoice];
	}

	/**
	 * @return the computerChoice
	 */
	public String getComputerChoice() {
		return Choices[this.computerChoice];
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return this.result;
	}

}
