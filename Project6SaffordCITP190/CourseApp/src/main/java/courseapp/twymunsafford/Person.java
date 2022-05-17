/*
====================================================================================================
Student: Twymun Safford
Date: 04/22/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
Instructor: Maissam Khalil
Course Roster Application
Person Class

Description: This application records and sorts students into courses; also manages student
enrollment
====================================================================================================
 */
package courseapp.twymunsafford;

//abstract class - Person
public abstract class Person implements Comparable<Person>
{
/*
=================================================
Private Instance Variables
=================================================
*/
    private String personId;
    private String lastName;
    private String firstName;

/*
=================================================
Getter and Setter for PersonID
=================================================
*/    
    
 // Getter method for personId
    public String getPersonId() 
    {
        return personId;
    }

    // Setter method for personId
    public void setPersonId(String personId)
    {
        this.personId = personId;
    }
 /*
=================================================
Getter and Setter for lastName
=================================================
*/
    
    // Getter method for lastName
    public String getLastName() 
    {
        return lastName;
    }

    // Setter method for lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
 /*
    
 /*
=================================================
Getter and Setter for firstName
=================================================
*/
    // Getter method for firstName
    public String getFirstName() 
    {
        return firstName;
    }

    // Setter method for lastName
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
 /*
=================================================
ToString()
=================================================
*/
    @Override 
    public String toString()
    {
        return personId + "\t" + lastName + "\t" + firstName; 
    }
/*
=================================================
Comparable <Person> Interface
=================================================
*/
    @Override 
    public int compareTo(Person person)
    {
        //check to see if both comparison
        if (lastName.equalsIgnoreCase(person.lastName)) 
        {
            return firstName.compareTo(person.firstName);
        } 
         else 
        {
            return lastName.compareTo(person.lastName);
        }
    }
}
