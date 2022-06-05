/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.methods;

/**
 *
 * @author Teresa
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {
        
        String color = pink(); // call color method here
        String animal =  hippo(); // call animal method again here
        String colorAgain =  pink(); //call color method again here
        int weight = lb(); //call number method,
            // with a random between 5 - 200
        int distance = miles(); // call number method
            // with a random between 10 - 20
        int number = num(); // call number method, 
            // with a range between 10000 - 20000
        int time = clock(); // call number method,
            // with a range between 2-6
            
        System.out.println("Once, when I was very small...");
       
        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " minature " + animal
                + " for over " + distance + " miles!!!");
        
        System.out.println("I had to hide in a field over " +
                number + " " + colorAgain + " poppies for nearly " 
                + time + " hours until it left me alone!");
        
        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }
    
    public static String pink(){
        return "pink";
    }
    
    public static String hippo(){
        return "hippopotamus";
    }
    
    public static int lb(){
        return 133;
    }
    
    public static int miles(){
        return 15;
    }
    
    public static int num(){
        return 13333;
    }
    
    public static int clock(){
        return 3;
    }
}
