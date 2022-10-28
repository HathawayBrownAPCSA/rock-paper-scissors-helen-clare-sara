
/**
 * rpsMatch sets the human play and gets the computer play and the result that is called in RPS2
 *
 * @author Clare & Helen & Sara
 * @version 2022-10-26
 * 
 * Clare, Helen, and Sara typed it all together with equal contribution
 */
public class rpsMatch
{
    private int humanWins;
    private int computerWins;
    private String humanPlay;
    private String computerPlay;
    private int ties;

    /**
     * Constructor for objects of class rpsMatch
     * 
     * @param humanWins    Sets the amount of humanWins to 0
     * @param computerWins Sets the amount of computerWins to 0
     * @param ties         Sets the amount of ties to 0
     */
    public rpsMatch()
    {
        humanWins = 0;
        computerWins = 0;
        ties = 0;
    }
    
    /**
     * Returns humanPlay to HP
     * @param humanPlay Overrides to HP
     */
    public void setHumanPlay(String HP)
    {
        humanPlay = HP;
    }
    
    /**
     * Honest version of accessor method getComputerPlay
     * @returns computerPlay to either "rock", "paper", or "scissors" based on a random integer between 0-2
     */
    
    //public String getComputerPlay()
    //{
      // int CP = (int)(Math.random() * 3);
       //if (CP == 0)
       //{
         //  computerPlay = "rock";
       //}
       //else if (CP == 1)
       //{
           //computerPlay = "paper";
       //}
        //else if (CP == 2)
       //{
         //  computerPlay = "scissors";
       //}
       //return computerPlay;
    //}
    
    /**
     * Cheater version of accessor method getComputerPlay
     * @return computerPlay returns to "rock", "paper", or "scissors" with a 50% chance higher of choosing the winning choice
     */
    public String getComputerPlay()
    {
        if (humanPlay.equals("rock"))
        {
            int CP = (int)(Math.random() * 4);
             if (CP == 2)
           {
               computerPlay = "rock";
           }
           else if (CP <= 1)
           {
               computerPlay = "paper";
           }
            else if (CP == 3)
           {
               computerPlay = "scissors";
           }
        }
        if (humanPlay.equals("scissors"))
        {
            int CP = (int)(Math.random() * 4);
             if (CP == 2)
           {
               computerPlay = "paper";
           }
           else if (CP <= 1)
           {
               computerPlay = "rock";
           }
            else if (CP == 3)
           {
               computerPlay = "scissors";
           }
        }
        if (humanPlay.equals("paper"))
        {
            int CP = (int)(Math.random() * 4);
             if (CP == 2)
           {
               computerPlay = "paper";
           }
           else if (CP <= 1)
           {
               computerPlay = "scissors";
           }
            else if (CP == 3)
           {
               computerPlay = "rock";
           }
        }
        return computerPlay;
    }
    
    /**
     * Returns the result of the match depending on humanPlay and computerPlay
     * @return Wins and ties increase based on who won and returns a String sentence to go with
     */
    public String getResult()
    {
        if (computerPlay == "rock" && humanPlay == "paper" || computerPlay == "paper" && humanPlay == "scissors" || computerPlay == "scissors" && humanPlay == "rock")
        {
            humanWins += 1;
            return "you win this time....";
        }
        else if (humanPlay == "rock" && computerPlay == "paper" || humanPlay == "paper" && computerPlay == "scissors" || humanPlay == "scissors" && computerPlay == "rock")
        {
            computerWins += 1;
            return "U lost L";
        }
        else
        {
            ties += 1;
            return "read your mind";
        }
    }
    
    /**
     * @return getHumanWins to humanWins
     */
    public int getHumanWins()
    {
        return humanWins;
    }
    
    /**
     * @return getComputerWins to computerWins
     */
    public int getComputerWins()
    {
        return computerWins;
    }
    
    /**
     * @return getTies to ties
     */
    public int getTies()
    {
        return ties;
    }

}
