/*
====================================================================================================
Student: Twymun Safford
Date: 03/25/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
Instructor: Maissam Khalil
Grid Application (Drawing Box)
Description: This application draws a box within a grid based upon user input of the box's next
direction and magnitude - this is the main Java class
====================================================================================================
 */
 
/*
=================================================
Import Packages
=================================================
*/
import java.util.Scanner;
import java.util.regex.*;  

/*
=================================================
Main Grid Class
=================================================
*/


public class GridApp {
    public static void main(String[] args) {
             //introduce user to the program
        System.out.println("**********************************************************************");
        //use a new line to separate the border line above from the program name below
        System.out.println("*                                                                    *");
        //describe what the program does 
        System.out.println("*                    'Grid Application'                              *");
        System.out.println("*                    By: Twymun Safford                              *");
        System.out.println("*  This program will create a new box object within a grid           *");
        System.out.println("*  - the box can move and grow in magnitude based on user            *");
        System.out.println("*  input!                                                            *");
        System.out.println("*                                                                    *");
//finish here by enclosing the initials inside another border 
        System.out.println("**********************************************************************");
               // def variables
        String userChoice;
        String sentence;
        int magnitude;
        boolean done = false;
        Scanner stdln = new Scanner(System.in);
        //create new 10 x 10 grid
        Grid grid = new Grid(10, 10);
        Box box;
        //as long as the user does not opt to exit, user can select another move
        while(!done)
        {
            //create grid
            grid.draw();
            System.out.println("Please enter (U)p, (D)own, (L)eft, (R)ight, or (E)xit (capital letters only): ");
            //get user input for next move
            userChoice = stdln.nextLine();
            //convert to uppercase choice
            userChoice = userChoice.toUpperCase();
            //check if user entered proper input - if not, print error message and tell user to try again
            //get input
            if (!userChoice.matches("[UDLRE]{1}"))
                        {
                        System.out.println("\nInvalid entry. Please enter (U)p, (D)own, (L)eft, (R)ight, or (E)xit (capital letters only): ");
			userChoice = stdln.nextLine();
                        }
            if (!userChoice.equals("E"))
            {
                //prompt user to enter magnitude for movement
                System.out.println("Please enter a magnitude(integer) between 0 and 10 inclusive: ");
                magnitude = stdln.nextInt();
                //check if the user entered a proper value for the magnitude
                if((magnitude < 0) || (magnitude%1 != 0))
                {
                 System.out.println("\nInvalid entry. Please enter a magnitude(integer) between 0 and 10 inclusive: ");
		magnitude = stdln.nextInt();
                }
                sentence = stdln.nextLine();
                Vector vector = new Vector(userChoice, magnitude);
                box = grid.getBox();
                box.push(vector);
            }
            else if (userChoice.equals("E"))
            {
                done = true;
            }
        }        
    }  
}
