/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.basics.core;

/**
 *
 * @author Teresa
 */
public class CommentingCode {
    public static void main(String[] args) {
    // Comments are written to explain code in an easily 
    // understandable way
      // Basically for single lines
     // anything after // is consider a comment
    System.out.println("Normal code is compiled and runs ...");
    System.out.println("Comments however ..."); // do not execute!
    
    // Comments can be their own line
    System.out.println(""); // or they can share like this
    //However if you put the // BEFORE a line of code
    // System.out.println("Then it is considered a comment");
    // System.outprintln("and it won't execute!);
    
    /*
        This is an example of a multi-line comment, which is useful if
        you want to comment out multiple lines of code quickly. 
        Console.WriteLine("Java ignores everthing inside the comment markers.");
    */
    
    }
}
