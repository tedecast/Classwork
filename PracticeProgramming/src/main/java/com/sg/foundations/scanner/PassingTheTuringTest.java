/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class PassingTheTuringTest {
    public static void main(String[] args) {
        /**
         * Create a new class that uses user input in a conversation, with the following steps:

            Ask the user for their name.
            Display that name and tell them yours (or your AI's name!).
            Ask them for their favorite color.
            Display the color they enter in a conversational way.
            Do the same thing with favorite food and number, and then say goodbye!
            Make sure you use the right variable with the right user input!
            */
        
            String name, colour, fruit;
            int number;
            
            Scanner inputReader = new Scanner (System.in);
            
            System.out.println("Hey there! What's your name? ");
            name = inputReader.nextLine();
            
            System.out.println("Hi, " + name + "!" + " I'm Terri.");
            System.out.println("What's your favourite colour?");
            colour = inputReader.nextLine();
            
            System.out.println("Oh, " + colour + "." + " Mine is pastel pink!");
            System.out.println("I love persimmons. What is YOUR favourite fruit?");
            fruit = inputReader.nextLine();
            
            System.out.println("Really? " + fruit + "..." + " That's WILD!");
            System.out.println("Speaking of favourites, what's your favourite number? ");
            number = Integer.parseInt(inputReader.nextLine());
            
            System.out.println(number + " is cool. Mine is 69, a fun one.");
            System.out.println("Did you know 42 * -7 is -294? That's a cool number too!");
            
            System.out.println("Well, thanks for talking to me " + name + "!");
            
            
            /** Hello there!
            What's your name? Zaphod

            Hi, Zaphod!  I'm Alice.
            What's your favorite color? Blue

            Huh, Blue? Mine's Electric Lime.

            I really like limes. They're my favorite fruit, too.
            What's YOUR favorite fruit, Zaphod? Pawpaws

            Really? Pawpaws? That's wild!
            Speaking of favorites, what's your favorite number? 42

            42 is a cool number. Mine's -7.
            Did you know 42 * -7 is -294? That's a cool number too!

            Well, thanks for talking to me, Zaphod!
         */ 
        
    }
    
}
