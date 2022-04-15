/*
====================================================================================================
Student: Twymun Safford
Date: 02/11/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
Instructor: Maissam Khalil
Rock, Paper, Scissors
Description: This application conducts a simple game of "Rock, Paper, Scissors" - the user
plays RPS versus a computrer opponent
====================================================================================================
 */
 /*
=================================================
Import Packages
=================================================
 */
//Rock, Paper, Scissors package
package com.rockpaperscissorssafford.rockpaperscissorssafford;
//scanner

import java.util.*;
//class

public class RockPaperScissorsSafford {

    /*
=================================================
Main
=================================================
     */
    public static void main(String[] args) {
        //introduce user to the program
        System.out.println("**********************************************************************");
        //use a new line to separate the border line above from the program name below
        System.out.println("*                                                                    *");
        //describe what the program does 
        System.out.println("*                   'Rock, Paper, Scissors!'                         *");
        System.out.println("*                    By: Twymun Safford                              *");
        System.out.println("*  This program implements a simple game of rock, paper, scissors.   *");
        System.out.println("*  The user plays against a comuter opponent with the option to      *");
        System.out.println("*  to play again in every case - draw, win, or loss.                 *");
        //finish here by enclosing the initials inside another border 
        System.out.println("**********************************************************************");

        //new instance of scanner class - user input
        Scanner scanner = new Scanner(System.in);
        //boolean variable - to assess if user wants to play again; true by default unless user specifies otherwise
        boolean nextRound = true;
        //variable use to store user input.
        String userEntry = "";
        char userChoice;
        //integer for computer choice
        int randNum;
        //character - converts CPU numerical choice to string
        char computerChoice = 'R';
        //character variable to hold selection for yes
        char playAgain = 'Y';
        //while loop - program loops until the user chooses not to continue (play == false)
        while (nextRound == true) 
        {
            //first, ask user for their choice
            System.out.println("\nChoose (R)ock, (P)aper, or (S)cissors: ");
            //scan for user choice
            userEntry = scanner.next(); //decided to account for case where user wanted to enter entire word
            //user choice is the first character
            userChoice = userEntry.charAt(0);
            //check if the user's input is correct
            while (!(userChoice == 'R' || userChoice == 'P' || userChoice == 'S')) 
            {
                System.out.println("\nInvalid choice. Please choose (R)ock, (P)aper, or (S)cissors: ");
                //get user choice here again - repeat until valid
                
                //scan for user choice
                userEntry = scanner.next();
                //user choice is the first character
                userChoice = userEntry.charAt(0);
            }
            //Generate a random integer of 0, 1, or 2.	
            randNum = (int) (Math.random() * 3);
            //Converts integer to computer's choice.
            switch (randNum) 
            {
                //integer for rcok
                case 0: 
                {
                    computerChoice = 'R';
                    //print what the computer selected - Rock
                    System.out.println("\nThe computer opponent chose (R)ock.");
                    break;
                }
                //integer for paper
                case 1: 
                {
                    computerChoice = 'P';
                    //print what the computer selected - Paper
                    System.out.println("\nThe computer opponent chose (P)aper.");
                    break;
                }
                //integer for scissors
                case 2: 
                {
                    computerChoice = 'S';
                    //print what the computer selected - Scissors
                    System.out.println("\nThe computer opponent chose (S)cissors.");
                    break;
                }
            }

            /*
====================================================================================================
//Conditions - for user to win, lose, or to draw
            
-------------------------------
User     | Comp     | Result  |
-------------------------------
Rock     | Rock     | Tie     |
-------------------------------
Rock     | Paper    | Lose    |
-------------------------------
Rock     | Scissors | Win     |
-------------------------------
Paper    | Rock     | Win     |
-------------------------------			
Paper    | Paper    | Tie     |
-------------------------------
Paper    | Scissors | Lose    |
-------------------------------
Scissors | Rock     | Lose    |
-------------------------------			
Scissors | Paper    | Win     |
-------------------------------
Scissors | Scissors | Tie     |
-------------------------------
            
====================================================================================================
             */
//assess the user's choice versus the computer's choices
            if (userChoice == computerChoice) 
            {
                System.out.println("Its a Draw!!");
            } 
            else if ((userChoice == 'R' && computerChoice == 'S') || (userChoice == 'P' && computerChoice == 'R') || (userChoice == 'S' && computerChoice == 'P')) 
            {
                System.out.println("You wins!!");
            } 
            else 
            {
                System.out.println("You lose!!");
            }
            //ask user if they want to lay again
            System.out.println("\nDo you want to play again(y/n): ");
            //get playAgain character from user
            playAgain = scanner.next().charAt(0);
            //convert to uppercase
            playAgain = Character.toUpperCase(playAgain);
            if (playAgain != 'Y') 
            {
                nextRound = false;
            } //otherwise, user is playing again
            else 
            {
                nextRound = true;
            }
        }

    }

}
