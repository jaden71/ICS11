/*************************************************************************
  * Assignment: Assignment 3 (Blackjack)
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
      int nextCard = The value of the next card in the deck
      String answer = User's answer whether to hit or stand
      boolean inGame = Whether it is still user's turn to play
      boolean victory = Whether anyone has won or not.
      ******************************************************************/
    //Declare user input
    Scanner input = new Scanner(System.in);
    //Declare starting hand values
    int dealerOne = (int) Math.floor(Math.random() * 11) + 1;
    int dealerTwo = (int) Math.floor(Math.random() * 11) + 1;
    int playerOne = (int) Math.floor(Math.random() * 11) + 1;
    int playerTwo = (int) Math.floor(Math.random() * 11) + 1;
    int dealerCount = dealerOne + dealerTwo;
    int playerCount = playerOne + playerTwo;
    
    //Declare next card value for dealer
    int nextCard;
    //Declare user's input (hit or stand)
    String answer;
    
    //Declare loop states ( to continue or not)
    boolean inGame = true;
    boolean victory = false;
    
    //Welcome prompt
    System.out.println("Welcome to Blackjack!\n");
    
    //Determine if anyone has won with starting hand
    
    //Determine if dealer busted or both busted
    if (dealerCount > 21 || (dealerCount > 21 && playerCount > 21))
    {
      System.out.println("Dealer busted.\n-----You win!-----");
      victory = true;
    }//end if
    //Determine if player busted
    else if (playerCount > 21)
    {
      System.out.println("You busted.\n-----You lost!-----");
      victory = true;
    }//end if
    //Determine if user got a blackjack
    else if (playerCount == 21 || (dealerCount == 21 && playerCount == 21))
    {
      System.out.println("You got a blackjack.\n-----You win!-----");
      victory = true;
    }//end if
    //Determine if dealer got a blackjack
    else if (dealerCount == 21)
    {
      System.out.println("Dealer got a blackjack.\n-----The dealer wins!-----");
      victory = true;
    }//end if
    //Display user's cards and dealer card
    System.out.println("Dealer cards: " + dealerOne + ", ?");
    System.out.println("Your cards: " + playerOne + ", " + playerTwo + "\n");
    
    //User's turn to hit or stand
    while (inGame == true && victory == false){
      System.out.println("Hit or Stand?");
      answer = input.nextLine();
      //Determine if user hits
      if (answer.equalsIgnoreCase("hit"))
      {
        //Gets another card
        nextCard = (int) Math.floor(Math.random() * 11) + 1;
        playerCount += nextCard;
        System.out.println("You got a(n) " + nextCard + ".\nYou are at " + playerCount + "!");
        //Determines if user lost from that card
        if (playerCount > 21)
        {
          System.out.println("You busted.\n-----You lost!-----");
          inGame = false;
          victory = true;
        }//end if playercount > 21
        //Determines if user won from that card
        else if (playerCount == 21)
        {
          System.out.println("You got a Blackjack.\n-----You won!-----");
          inGame = false;
          victory = true;
        }//end if playercount == 21
      }//end if hit
      //Determine if user stands
      else if (answer.equalsIgnoreCase("stand"))
      {
        System.out.println("You stood at " + playerCount + "!");
        inGame = false;
      }//end if
      //Input validation from user
      else 
        System.out.println("Answer must be hit or stand.");
    }//end while
    //Dealer's turn to hit
    if (victory == false)
    {
      System.out.println("Dealer's turn!");
      System.out.println("Dealer's first two cards were " + dealerOne + " and " + dealerTwo + ".");
      while (dealerCount < 17)
      {
        //Dealer gets a new card
        nextCard = (int) Math.floor(Math.random() * 11) + 1;
        System.out.println("Dealer got a(n) " + nextCard);
        dealerCount = dealerCount + nextCard;
      }//end while
      
      //Determine who won in the end
      System.out.println("Dealer has " + dealerCount + " and you have " + playerCount + ".");
      //Determine if dealer got a blackjack
      if (dealerCount == 21)
        System.out.println("Dealer got a blackjack.\n-----The dealer wins!-----");
      //Determine if dealer busted
      else if (dealerCount > 21)
        System.out.println("Dealer busted.\n-----You win!-----");
      //Determine who was closest to 21
      else if (21 - dealerCount < 21 - playerCount)
        System.out.println("The dealer was closer to 21.\n-----The dealer wins!-----");
      else
        System.out.println("You were closer to 21\n-----You win!-----");
      
    }//end if victory == false
  }//end main
}//end class
