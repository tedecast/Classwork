/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.arrays;

/**
 *
 * @author Teresa
 */
public class PrintingPairs {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5, 6};
        
        for (int i = 0; i < numbers.length - 2; i += 3){
            System.out.println("Pair: (" + numbers[i] + ", " + numbers [i + 1] + ")");
        }
    }
}
