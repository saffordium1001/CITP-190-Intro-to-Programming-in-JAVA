/*
====================================================================================================
Student: Twymun Safford
Date: 01/25/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
Instructor: Maissam Khalil
Application Interest App
Description: This application will calculate and display user's Compounded Interest
====================================================================================================
 */

/*
=================================================
Import Packages - Interest Application, Scanner
=================================================
*/
//to parse text phrases and strings
import java.util.Scanner;

public class InterestAppTwymunSafford {
    public static void main(String[] args) {
        //introduce user to the program
        System.out.println("**********************************************************************");
        //use a new line to separate the border line above from the program name below
        System.out.println("*                                                                    *");
        //describe what the program does 
        System.out.println("*              'Interest Calculator Application'                     *");
        System.out.println("*                    By: Twymun Safford                              *");
        System.out.println("*  This program will calculate and display the compound              *");
        System.out.println("*  interest that a user has earned on a bank depsoit.                *");
        System.out.println("*                                                                    *");
        //finish here by enclosing the initials inside another border 
        System.out.println("**********************************************************************");

        //Display welcome message
        System.out.println("Welcome to Interest Calculator App! This application will calculate and display the user's compounded interest based on initial principal, rate, and term.");

        /*
=================================================
Variable Declarations
=================================================
         */
        //principal amount
        double principal = 0.0;
        //annual percentage (interest) rate
        double annualPercentage = 0.0;
        //years for account
        int years = 0;

        //configure the scanner - needs to read user input 
        Scanner in = new Scanner(System.in);

        //Prompt user to input their beginning principal amount
        System.out.println("Please enter the principal (beginning) amount: ");
        //User now has to input that value and press enter
        principal = in.nextDouble();
        //Prompt user to input the APR
        System.out.println("Enter the APR (Annual Percentage Rate): ");
        //user inputs APR
        annualPercentage = in.nextDouble();
        //Prompt user to enter years
        System.out.println("Enter the number of years: ");
        //user enters the number of years
        years = in.nextInt();

        /*
=================================================
Calculations
=================================================
 */

//calculate the monthly rate first by adding 1 to the APR divided by 1200
double monthlyRate = 1 + (annualPercentage/1200);
//calculate the annual rate by raising the monthly rate to the 12th power - 12 months
double annualRate = Math.pow(monthlyRate, 12);
//calculate the final term rate - raise monthly rate to power of number of years user specified
double finalTermRate = Math.pow(annualRate, years);
//finally, calculate total accrued by multiplying principal amount to final term rate
double totalFinal= principal* finalTermRate;
//format the double for the total accrued to two decimal places only

//display output to screen 
System.out.println("Total accrued amount: $" + String.valueOf(totalFinal));
    }
    
}
