/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareengineeringmockinterview;

import java.io.*;
import java.util.*;

/**
 *
 * @author Pramp Coding Interview
 * 
 * Root of Number
 * 
 * Many times we need to re-implement basic functions without using any standard library functions already implemented.
 * For example, when designing a chip that required very little memory space.
 * 
 * In this question we'll implement a function root that calculates the n*th root of a number. The function takes a 
 * nonnegative number x and a positive integer n, and returns the positive n*th root of x within an error of 0.001 (i.e. 
 *  suppose the real root is y, then the error is : |y-root(x,n)| and must satisfy |y-root(x,n)| < 0.001).
 * 
 * Don't be intimidated by the questions. While are many algorithms to calculate roots that require prior knowledge in numerical
 * analysis, there is also an elementary method which doesn't require more than guessing-and-checking. Try to think more in terms
 * of the latter.
 * 
 * Make sure your algorithm is efficient, and analyze its time and space comlexities.
 * 
 * Examples:
 *  input: x = 7, n = 3
 *  output: 1.913
 * 
 * input x = 9, n = 2
 * output: 3
 * 
 */
public class SoftwareEngineeringMockInterview {

    /**
     * @param args the command line arguments
     */
    
    static double ildiz(double x, int n) {
       double start = 0;
       double end = x;
       double mid = 0;
       double result = 0;
       double error = 0.001;
       
       do {
           mid = (start + end) / 2.0;
           result = Math.pow(mid, n);
           
           if (result > x) {
               end = mid;
           } else if (result < x) {
               start = mid;
           } else {
               return mid;
           }
           
       } while (Math.abs(result - x) >= error);
       
       return mid;
    }
    
    public static void main(String[] args) {
        System.out.println(ildiz(7, 3));         
    }     
}
