/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author Teresa
 */
public class StayPositive {
    public static void main(String[] args) {
        
        int startTime = 10;
        int endTime = 0;
        System.out.println("Counting down...");
        
        while (endTime < startTime){
            
            System.out.println(startTime);
            startTime--;
        }
        
        System.out.println("Blast off!");
    }
    
}
