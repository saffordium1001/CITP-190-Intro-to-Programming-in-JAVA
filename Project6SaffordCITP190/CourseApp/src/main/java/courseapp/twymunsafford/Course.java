/*
====================================================================================================
Student: Twymun Safford
Date: 04/22/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
Instructor: Maissam Khalil
Course Roster Application
Course Class

Description: This application records and sorts students into courses; also manages student
enrollment
====================================================================================================
 */
package courseapp.twymunsafford;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Course 
{
/*
=================================================
Private Instance Variables
=================================================
*/
    private String courseId;
    private String courseName;
    private String courseCode;
    private Instructor instructor;
    // ArrayList - represents the list of students for a
    //course's roster
    private final List<Student> roster = new ArrayList<>();

/*
=================================================
Getters and Setters for CourseID
=================================================
*/  
    //getter for courseID
    public String getCourseId() 
    {
        return courseId;
    }
    //setter for courseID
    public void setCourseId(String courseId) 
    {
        this.courseId = courseId;
    }

/*
=================================================
Getters and Setters for CourseName
=================================================
*/
    //getter for courseName
    public String getCourseName() 
    {
        return courseName;
    }
    //setters for courseName
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

/*
=================================================
Getters and Setters for CourseCode
=================================================
*/
    //getter for course code
    public String getCourseCode()
    {
        return courseCode;
    }
    //setter for course code
    public void setCourseCode(String courseCode) 
    {
        this.courseCode = courseCode;
    }


/*
=================================================
Getters and Setters for Instructor
=================================================
*/
    //getter for instructor identity
    public Instructor getInstructor() 
    {
        return instructor;
    }
    //setter for instructor identity 
    public void setInstructor(Instructor instructor) 
    {
        this.instructor = instructor;
    }

    
/*
=================================================
addStudent 
=================================================
*/
    /**
     * Adds a Student to the roster
     * @param student
     */
    public void addStudent(Student student) 
    {
        roster.add(student);
    }

 /*
=================================================
removeStudent 
=================================================
*/
    /**
     * Removes a Student from the roster
     * @param personId
     */
    public void removeStudent(String personId) 
    {
        // To delete a Student looping through the roster and comparing the students by personId
        Iterator<Student> studentIterator = roster.iterator();
        while (studentIterator.hasNext()) 
        {
            Student student = studentIterator.next();
            // When match is found, deleting the student
            if (student.getPersonId().equalsIgnoreCase(personId)) 
            {
                studentIterator.remove();
            }
        }
    }

     /*
=================================================
toString() method
=================================================
*/
    @Override
    public String toString() 
    {

        Collections.sort(roster);
        StringBuilder stringBuilder = new StringBuilder();
        for (Student student : roster) 
        {
            stringBuilder.append(student.toString());
            stringBuilder.append("\n");
        }
        String roster = stringBuilder.toString();

        return "*===============================*\n"+
               "| Course Information:           |\n"+
               "*===============================*\n"+ 
               "Course ID: " + courseId + '\n' +
               "Course Name: " + courseName + '\n' +
               "Course Code: " + courseCode + '\n' +
                "*-----------------------------------------------------------------------*\n" +
                "| Instructor                                                            |\n" +
                "*-----------------------------------------------------------------------*\n" +
                "|ID:\t\tName\t\tTitle\t\tDepartment\t\t|\n" +
                "*-----------------------------------------------------------------------*\n" +
                instructor.toString() + "\n" +
                "\n" +
                "*-----------------------------------------------------------------------*\n" +
                "| Student Roster                                                        |\n" +
                "*-----------------------------------------------------------------------*\n" +
                "|ID:\t\tName\t\tMajor\t\t\tGPA\t\t|\n"+
                "*-----------------------------------------------------------------------*\n"+
                roster;
    }
}
