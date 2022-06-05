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
public class GuessMe {
    public static void main(String[] args) {
        int numOne = 13;
        int answer; 
        
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Pick a number:");
        answer = Integer.parseInt(inputReader.nextLine());
        
        if (numOne < answer) {
            System.out.println("Too bad, way too high. I chose " + numOne + "!");
        }
        if (numOne > answer) {
            System.out.println(answer + "?" + " Ha, nice try - too low! I chose " + numOne + "!");
        }
        if (numOne == answer){
            System.out.println("Wow, nice guess! That was it!");
        }
    }
    
}
