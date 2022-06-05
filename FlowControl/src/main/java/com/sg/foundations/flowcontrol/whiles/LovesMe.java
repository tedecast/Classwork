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
public class LovesMe {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner (System.in);
        
        boolean isLove = true;
        
        System.out.println("Well, here goes nothing...");
        System.out.println("Enter a number of petals: ");
        int petals = Integer.parseInt(userInput.nextLine());

        while (petals > 0){
            System.out.println("");
            
            if (isLove){
                System.out.println("It LOVES me!");
                if (petals == 1){
                    System.out.println("I knew it! ");
                }
                //isLove = false;
            } else {
                System.out.println("It HATES me!");
                if (petals == 1) {
                    System.out.println("I'M GONNA KMS!");
                }
                //isLove = true;
            } 
            isLove = !isLove;
            petals--;
            
        } 
    }    
}

