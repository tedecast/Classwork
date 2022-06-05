/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        
        String name;
        int answer; 
       
        Scanner inputReader = new Scanner (System.in);
        System.out.println("Hey, let's play a game! What's your name?");
        name = inputReader.nextLine();
        System.out.println("Okay, " + name + ", when were you born?");
        answer = Integer.parseInt(inputReader.nextLine());
        
        if (answer <= 2005){
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?");
        }
        if (answer <= 1995) {
            System.out.println("Did you know that Harry Potter came out over 15 years ago?");
        }
        if (answer <= 1985) {
            System.out.println ("Did you know that Space Jam came out not last decade, but the one before that?");
        }
        if (answer <= 1975){
            System.out.println("Did you know that the original Jurassic Park release is closer to the first lunar landing than it is to today!");
        }
        if (answer <= 1965) {
            System.out.println("Did you know that the MASH TV series has been around for almost half a century!");
        }
        else {
            System.out.println("Please try again and enter a valid year.");
        }
        
    }
    
}
