/*************************************************************************
  Assignment: Assignment 3 (Blackjack)
  * Description: The game of Blackjack against the computer.
  * Name: Jaden Wang
  * Date: 2015-11-06
  * Course: ICS3U1
  * ************************************************************************/
import java.util.Scanner;
public class A3_Wang_Jaden {
  
  public static void main(String[] args) { 
    /******************************************************************
      Variable Dictionary
      int dealerCount = sum of dealer's cards
      int playerCount = sum of player's cards
      int dealerOne = Dealer's first card
      int dealerTwo = Dealer's second card
      int playerOne = Player's first card
      int playerTwo = Player's second card
      ******************************************************************/
    
    int dealerOne = (int) Math.floor(Math.random() * 11) + 1;
    int dealerTwo = (int) Math.floor(Math.random() * 11) + 1;
    int playerOne = (int) Math.floor(Math.random() * 11) + 1;
    int playerTwo = (int) Math.floor(Math.random() * 11) + 1;
    
    int dealerCount = dealerOne + dealerTwo;
    int playerCount = playerOne + playerTwo;
    
    int nextCard;
    
    String answer;
    Scanner input = new Scanner(System.in);
    
    boolean inGame = true;
    boolean victory = false;
    //dealerCount = 22;
    //playerCount = 21;
    System.out.println("Welcome to Blackjack!\n");
    
    if (dealerCount > 21 || (dealerCount > 21 && playerCount > 21))
    {
      System.out.println("-----Dealer busted! You win!-----");
      victory = true;
    }
    else if (playerCount > 21)
    {
      System.out.println("-----You busted! You lost!-----");
      victory = true;
    }
    else if (playerCount == 21 || (dealerCount == 21 && playerCount == 21))
    {
      System.out.println("-----You got a Blackjack! You won!-----");
      victory = true;
    }
    else if (dealerCount == 21)
    {
      System.out.println("-----Dealer got a Blackjack! You lost!-----");
      victory = true;
    }
    
    System.out.println("Dealer cards: " + dealerOne + ", ?");
    System.out.println("Your cards: " + playerOne + ", " + playerTwo + "\n");
    
    
    while (inGame == true && victory == false){
      System.out.println("Hit or Stand?");
      answer = input.nextLine();
      if (answer.equalsIgnoreCase("hit"))
      {
        playerCount += (int) Math.floor(Math.random() * 11) + 1;
        System.out.println("You are at " + playerCount + "!");
        if (playerCount > 21)
        {
          System.out.println("-----You busted! You lost!-----");
          inGame = false;
          victory = true;
        }
        else if (playerCount == 21)
        {
          System.out.println("-----You got a Blackjack! You won!-----");
          inGame = false;
          victory = true;
        }
      }
      else if (answer.equalsIgnoreCase("stand"))
      {
        System.out.println("You stood at " + playerCount + "!");
        inGame = false;
        
      }
      else 
        System.out.println("Answer must be hit or stand.");
    }
    
    if (victory == false)
    {
      System.out.println("Dealer's turn!");
      System.out.println("Dealer's first two cards were " + dealerOne + " and " + dealerTwo + ".");
      while (dealerCount < 17)
      {
        
        nextCard = (int) Math.floor(Math.random() * 11) + 1;
        System.out.println("Dealer got a(n) " + nextCard);
        dealerCount = dealerCount + nextCard;
        
      }
      System.out.println("Dealer has " + dealerCount + " and you have " + playerCount + ".");
      if (dealerCount == 21)
        System.out.println("-----The dealer wins!-----");
      else if (dealerCount > 21)
        System.out.println("-----You win!-----");
      else if (21 - dealerCount < 21 - playerCount)
        System.out.println("-----The dealer wins!-----");
      else
        System.out.println("-----You win!-----");
      
    }
  }
}
