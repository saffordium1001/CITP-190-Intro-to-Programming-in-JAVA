/*
====================================================================================================
Student: Twymun Safford
Date: 02/18/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
Instructor: Maissam Khalil
Circle Calculator
Description: This application calculates the diameter, circumference, and area of a circle.
====================================================================================================


/*
=================================================
Import Packages - Interest Application, Scanner
=================================================
*/
package com.circleappsafford;
import java.util.Scanner;

public class CircleApp {

/*
=================================================
Main Method
=================================================
*/
	public static void main(String[] args) 
        {
             //introduce user to the program
        System.out.println("**********************************************************************");
        //use a new line to separate the border line above from the program name below
        System.out.println("*                                                                    *");
        //describe what the program does 
        System.out.println("*                    'Circle Calculator'                             *");
        System.out.println("*                    By: Twymun Safford                              *");
        System.out.println("*  This program will calculate the diameter, circumference,          *");
        System.out.println("*  and area of a circle based on user input of the radius.           *");
        System.out.println("*                                                                    *");
        //finish here by enclosing the initials inside another border 
        System.out.println("**********************************************************************");
		//This is the object of Scanner class, it will help to take value from the user
		Scanner scan = new Scanner(System.in);
		double radius = 0.0;
		
		//This is the object of Circle class
		Circle circle = new Circle();
		
		char option = 'Y';
		
		while(option == 'Y') 
                {
			System.out.println("Enter a radius: ");
			radius = scan.nextDouble();
                        
                        //check if the user entered the proper dimensions (radius can't be negative)
                        while (radius <0.0)
                        {
                        System.out.println("\nPlease enter a valid radius. Radius can only be a positive value.");
			radius = scan.nextDouble();
                        }
			
			//set the radius
			circle.setRadius(radius);
			
			//Get the diameter
			System.out.println("Diameter: "+ circle.getDiameter());
			
			//Get the diameter
			System.out.println("Circumference: "+ circle.getCircumference());
			
			//Get the diameter
			System.out.println("Area: "+ circle.getArea());
			
			
			//Prompt user to see if they want another circle 
			System.out.println("Would you like to enter another circle? (Y/N) ");
			option = scan.next().charAt(0);
		}//while() end 

	}//main() end

}//CircleApp end

