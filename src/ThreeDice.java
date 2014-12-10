// ThreeDice subclass of GameEngine superclass
public class ThreeDice extends GameEngine
{	
	public ThreeDice(int dNum) 
	{
		super();
		System.out.println("ThreeDice Dice No.1 = " + d1 +
							"\nThreeDice Dice No.2 = " + d2 +
								"\nThreeDice Dice No.3 = " + d3);
		Throw = d1 + d2 + d3;
	} // end constructor ThreeDice
	
	// Method to get and return choice
	public static String getChoice(int number) 
	{
		switch (number) 
		{
    		case 1:
    			choice = "LO";
    			break;
    		case 2:
    			choice = "LO";
    			break;
    		case 3:
    			choice = "LO";
    			break;
    		case 4:
    			choice = "LO";
    			break;
    		case 5:
    			choice = "LO";
    			break;
    		case 6:
    			choice = "LO";
    			break;
    		case 7:
    			choice = "LO";
    			break;
    		case 8:
    			choice = "LO";
    			break;
    		case 9:
    			choice = "LO";
    			break;
    		case 10:
    			choice = "HI";
    			break;
    		case 11:
    			choice = "HI";
    			break;
    		case 12:
    			choice = "HI";
    			break;
    		case 13:
    			choice = "HI";
    			break;
    		case 14:
    			choice = "HI";
    			break;
    		case 15:
    			choice = "HI";
    			break;
    		case 16:
    			choice = "HI";
    			break;
    		case 17:
    			choice = "HI";
    			break;
    		case 18:
    			choice = "HI";
    			break;
    		default:
    			choice = null;
		}
			return choice;
	} // end getChoice method
	
    public String getThrow( int numOfGet )
    {
		throwSum = Throw;
		System.out.println( "TwoDice ALL Dice thrown = " + throwSum );
		
		if (throwSum <= 9)
		{
			throwSum = 1;
		}
			else if (throwSum >= 10)
			{
				throwSum = 18;
			}
				// Return the computer's choice.
				return getChoice (throwSum);
    } // end getThrow method
    
	// Method should generate a random number and
	// 	return the computers choice.
    public static String computerChoice() 
	{
		if (Throw <= 9)
		{
			Throw = 1;
		}
			else if (Throw >= 10)
			{
				Throw = 18;
			}
				// Return the computer's choice.
				return getChoice(Throw);
	} // end computerChoice method

} // end class ThreeDice