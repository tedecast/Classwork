/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class StayPostiveBonus {
    
    public static void main(String[] args) {
        int number; 
        int endTime = 0;
        
        Scanner inputReader = new Scanner (System.in);
        System.out.println("What number should I count down from? ");
        number = Integer.parseInt(inputReader.nextLine());
        System.out.println("Here goes!");
        
        while(endTime < number) {
            
            System.out.println(number);
            number--;
        }
        System.out.println("Blast off!!");
        
        if (number < 0){
            System.out.println("Please try again and enter a positive number.");
        }
    }
    
}
