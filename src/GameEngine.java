import java.util.Random;

public class GameEngine
{
       int rNum = 0;
       static int Throw = 0;
       static String lastValueThrown = null;
       int countNumberOfDices = 0;
       int d1 = 0;
       int d2 = 0;
       int d3 = 0;
       int throwSum = 0;
       static String choice = null;
       String output;
       String countWinLoss;
       public int winCount = 0;
       public int loseCount = 0;
       public int drawCount = 0;
       Random randNum = new Random();

       // Constructor GameEngine
       public GameEngine()
       {
              // Generate a random number in the range of
              //     1 through 6.
    	   	  countNumberOfDices++;
    	   	  d1 = randNum.nextInt(6) + 1;
              countNumberOfDices++;
              d2 = randNum.nextInt(6) + 1;
              countNumberOfDices++;
              d3 = randNum.nextInt(6) + 1;
              
              Throw = d1 + d2 + d3;
       } // end constructor GameEngine

       // Method to get and return choice
       // Hi:  More than half of dice(s) value  (1 dice this means 4,5,6  .... 2 dices means 7 to 12....)
       // Lo:  Less than or equal to half of dice(s) value (1 dice this means 1,2,3  .... 2 dices means 1 to 6....)
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
                     choice = "HI";
                     break;
              case 5:
                     choice = "HI";
                     break;
              case 6:
                     choice = "HI";
                     break;
              default:
                     choice = null;
              }
              return choice;
       } // end getChoice method

    public void Throw()
    {
       throwSum = randNum.nextInt(Throw) + 1;
    } // end Throw method

    public String getThrow( int numOfGet )
    {
              throwSum = Throw;
              System.out.println( "GameEngine ALL Dice thrown = " + throwSum );

              if (throwSum <= 3)
              {
            	  throwSum = 1;
              }
              		else if (throwSum >= 4)
              		{
              			throwSum = 6;
              		}
              		// Return the computer's choice.
              		return getChoice(throwSum);
    } // end getThrow method

    // Method should generate a random number and
    //     return the computers choice.
    public static String computerChoice()
       {
              if (Throw <= 3)
              {
            	  Throw = 1;
              }
              		else if (Throw >= 4)
              		{
              			Throw = 6;
              		}
                     // Return the computer's choice.
                     return getChoice(Throw);
       } // end computerChoice method

    // ToString method that returns the number of dices and last value thrown
    public String toString(int rNum) 
    {
        countNumberOfDices = rNum;
    	System.out.println("\nGameEngine ToString Method:\nThe number of dices = " + countNumberOfDices);
    	lastValueThrown = Integer.toString(Throw);
        System.out.println("The last value thrown = " + lastValueThrown);
        return lastValueThrown; 
	} // end toString method
     
} // end class GameEngine