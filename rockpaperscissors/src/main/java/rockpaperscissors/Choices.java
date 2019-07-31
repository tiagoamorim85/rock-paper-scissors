package rockpaperscissors;

public enum Choices {
	ROCK("Rock"),
	PAPER("Paper"),
	SCISSORS("Scissors");
	
	private String choice;
	
	Choices(String choice) {
		this.choice = choice;
	}
	
	public String getChoice() {
		return this.choice;
	}
}
