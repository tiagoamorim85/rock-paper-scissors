package rockpaperscissors;

import java.util.Random;

public class RockPaperScissors {
	private static final String[][] Results = {
			{"Tie", "Computer", "User"},
			{"User", "Tie", "Computer"},
			{"Computer", "User", "Tie"}
	};
	
	private static final String[] Choices = {"Rock", "Paper", "Scissors"};
	
	private int userChoice;
	private int computerChoice;
	private String result;
	
	private void GenerateComputerChoice() {
		Random rand = new Random();
		this.computerChoice = rand.nextInt(3);
	}
	
	public RockPaperScissors GetResult(int userChoice) {
		this.userChoice = userChoice;
		GenerateComputerChoice();
		
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
		return Choices[userChoice];
	}

	/**
	 * @return the computerChoice
	 */
	public String getComputerChoice() {
		return Choices[computerChoice];
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

}
