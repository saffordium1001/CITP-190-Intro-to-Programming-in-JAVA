/*
====================================================================================================
Student: Twymun Safford
Date: 04/22/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
Instructor: Maissam Khalil
Course Roster Application
Instructor Class

Description: This application records and sorts students into courses; also manages student
enrollment
====================================================================================================
 */
package courseapp.twymunsafford;

//Instructor class - extends the abstract person class
public class Instructor extends Person 
{
/*
=================================================
Private Instance Variables
=================================================
*/
    private String title;
    private String department;

/*
=================================================
Getter and Setter for Instructor's title
=================================================
*/ 
    //getter method for instructor's title
    public String getTitle() 
    {
        return title;
    }
   
    //setter method for instructor's title
    public void setTitle(String title) 
    {
        this.title = title;
    }
/*
=================================================
Getter and Setter for Instructor's Department
=================================================
*/ 
    
    //getter method for instructor's department
    public String getDepartment() 
    {
        return department;
    }
    
    //setter method for instructor's department
    public void setDepartment(String department) 
    {
        this.department = department;
    }

/*
=================================================
toString method
=================================================
*/ 
    @Override
    public String toString() 
    {
        return super.toString() + "\t" + title + "\t" + department;
    }
}
