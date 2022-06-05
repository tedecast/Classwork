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
public class ChangingTheSize {
    public static void main(String[] args) {
        
    }
        public int[] GrowArray(int[] original, int howManyMoreElements)
        {
           int[] newArray = new int[original.length + howManyMoreElements];
           
           for (int i = 0; i < original.length; i++)
           {
               //copy the element at the current index
               // from orginal to newArray
               newArray[i] = original[i];
           }
           return newArray;
        }
        
    }

