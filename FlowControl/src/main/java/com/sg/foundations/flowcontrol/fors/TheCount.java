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
public class TheCount {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner (System.in);
        
        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");
        
        System.out.println("Start at : ");
        int start = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("Stop at : ");
        int stop = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("Count by : ");
        int count = Integer.parseInt(inputReader.nextLine());
        
        int currentCount = 0;
        
        for (int i = start; i <= stop; i += count){
            System.out.println(i);
            currentCount ++;
            
            if (currentCount % 3 == 0){
                System.out.println(" - Ah ah ah!");
            }
        
        }
    }
}
