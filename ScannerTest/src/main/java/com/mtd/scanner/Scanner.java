/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mtd.scanner;

/**
 *
 * @author Teresa
 */
public class Scanner {
    
    public static void main(String[] args){
        
        String name;
        int age;
        int numCats;
        String hometown;
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        
        System.out.println("Please enter your name: ");
        name = sc.nextLine();
        System.out.println("Please enter your age: ");
        age = sc.nextInt();
        System.out.println("Enter number of cats: ");
        numCats = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your hometown: ");
        hometown = sc.nextLine();
        
        System.out.println("You said:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Num Computers: " + numCats);
        System.out.println("Hometown: " + hometown);
    }
}
