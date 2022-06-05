/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.assessments;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        
        System.out.println("Let's play Rock, Paper, Scissors! Here are the rules: ");
        System.out.println(" ");
        System.out.println("Rock = r, Paper = p, Scissors = s");
        System.out.println("Paper wraps Rock to win.");
        System.out.println("Scissors cuts Paper to win.");
        System.out.println("Rock breaks Scissors to win.");
        System.out.println("10 is the maximum amount of rounds you can play!");
        System.out.println(" ");
        System.out.println("How many rounds would you like to play?");
        Scanner userInput = new Scanner(System.in);
        int numRounds = Integer.parseInt(userInput.nextLine());
        
        boolean isValidMove = false;
        int userWins = 0;
        int cpuWins = 0;
        int ties = 0;

        while(numRounds > 10 || numRounds <= 0){
            System.out.println("Please enter a number that is between 1-10 to play.");
            numRounds = Integer.parseInt(userInput.nextLine());
        }
        System.out.println("Let's begin!");
        
        while(true){
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove = "";
            isValidMove = false;
            
            while(!isValidMove){
                System.out.println("Please enter your move (r, p, or s): ");
                playerMove = userInput.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")){
                    isValidMove = true;
                }else{
                    System.out.println(playerMove + " is not a valid move.");
                }
            }
            System.out.println("Computer played: " + computerMove);

            if (playerMove.equals(computerMove)){
                System.out.println("The game was a tie!");
                ties++;
            }
            else if (playerMove.equals("r")){
                if (computerMove.equals("p")) {
                    System.out.println("You lose!");
                    cpuWins++;

                } else if (computerMove.equals("s")) {
                    System.out.println("You win!");
                    userWins++;
                }
            }
            else if (playerMove.equals("p")){
                if (computerMove.equals("r")){
                    System.out.println("You win!");
                    userWins++;
                    

                } else if (computerMove.equals("s")){
                    System.out.println("You lose!");
                    cpuWins++;
                    
                }  
            }
            else if (playerMove.equals("s")){
                if(computerMove.equals("r")){
                    System.out.println("You lose!");
                    cpuWins++;
                    
                } else if (computerMove.equals("p")){
                    System.out.println("You win!");
                    userWins++;
                }
            }
            numRounds--;
            
            if (numRounds == 0){
                System.out.println("Player Score: " + userWins);
                System.out.println("Computer Score: " + cpuWins);
                System.out.println("Ties: " + ties);
        
                if(userWins > cpuWins){
                    System.out.println("Player wins!!");
                } else if (cpuWins > userWins) {
                    System.out.println("Computer wins!!");
                } else {
                    System.out.println("It's a tie!!");
                }
                System.out.println("Play again? (y/n)");
                String playAgain = userInput.nextLine();

                if (!playAgain.equals("y")){
                    System.out.println("Thanks for playing!");
                    break;
                }else{
                    userWins = 0;
                    cpuWins = 0;
                    ties = 0;
                    System.out.println("Please enter a number that is between 1-10 to play.");
                    numRounds = Integer.parseInt(userInput.nextLine());
                }    
            } 
        }
    }
    
}
        
        
 
        
        
       