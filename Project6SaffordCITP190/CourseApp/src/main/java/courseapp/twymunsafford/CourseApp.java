/*
====================================================================================================
Student: Twymun Safford
Date: 04/22/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
Instructor: Maissam Khalil
Course Roster Application
Main Course Application Java Class

Description: This application records and sorts students into courses; also manages student
enrollment
====================================================================================================
 */

 /*
=================================================
Import Packages - Interest Application, Scanner
=================================================
 */
package courseapp.twymunsafford;
import java.util.Scanner;


 /*
=================================================
Main CourseApp Class
=================================================
 */
public class CourseApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //display the menu here
        displayProgramMenu();
        
        Student s1 = new Student();
        s1.setPersonId("X00000001");
        s1.setFirstName("Steve");
        s1.setLastName("Smith");
        s1.setMajor("Computer Science");
        s1.setGpa(3.49);

        Student s2 = new Student();
        s2.setPersonId("X00000002");
        s2.setFirstName("Sally");
        s2.setLastName("Smith");
        s2.setMajor("History\t\t");
        s2.setGpa(2.98);

        Student s3 = new Student();
        s3.setPersonId("X00000003");
        s3.setFirstName("Amanda");
        s3.setLastName("Adams");
        s3.setMajor("Civil Engineering");
        s3.setGpa(3.7);

        Student s4 = new Student();
        s4.setPersonId("X00000004");
        s4.setFirstName("Timothy");
        s4.setLastName("Turner");
        s4.setMajor("Biology\t\t");
        s4.setGpa(2.51);


        Student s5 = new Student();
        s5.setPersonId("X00000005");
        s5.setFirstName("Thomas");
        s5.setLastName("Turner");
        s5.setMajor("Nursing\t\t");
        s5.setGpa(2.34);

        Instructor i1 = new Instructor();
        i1.setPersonId("X00009876");
        i1.setFirstName("Jane");
        i1.setLastName("Jones");
        i1.setTitle("Associate Professor");
        i1.setDepartment("Mathematics");

        Instructor i2 = new Instructor();
        i2.setPersonId("X00436754");
        i2.setFirstName("Wilson");
        i2.setLastName("Walton");
        i2.setTitle("Lab Instructor");
        i2.setDepartment("Biology");

        Course c1 = new Course();
        c1.setCourseId("10000");
        c1.setCourseCode("MATH 101");
        c1.setCourseName("College Algebra");
        c1.setInstructor(i1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.addStudent(s5);

        Course c2 = new Course();
        c2.setCourseId("21567");
        c2.setCourseCode("MATH 111");
        c2.setCourseName("Pre-Calculus");
        c2.setInstructor(i1); c2.addStudent(s1);
        c2.addStudent(s4);

        Course c3 = new Course();
        c3.setCourseId("69843");
        c3.setCourseCode("BIOL 103");
        c3.setCourseName("Biology I Lab"); c3.setInstructor(i2);

        c3.addStudent(s1);
        c3.addStudent(s2);
        c3.addStudent(s3);
        c3.addStudent(s4);
        c3.addStudent(s5);

        System.out.println(c1);
        System.out.println();
        System.out.println(c2);
        System.out.println();
        System.out.println(c3);
        System.out.println();

        c3.removeStudent("X00000002");
        System.out.println(c3);
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
        System.out.println("*                     'Course Application'                           *");
        System.out.println("*                    By: Twymun Safford                              *");
        System.out.println("*  This program implements an active roster of students enrolled     *");
        System.out.println("*  in courses including name, major, GPA, and the instructors        *");
        System.out.println("*  for the courses being attended.                                   *");
        System.out.println("*                                                                    *");
        System.out.println("**********************************************************************");
        System.out.println("\n");
    }
}
