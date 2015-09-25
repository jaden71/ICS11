/**************************************************************************
* Assignment: Assignment 2 (Weather Report)
* Description: A Mad-Lib type application with a weather theme.
* Name: Jaden Wang
* Date: 2015-09-25
* Course: ICS3U1
* ************************************************************************/
//import required classes
import java.util.Scanner;
import java.text.DecimalFormat;

public class A2_Wang_Jaden {
  
    public static void main(String[] args) { 
        /******************************************************************
        Variable Dictionary
        String province = This is a province string inputted by user.
        String male = This is a male name string inputted by user.
        String female = This is a female name inputted by user.
        String city = This is a city string inputted by user.
        int wholeNum = This is the time inputted by user.
        double realNum = This is the amount of kilometers inputted by user.
        String comment = This is the user's comment.
        ******************************************************************/
      
        //****************Declare variables for user input*****************
        String province;
        String male;
        String female;
        String city;
        int wholeNum;
        double realNum;
        String comment;
        //*****************************************************************
        
        //Declare scanner variable
        Scanner input = new Scanner(System.in);
        //Declares format variable
        DecimalFormat dec = new DecimalFormat("0.0");
        
        //************Asks user for the desired information****************
        System.out.print("Please enter a provice or state:");
        province = input.nextLine();
        
        System.out.print("Please enter a male name:");
        male = input.nextLine();
        
        System.out.print("Please enter a female name:");
        female = input.nextLine();
        
        System.out.print("Please enter a city:");
        city = input.nextLine();
        
        System.out.print("Please enter a number between 1 and 12:");
        wholeNum = input.nextInt();
        
        System.out.print("Please enter a real number:");
        realNum = input.nextDouble();
        input.nextLine();
        
        System.out.print("Please enter a comment about the storm:");
        comment = input.nextLine();
        //*****************************************************************
        
        //Closes the input
        input.close();
        
        //**************************************Prints the Weather Report**********************************************
        System.out.println(province + "ers who were hit hard by hurricane " + male + " two years ago were " +
                           "hunkering\ndown for tropical storm " + female + ".\n");
        
        System.out.println(female +" isn't expected to be quite as ferocious as " + male +", but will almost\n" +
                           "certainly churn ashore early Tuesday with its centre near the lake\nin southeast " 
                           + province + ", said the Canadian Hurricane Centre in " + city + ".\n");
        
        System.out.println("However the storm's effects will be far-reaching with impacts spreading\nwell away " +
                           "from the storm's track, the centre said in a bulletin issued at\n" + wholeNum + "p.m.\n");
        
        System.out.println("Forecasters say " + female + " will touch down as a hurricane or a strong\ntropical " +
                           "storm, depending on its wind speed.\n");
        
        System.out.println("Tropical storm warnings and hurricane watches were in effect for parts of\nsouthern " + 
                           "and eastern " + province + ".\n");
        
        System.out.println("The storm's winds were clocked at " + dec.format(realNum) + " kilometres per hour as it " +
                           "headed\ntoward the island at 55 kilometres per hour.\n");
        
        System.out.println("A local resident was interviewed and said, \"" + comment + "\".");
        //*************************************************************************************************************
        
  }//end main
}//end class
