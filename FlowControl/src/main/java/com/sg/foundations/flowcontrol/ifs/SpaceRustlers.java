/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author Teresa
 */
public class SpaceRustlers {
    public static void main(String[] args) {
        
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;
        
        if(aliens > spaceships) {
            System.out.println("Vrroom, Vroom! Let's get going!");
        } else {
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        
        if (cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for al these walking hamburgers!");
        } else if (cows > spaceships){
            System.out.println("Dangit! I don't know how we're going to fit al these cows in here!");
        } else {
            System.out.println("Too many spaceships! Not enough cows.");
        }
        
        if (cows < aliens){
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha!");
        } else {
            System.out.println("Oh no! The herds got restless and took over! Looks like _we're_ hamburger now!!");
        }
        
        // What does the else if do?
        // The else if statement is returned if the if statment is false and else if is true.
        // The else statement is returned if all the if and else if statments are false + the else statement is true.
    }
    
}
