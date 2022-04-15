/*
====================================================================================================
Student: Twymun Safford
Date: 02/18/2022
Class: CITP 190 (Spring '22 - CRN: 80620)
Instructor: Maissam Khalil
Circle Calculator (Methods)
Description: This application calculates the diameter, circumference, and area of a circle (these are
the methods for getting the radius, setting the radius, diameter, circumference, and area.
====================================================================================================
 */
 /*
=================================================
Import Packages
=================================================
 */
package com.circleappsafford;

import java.util.Scanner;
/**
 *
 * @author tksafford
 */
public class Circle {
	//This is private instance variable of Circle.java class
	private double radius = 1.0;

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * @return the diameter
	 */
	public double getDiameter() {
		return radius * 2;
	}
	
	/**
	 * @return the circumference of the circle
	 */
	public double getCircumference() {
		return getDiameter() * Math.PI ;
	}
	
	/**
	 * @return the area of the circle
	 */
	public double getArea() {
		return radius * radius * Math.PI ;
	}
}
