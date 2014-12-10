public class DetermineWinner extends GameEngine
{
	// Initialize global variables;
	public int winCount;
	public int loseCount;
	public int drawCount;
	
	// Constructor with (variables/fields) to pass values
	public DetermineWinner() 
	{
		// Constructor Code placeholder
		super();
	} // end constructor Welcome

	// The determineWinner method returns the output based on parameters
	public String determineWinner (String computerChoice, String userChoice) 
	{    
		String output;
    
		output = "The computer's choice is " + computerChoice + ".\n";
		output += "The player's choice is " + userChoice + ".\n\n";

		// If player plays HI
		if (userChoice.equalsIgnoreCase("HI")) 
		{
			if (computerChoice.equalsIgnoreCase("LO"))
			{
				output += "Player guessed too high! You Lose!\n";
				loseCount++;
			}
				else if (computerChoice.equalsIgnoreCase("HI"))
				{
					output += "Player guessed high correctly! You Win!\n";
					winCount++;
				}
					else
					{
						output += "The game is tied!\nPlay again...\n";
						drawCount++;
					}
		} // end If player plays HI
		
		// If player plays LO
		else if (userChoice.equalsIgnoreCase("LO")) 
		{
			if (computerChoice.equalsIgnoreCase("HI"))
			{
				output += "Player guessed too low! You Lose!\n";
				loseCount++;
			}
				else if (computerChoice.equalsIgnoreCase("LO"))
				{
					output += "Player guessed low correctly! You Win!\n";
					winCount++;
				}
					else
					{
						output += "The game is tied!\nPlay again...\n";
						drawCount++;
					}
		} // end If player plays LO
    
		return output;
	} // end determineWinner method

} // end class DetermineWinner