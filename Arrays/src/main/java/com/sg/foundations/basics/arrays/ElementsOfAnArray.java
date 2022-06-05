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
public class ElementsOfAnArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 2, 1};
        int sum = 0; // keep running total
            for (int i = 0; i < numbers.length; i++){
                sum += numbers[i];
                System.out.println("i = " + i + " current sum = " + sum);
            }
        System.out.println("Final sum: " + sum);
    }
}
