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
public class ForTimesFor {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Which times table shall I recite?");
        int num = Integer.parseInt(userInput.nextLine());
       
        for(int i = 1; i < 15; i++) {
            System.out.println(i + " * " + num + " is: ");
            //+ num * i
            int answer = Integer.parseInt(userInput.nextLine());
            if (answer == num * i){
                System.out.println("Correct!");
            } else {
                System.out.println("Sorry no, the answer is: " + num * i);
            }
         
        }
    }
}
