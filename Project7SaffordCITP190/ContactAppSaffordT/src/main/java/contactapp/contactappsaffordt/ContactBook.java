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
package contactapp.contactappsaffordt;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class ContactBook {

    //private instances entries - Contact objects
    private Contact entries[] = null;
    private ContactFileManager fileMan = new ContactFileManager();
    //counter - used to count number of contactbook objects, etc.
    private int counterContacts;
    Scanner stdln = new Scanner(System.in);

    /*
=================================================
Default ContactBook Constructor
=================================================
     */
    public ContactBook() {
        //for the sake of an aray that is much, much larger and exhaustive,
        //i started with 5 entries
        this.entries = new Contact[5];
        //set the initial counter to zero
        this.counterContacts = 0;
    }


    /*
=================================================
Public Void Method - Add
=================================================
     */
    //adds Contact object to into the entries array
    public void add(Contact c) {
        //check to see if the entry being added
        //can be - check to see if current entry is null
        //and if it is override it
        if (entries[counterContacts] == null) {
            //overwrite that entry with the new contact object
            entries[counterContacts] = c;
            //Incrementing counter.
            counterContacts++;
        } //otherwise, resize the array by creating a copy of it,
        //increasing the length by one, and then adding the entry
        else {
            entries = Arrays.copyOf(entries, (entries.length + 1));
            entries[(entries.length - 1)] = c;
            //Increment the counter
            counterContacts++;
        }
         System.out.println("\nContact added!");
    }

    /*
=================================================
Public Void Method - Update
=================================================
     */
    //replaces the contact in entries with the integer's position
    //with the parameter contact
    
    //NOTE: SAVES THIS TO THE TOP DIRECTORY OF Project 7/ContactAppSaffordT
    public void update(Contact c, int position) {
        while (position > entries.length && position < 0) {
            System.out.println("\nInvalid choice! Please enter a valid index: ");
            position = stdln.nextInt();
            update(c, position);
        }
        //otherwise, update the entry with new contact information
        entries[position]=c;
        System.out.println("\nContact updated!");
    }

    /*
=================================================
Public Void Method - Remove
=================================================
     */
    //removes the contact in entries array at position; moves remaining
    //contacts up in array to replace them
    public void remove(int position) {
        //check if the user has made an invalid entry for position - if so,
        //tell them
        while (position > entries.length && position < 0) {
            System.out.println("\nInvalid choice! Please enter a valid index: ");
            position = stdln.nextInt();
            remove(position);

        }
        //otherwise, if the choice was valid
        //Remove that element from the user specified index
        //using a loop
        for (int i = position; i < (entries.length - 1); i++) {
            //update the elements in the entries to move up one
            entries[i] = entries[i + 1];
        }
        //now, resize the contact object
        entries = Arrays.copyOf(entries, (entries.length - 1));
        //since we removed an entry, we need to decrement the counter by one
        counterContacts--;
        System.out.println("\nContact removed!");
    }
    
        /*
=================================================
Public Void Method - Save
=================================================
     */
    //saves the contact book object to be retreived
    //later
    public void save() 
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter filename to save data to: ");
		String fileName = sc.nextLine();
                //use try/catch to see if the file can be written to
                //if saving fails, print a statement showing as such
		try 
                {
			fileMan.writeContacts(fileName, entries);
		} 
                catch (IOException e) 
                {
			System.out.println("\nUnable to save to file.");
		}

	}
        /*
=================================================
Public Void Method - Load
=================================================
     */
    //loads the contact book object from file
public void load() 
{
		Scanner sc = new Scanner(System.in);

		System.out.println("\nPlease enter filename to load from: ");
		String fileName = sc.nextLine();
                //use I/O exception - check to see if the file can be loaded
                //or not
		try 
                {
			entries = fileMan.readContacts(fileName);
		} 
                //if the file can't be found or another issue occurs print to line
                //that the file could not be loaded
                catch (IOException e) 
                {
			System.out.println("\nUnable to load the file. Check your file name or location and try again.");
		} 
                catch (ClassNotFoundException e) 
                {
			System.out.println("\nUnable to load the file. Check your file name or location and try again.");
		}

	}
    /*
=================================================
Public Method - toString()
=================================================
     */
    //Return a single string containing the contact's index number,
    //result of the toString() method, and new line character
    @Override
    public String toString() {
       
        //new string builder
        String contents="\n";
         //check to see if the contactbook is actually empty
        if (entries[0]==null)
        {
            return "Looks like the contact book is currently empty!";
        }
        //print each object entry in the entries array
        for (int i = 0; i < counterContacts; i++) 
        {
            //print entry number index along with contents
            contents += (i)+")"+entries[i].toString()+"\n";
        }
        //return output to string
        return contents;
    }

}
