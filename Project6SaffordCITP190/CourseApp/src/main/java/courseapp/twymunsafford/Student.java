/*
====================================================================================================
Student: Twymun Safford
Date: 04/22/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
Instructor: Maissam Khalil
Course Roster Application
Student Class

Description: This application records and sorts students into courses; also manages student
enrollment
====================================================================================================
 */
package courseapp.twymunsafford;

//Student class - extends the abstract person class
public class Student extends Person 
{
/*
=================================================
Private Instance Variables
=================================================
*/
    private String major;
    private double gpa;

/*
=================================================
Getter and Setter for Student's Major(s)
=================================================
*/
    //implement here a manner
    //to assess how many major(s) a student has
    //getter - for studen't major
    public String getMajor() 
    {
        return major;
    }
 
    //setter for student's major
    public void setMajor(String major) 
    {
        this.major = major;
    }
    
/*
=================================================
Getter and Setter for Student's GPA
=================================================
*/
    //getter for the student' gpa
    public double getGpa() 
    {
        return gpa;
    }
    
    //setter for the student's gpa
    public void setGpa(double gpa) 
    {
        this.gpa = gpa;
    }
    
/*
=================================================
ToString()
=================================================
*/
    @Override
    public String toString() 
    {
        return super.toString() + "\t" + major + "\t" + gpa;
    }
}
