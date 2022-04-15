/*
====================================================================================================
Student: Twymun Safford
Date: 03/25/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
Instructor: Maissam Khalil
Grid Application - Box Class
Description: This application draws a box within a grid based upon user input of the box's next
direction and magnitude - this is the Vector class
====================================================================================================
 */
 /*
=================================================
Import Packages
=================================================
 */
public class Vector 
{
    //def variables
    private final String DIRECTION;
    private final int MAGNITUDE;
    // constructor
    Vector(String directon, int magnitude)
    {        
        this.DIRECTION = directon;
        this.MAGNITUDE = magnitude;
    }
    public String getDirection()
    {
        return DIRECTION;
    }
    public int getMagnitude()
    {
        return MAGNITUDE;
    }
}