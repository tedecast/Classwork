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
public class GuessMeFinally {
    public static void main(String[] args) {
        
        int number = -69;
        int answer;
        boolean found = false;
        
        Scanner inputReader = new Scanner(System.in);
        System.out.println("I've chosen a number between - 100 and 100. Betcha can't guess it!");
        answer = Integer.parseInt(inputReader.nextLine());
       
        while(found == false){
            System.out.println(answer);
            
            if (answer > 100 || answer < -100) {
                System.out.println("You fucked up.");
                answer = Integer.parseInt(inputReader.nextLine());
            }
            
            if (answer > number) {
                System.out.println("Too bad, way too high! Try again!"); 
                System.out.println("Your guess: " + answer);
                answer = Integer.parseInt(inputReader.nextLine());
                
            } else if (answer < number) {
                System.out.println("Ha, nice try - too low! Try again!"); 
                System.out.println("Your guess: " + answer);
                answer = Integer.parseInt(inputReader.nextLine());
                
            } else {
                System.out.println("Finally! It's about time you got it!");
                System.out.println("Your guess: " + answer);
                found = true;
            }

        }
    }
}
