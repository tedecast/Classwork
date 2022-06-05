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
public class WithATwist {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 2, 0};
        //start at last index, go to first(0)
        for (int i = numbers.length - 1; i >= 0; i--){
            if (i % 2 == 1) {
                System.out.println("index " + i + " - " + numbers[i]);
            }
        }
    }
}
