import java.util.Scanner;
public class Lol {
  
  
  public static void main(String[] args) { 
    int count = 0;
    int answer = 0;
    int[] marks = new int[11];
    Scanner input = new Scanner(System.in);
    do{
      System.out.println("Enter a mark out of 10");
      answer = input.nextInt();
    if (answer <= 10 && answer >= 0)
    {
      marks[answer] ++;
    }
    }while(answer >= 0);
    System.out.println("Score     # of Occurences");
    for (int i = 0; i < 11; i++)
    {
      System.out.println(i + "         " + marks[i]);
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
