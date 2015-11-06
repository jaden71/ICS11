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
    String answer;
    Scanner input = new Scanner(System.in);
    //dealerCount = 22;
    //playerCount = 21;
    System.out.println("Welcome to Blackjack!");
    
    if (dealerCount > 21 || (dealerCount > 21 && playerCount > 21))
      System.out.println("Dealer busted! You win!");
    
    else if (playerCount > 21)
      System.out.println("You busted! You lost!");
    
    else if (playerCount == 21 || (dealerCount == 21 && playerCount == 21))
      System.out.println("You got a Blackjack! You won!");
    
    else if (dealerCount == 21)
      System.out.println("Dealer got a Blackjack! You lost!");
    
      System.out.println("Dealer cards: " + dealerOne + ", ?");
      System.out.println("Your cards: " + playerOne + ", " + playerTwo);
    
    do{
    System.out.println("Hit or Stand?");
    answer = input.nextLine();
    
    if (answer.equalsIgnoreCase("Hit"))
      playerCount = (int) Math.floor(Math.random() * 11) + 1;
   
    
  }while(answer.equalsIgnoreCase("hit"));
  
 
  
}
}
