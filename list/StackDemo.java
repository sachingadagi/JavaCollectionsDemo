/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.list;

import java.util.Stack;

/**
 * Child class of Vector **
 * Specifically designed for LIFO operations
 * 
 *
 * @author tuxer
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(0);
        s.push("A");
        s.push('B');
        System.out.println(s.peek()); // returns the top , if empty returns empty stack exception
        
        System.out.println(s); // [0, A, B]
                
        System.out.println(s.search(0)); //3
        
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.isEmpty()); // True
    }
}
