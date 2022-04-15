/*
====================================================================================================
Student: Twymun Safford
Date: 03/25/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
Instructor: Maissam Khalil
Grid Application - Box Class
Description: This application draws a box within a grid based upon user input of the box's next
direction and magnitude - this is the Box class
====================================================================================================
 */
 /*
=================================================
Import Packages
=================================================
 */
public class Box {
    private static final int MIN_X = 0;
    private static final int MIN_Y = 0;
    private final int maxX;
    private final int maxY;
    private int x = 0;
    private int y = 0;
     
    // Constructor for Box object
    Box(int limitX, int limitY)
    {        
        this.maxX = limitX;
        this.maxY = limitY;
    }
    //get current x position
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    //get current y position
    public void push( Vector vector)
    {
        switch(vector.getDirection())
        {
            //for right or up, x or y should increase by one increment respectively
            case "R":
                x += vector.getMagnitude();
                break;
            case "U":
                y += vector.getMagnitude();
                break;
                //for up or left, x or y should decrease by one increment respectively
            case "L":
                x += vector.getMagnitude();
                break;
            case "D":
                y += vector.getMagnitude();
                break;                    
        }
        if (x > maxX)
        {
            x = maxX;
        }
        else if (x < MIN_X)
        {
            x = MIN_X;
        }
        if (y > maxY)
        {
            y = maxY;
        }
        else if (y < MIN_Y)
        {
            y = MIN_Y;
        }        
    }
}