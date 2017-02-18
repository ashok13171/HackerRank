package com.hackerrank.ds.stack;

import java.util.Scanner;
import java.util.Stack;

/*
 * Hackerrank sulution for Stacks: Balanced Brackets
 * https://www.hackerrank.com/challenges/ctci-balanced-brackets
 */
public class Solution {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<Character>();
        char[] data = expression.toCharArray();
        
        for (Character ch : data){
           switch(ch){
               case ')' : {
                            if (stack.isEmpty() || stack.pop() != '(' ){
                                return false;
                            }
                            break;
                          }
                case '}' : {
                            if (stack.isEmpty() || stack.pop() != '{' ){
                                return false;
                            }
                            break;
                          }  
               case ']' : {
                            if (stack.isEmpty() || stack.pop() != '[' ){
                                return false;
                            }
                             break;
                          } 
               default : {
                   stack.push(ch);
               }
           }
        }
        return stack.isEmpty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}