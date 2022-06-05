/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class TwosForsAndTenYearsAgo {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What year would you like to count back from? ");
        int year = userInput.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " years ago would be " + (year - i));
        }
        
        System.out.println("\nI can count backwards using a different way too...");
        
        // This second loop has been changed to count back from 20 years.
        for (int i = year; i >= year - 20; i--){
            System.out.println((year - i) + " years ago would be " + i);
        }
    }
    
}
// The ranges for the starting and stop is starting from 0 - 10.
// The second loop is much clearer because we're decrementing the years.
