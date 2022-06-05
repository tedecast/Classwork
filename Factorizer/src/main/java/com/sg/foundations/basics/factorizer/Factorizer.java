/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.factorizer;

import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class Factorizer {
    public static void main(String[] args) {
    
        Scanner userInput = new Scanner (System.in);
        System.out.println("What number would you like to factor?");
        int number = Integer.parseInt(userInput.nextLine());
        
        int count = 0;
   
        if(number < 1) {
            System.out.println("Number needs to be greater than 1.");
        }else if (number == 1){
            System.out.println("1 is neither a prime or perfect number.");
        }
        
        for(int i = 1; i <= number; i++) {
            if(number % i == 0){
                System.out.println(i);
            } 
            if (number % i == 0){
                count++;
            }
            
        } System.out.println(number + " has " + count + " factors." );
        
        for(int i = 1; i <= number; i++){
            if (number % i == 2){
                System.out.println(number + " is a perfect number.");
                System.out.println(number + " is not a prime number.");
                break;
                    
            }else if (number % i == 1) {
                System.out.println(number + " is not a perfect number.");
                System.out.println(number + " is a prime number.");
                break;
            }
        } 
    }  
}
    
