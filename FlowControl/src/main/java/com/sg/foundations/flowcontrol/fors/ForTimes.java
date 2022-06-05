/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class ForTimes {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Which times table shall I recite? ");
        int answer = Integer.parseInt(inputReader.nextLine());
        
        for(int i = 1; i <= 15; i++){
            System.out.println(answer + " * " + i + " is: " + answer * i);
        }
    }
    
}
