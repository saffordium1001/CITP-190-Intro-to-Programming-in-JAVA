/*
====================================================================================================
Student: Twymun Safford
Date: 03/25/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
Instructor: Maissam Khalil
Grid Application - Box Class
Description: This application draws a box within a grid based upon user input of the box's next
direction and magnitude - this is the Grid class
====================================================================================================
 */
 /*
=================================================
Import Packages
=================================================
 */
public class Grid {
    // def constants
    private static final char WALL_TOP_BOTTOM = 0x2550;
    private static final char WALL_LEFT_RIGHT = 0x2551;
    private static final char WALL_TOP_LEFT_CORNER = 0x2554;
    private static final char WALL_TOP_RIGHT_CORNER = 0x2557;
    private static final char WALL_BOTTOM_RIGHT_CORNER = 0x255D;
    private static final char WALL_BOTTOM_LEFT_CORNER = 0x255A;
    private static final char BOX_CHAR = 0x2588;
    private static final char EMPTY = 0x2591;
    //def variables
    private final int verticalSize;
    private final int horizontalSize;
    private final Box box;
    //constructor
    Grid(int vertical, int horizontal)
    {
        this.verticalSize = vertical;
        this.horizontalSize = horizontal;        
        box = new Box(horizontal - 1, vertical - 1);
    }
    public Box getBox()
    {
        return box;
    }
    public void draw()
    {
        System.out.print(WALL_TOP_LEFT_CORNER);
        for (int i = 0; i < horizontalSize; i++)
        {
            System.out.print(WALL_TOP_BOTTOM);            
        }
        System.out.print(WALL_TOP_RIGHT_CORNER);
        System.out.println();
         
        for (int i = 0; i < verticalSize; i++)
        {
            System.out.print(WALL_LEFT_RIGHT);
            for (int j = 0; j < horizontalSize; j++)
            {
                if (i == box.getY() && j == box.getX())
                {
                    System.out.print(BOX_CHAR);
                }
                else
                {
                    System.out.print(EMPTY);
                }                
            }
            System.out.print(WALL_LEFT_RIGHT);
            System.out.println();
        }
        System.out.print(WALL_BOTTOM_LEFT_CORNER);
        for (int i = 0; i < horizontalSize; i++)
        {
            System.out.print(WALL_TOP_BOTTOM);
        }
        System.out.print(WALL_BOTTOM_RIGHT_CORNER);
        System.out.println();
    }
}