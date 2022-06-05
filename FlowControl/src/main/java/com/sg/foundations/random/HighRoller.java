/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class HighRoller {
    
    public static void main(String[] args) {
        
        
        Random diceRoller = new Random();
        
        int rollResult = diceRoller.nextInt(6);
        
        Scanner inputReader = new Scanner(System.in);
        System.out.println("How many sides does a single die have?");
        int answer = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("TIME TO ROOOOOLLLLL THE DICE!");
        System.out.println("I rolled a " + rollResult);
        
        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        }
        if (rollResult == 6) {
            System.out.println("You rolled a critical hit! Nice job!");
        }
        if (rollResult <= 5) {
            System.out.println("You did alright.");
        }
    }
}
