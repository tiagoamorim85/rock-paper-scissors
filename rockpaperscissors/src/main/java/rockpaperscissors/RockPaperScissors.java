package rockpaperscissors;

import java.util.Random;

public class RockPaperScissors {
	private static final String[][] Results = {
			{"Tie", "Computer", "User"},
			{"User", "Tie", "Computer"},
			{"Computer", "User", "Tie"}
	};
	
	private int userChoice;
	private int computerChoice;
	private String result;
	
	private void GenerateComputerChoice() {
		Random rand = new Random();
		this.computerChoice = rand.nextInt(3);
	}
	
	public RockPaperScissors GetResult(int userChoice) {
		this.userChoice = userChoice;
		//String resultString = "";
		GenerateComputerChoice();
		
		this.result = Results[this.userChoice][this.computerChoice];
		
//		String choicesString = "Computer choose " 
//		+ Choices.values()[computerChoice] 
//				+ " and User choose " + Choices.values()[this.userChoice];
//		if (this.result == "Tie" ) {
//			resultString = " and we have a tie.";
//		} else {
//			resultString = " and the winner is " + this.result;
//		}
		
		return this;
//		return choicesString + resultString;
	}

	/**
	 * @return the userChoice
	 */
	public int getUserChoice() {
		return userChoice;
	}

	/**
	 * @return the computerChoice
	 */
	public int getComputerChoice() {
		return computerChoice;
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

}
