/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mtd.windowmaster2;

import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class WindowMasterMethod {
    
    public static void main(String[] args) {
        //declare variables for height and width
        float height;
        float width;
        
        //declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        //declare and initialize our Scanner
        Scanner sc = new Scanner(System.in);
        
        //get input from user
        height = readValue("Please enter window height: ");
        width = readValue("Please enter a width: ");
        
        //calculate area of window
        areaOfWindow = height * width;
        
        //calculate perimeter of the window
        perimeterOfWindow = 2 * (height + width);
        
        //calculate total cost - use hard coded for material cost
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
    
        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }
    
    public static float readValue(String prompt){
        //declare and initliaze a Scanner variable
        Scanner sc = new Scanner(System.in);
        //print prompt to console
        System.out.println(prompt);
        //read value into String data type
        String input = sc.nextLine();
        // convert the String to a float
        float floatVal = Float.parseFloat(input);
        //return the float value
        return floatVal;
    }
}
