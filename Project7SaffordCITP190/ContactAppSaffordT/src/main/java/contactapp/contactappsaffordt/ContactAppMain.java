/*
====================================================================================================
Student: Twymun Safford
Date: 05/03/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
For FILE I/O
Instructor: Maissam Khalil
Contact App Application - ContactFileManager Class
Description: This application creates and maintains a contact book based on user input; now implements
serializable requirement
====================================================================================================
 */

 /*
=================================================
Import Packages - Interest Application, Scanner
=================================================
 */
package contactapp.contactappsaffordt;

import java.util.Scanner;
import java.util.regex.*;

public class ContactAppMain {

    /*
=================================================
Main Method
=================================================
     */
    public static void main(String[] args) {

        /*
=================================================
Variables
=================================================
         */
        //initialize the contactbook object
        ContactBook contactBook = new ContactBook();
        //create new scanner for reading input
        Scanner scanner = new Scanner(System.in);
        //initialize userchoice to zero but set inside while loop
        int userChoices = 0;
        //display the menu here
        displayProgramMenu();
        String name, address, phone, email;
        while (!"7".equals(userChoices)) {
            //display menu choices
            menuChoices();
            //need integer to represent switch case statements for user choices
            userChoices = Integer.parseInt(scanner.nextLine());
            if (userChoices >= 1 && userChoices <= 7) {
                //begin switch case statements
                switch (userChoices) {
                    case 1: 
                    {
                        //for cass 1, adding a contact
                        Contact contact = contactInformation();
                        //add contact
                        contactBook.add(contact);
                        //break
                        break;
                    }
                    //updating a contact in position
                    case 2: 
                    {
                    
                    System.out.println("Enter the position to be updated: ");
                    int pos = Integer.parseInt(scanner.nextLine());
                    Contact c = contactInformation();
                    contactBook.update(c, pos);
                    break;
                    }
                    //case 3 - remove a contact
                    case 3: {
                        //ask user to enter information to be removed
                        System.out.println("\nEnter the position of contact to be removed: ");
                        int pos = Integer.parseInt(scanner.nextLine());
                        //remove the entry from contact book
                        contactBook.remove(pos);
                        break;
                    }
                    //case 4 - display all contacts
                    case 4: {
                        System.out.println(contactBook);
                        break;
                    }
                    //case 5 - now updated to save the entire contact book to file
                    case 5: {
                        contactBook.save();
                        break;
                    }
                    
                    //case 6 - now updated to load entire contact book from file
                     case 6: {
                        contactBook.load();
                        break;
                    }
                    //case 7 - exit the program
                    case 7:{
                    System.out.println("\nGoodye! Hope to see you again!");
                        break;
                    }
                }
            } else {
                System.out.println("\nInvalid choice, try again!");
                menuChoices();
                userChoices = Integer.parseInt(scanner.nextLine());
            }
        }
    }

    /*
=================================================
Display Menu
    {
            //introduce user to the program
=================================================
     */
    public static void displayProgramMenu() {
        //introduce user to the program
        System.out.println("**********************************************************************");
        //use a new line to separate the border line above from the program name below
        System.out.println("*                                                                    *");
        //describe what the program does 
        System.out.println("*                     'Contact Book'                                 *");
        System.out.println("*                    By: Twymun Safford                              *");
        System.out.println("*  This program creates an interactive contact book where the        *");
        System.out.println("*  user can view, add, edit, or remove contacts within their         *");
        System.out.println("*  electronic contact list.                                          *");
        System.out.println("*                                                                    *");
        System.out.println("**********************************************************************");
        System.out.println("\n");
    }

    /*
=================================================
Show Menu Choices
=================================================
     */
    public static void menuChoices() {
        //give user selection of choices to pick
        System.out.println("**********************************************************************");
        //use a new line to separate the border line above from the program name below
        System.out.println("*                                                                    *");
        System.out.println("*  Please choose from one of the following:                          *");
        System.out.println("*                                                                    *");
        System.out.println("*                                                                    *");
        System.out.println("*  1.) Add a contact                                                 *");
        System.out.println("*  2.) Update a contact                                              *");
        System.out.println("*  3.) Remove a contact                                              *");
        System.out.println("*  4.) List all contact                                              *");
        System.out.println("*  5.) Save Contact Book                                             *");
        System.out.println("*  6.) Load Contact Book                                             *");
        System.out.println("*  7.) Exit                                                          *");
        System.out.println("*                                                                    *");
        System.out.println("**********************************************************************");
        System.out.println("\n");
    }

    /*
=================================================
Method - Get Contact Information
=================================================
     */
    private static Contact contactInformation() {
        Scanner scanner = new Scanner(System.in);
        //ask for name
        System.out.println("\nEnter the contact's name: ");
        String name = scanner.nextLine();
        while(!validName(name))
        {
            System.out.println("\nInvalid name! Please enter a real name: ");
            name = scanner.nextLine();
        }
        //ask for mailing address
        System.out.println("\nEnter the contact's mailing address: ");
        String address = scanner.nextLine();
        //ask for phone number
        System.out.println("\nEnter the contact's phone number: ");
        String phone = scanner.nextLine();
        // Checking if the string for the phone number is valid or not
        while(!validNumber(phone))
        {
            System.out.println("\nInvalid phone number! Please enter a recognizable global format for the phone number: ");
            phone = scanner.nextLine();
        }
        //ask for email
        System.out.println("\nEnter the contact's email address: ");
        String email = scanner.nextLine();
         while(!validEmail(email))
        {
            System.out.println("\nInvalid email! Please enter a valid email address: ");
            email = scanner.nextLine();
        }
        //creates new contact object used for adding or updating contact information
        Contact contact = new Contact();
        //set all strings
        contact.setName(name);
        contact.setPhone(phone);
        contact.setAddress(address);
        contact.setEmail(email);
        return contact;
    }
    
    
            /*
=================================================
Method - Check if a Name is Valid
=================================================
     */
    public static boolean validName(String name)
    {
  
        // Regex to check valid name
        String regx = "^[\\p{L} .'-]+$";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regx);
 
        // If the username is null return false by default
        if (name == null) {
            return false;
        }
  
        //matcher() method  to find matching between given username
        // and regular expression.
        Matcher m = p.matcher(name);
  
        // Return if the username matched the ReGex
        return m.matches();
    }
    
        /*
=================================================
Method - Check if a Phone Number is Valid
=================================================
     */
    
     public static boolean validNumber(String s)
    {
 
        // Use regular expressions to validate if a mobil number if correct through the pattern class
        Pattern p = Pattern.compile(
            "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$");
 
        // object of matcher class - used to check if a string (in this case phone number) matches whats expected
        Matcher m = p.matcher(s);
        // Returns boolean value
        return (m.matches());
    }
     
        /*
=================================================
Method - Check if an Email Entry is Valid
=================================================
     */     
     public static boolean validEmail(String s)
    {
        //emails have strings such as emailsample@<domain>.<net/com/us/gov>
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        //if the string entered by the user is null return false by default - no email was entered
        if (s == null)
        {
            return false;
        }
        //return the boolean result of pattern matching
        return pat.matcher(s).matches();
    }
}

