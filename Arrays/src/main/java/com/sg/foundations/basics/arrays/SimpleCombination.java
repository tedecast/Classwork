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
public class SimpleCombination {
    public static void main(String[] args) {
        
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!
        
        //int[] wholeNumbers = new int[24];
        
        System.out.println("All together now!:");
       
        int length = firstHalf.length + secondHalf.length;
        
        int[] result = new int[length];
        int pos = 0;
        for (int element : firstHalf) {
            result[pos] = element;
            pos++;
        }
        for (int element : secondHalf){
            result[pos] = element;
            pos++;
        }
        for (int element : result){
            System.out.println(element);
        }
        // System.out.println(Arrays.toString(result)); <== Haven't learned this yet. 
        // Combing code should go here! 
        //int firstArray = firstHalf.length;
        //int secondArray = secondHalf.length;
        //int[] result = new int[firstArray + secondArray];
        // Printing code should go here! 
        
    }
}
