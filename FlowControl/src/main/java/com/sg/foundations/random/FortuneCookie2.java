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
public class FortuneCookie2 {
    public static void main(String[] args) {
        Random rng = new Random();
        
        String[] fortune = new String[] { "Ignore everyone and do you.", "Try not. Do or do not. There is no Try.", "These aren't the droids you're looking for." };
        int randomIndex = rng.nextInt( fortune.length );
        String randomFortune = fortune[randomIndex];
        System.out.println("Your Geek Fortune: " + randomFortune);
    }
    
}
