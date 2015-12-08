/**
 * Auto Generated Java Class.
 */
public class Testing {
  
  
  public static void main(String[] args) { 
    String phrase = "testing";
    String newPhrase = "";
      for (int i = 0; i < phrase.length(); i++){
      if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'e' || phrase.charAt(i) == 'i' || phrase.charAt(i) == 'o' || phrase.charAt(i) == 'u')
      
      newPhrase = newPhrase + "%";
      else
      newPhrase = newPhrase + phrase.charAt(i);
      }  
        
        
      System.out.println(newPhrase);
    }
    
    /* ADD YOUR CODE HERE */
    
    }
