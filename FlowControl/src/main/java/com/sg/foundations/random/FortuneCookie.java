/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.random;

import java.util.Random;

/**
 *
 * @author Teresa
 */
public class FortuneCookie {
    public static void main(String[] args) {
        Random randomizer = new Random();
        int x = randomizer.nextInt(2);
        
        System.out.println("Your Geek Fortune: " + x);
        
        switch(x){
            case 0:
                System.out.println("Ignore everyone and do you.");
                break;
            case 1: 
                System.out.println("Try not. Do, or do not. There is no try.");
                break;
            case 2: 
                System.out.println("Those are the droids you're looking for.");
                break;
           
        }
        
        
    }
    
}
