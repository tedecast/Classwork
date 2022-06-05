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
public class BewareTheKraken {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner (System.in);
        
        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOoooOOOooo...! *SPLASH*");
        
        int depthDivedInFt = 0;
        String keepSwimming = "y";
        
        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom... we should probably stop.
        while(depthDivedInFt < 36200 && keepSwimming.equals("y")){
            System.out.println("So far, we've swum " + depthDivedInFt + " feet");
            System.out.println("Want to keep swimming? (y/n) :");
            keepSwimming = userInput.nextLine();
            
        if(depthDivedInFt >= 20000){
            System.out.println("Uhh, I think I see a Kraken guys....");
            System.out.println("TIME TO GO");
            break; 
        }
            // I can swim, really fast! 500ft at a time!
        depthDivedInFt += 1000;
            
        }
        System.out.println("");
        System.out.println("We eneded up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}

