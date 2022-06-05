/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.arrays;

import java.util.*;


/**
 *
 * @author Teresa
 */
public class FruitSalad {
    public static void main(String[] args) {
         String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];
       
        // Code recipe for fruit salad goes here!
        int numOfApples = 3;
        int numOfOranges = 2;
        int totalFruits = 12;
        int fruitsAdded = 0;
        
        for (String i : fruit){
            if(fruitsAdded == totalFruits){
                break;
                
            }else if(i.contains("berry")){
                fruitSalad[fruitsAdded] = i;
                fruitsAdded++;
         
            }else if(i.contains("Apple") && numOfApples > 0){
                fruitSalad[fruitsAdded] = i;
                fruitsAdded++;
                numOfApples--;
                
            }else if(i.contains("Orange") && numOfOranges > 0){
                fruitSalad[fruitsAdded] = i;
                fruitsAdded++;
                numOfOranges--;
                
            }else if(!i.contains("Tomato")){
                fruitSalad[fruitsAdded] = i;
                fruitsAdded++;
            }
        }
        for (String i : fruitSalad){
            System.out.println(i);
            
        }
             
        
        //Arrays.sort(fruit);
        //System.out.println(Arrays.toString(fruit));
        
        /*
        [Banana, Beefsteak Tomato, Blackberry, Blood Orange, Blueberry, Braeburn Apple, Cherry Tomato, Florida Orange, Fuji Apple, Gala Apple, Gooseberry, Granny Smith Apple, Kiku Apple, Kiwi Fruit, Mango, Navel Orange, Pineapple, Pink Pearl Apple, Raspberry, Satsuma Orange, Snozzberry, Strawberry, Sungold Tomato, Watermelon]
        */
    }
}
