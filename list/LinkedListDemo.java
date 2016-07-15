/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.list;

import java.util.LinkedList;

/**
 *  Implements cloneable and serializable but NOT Random access
 * Underlying DS is doubly linked list
 * Duplicates are allowed
 * Heterogenous values are allowed
 * 
 * 
 * BEST FOR : insertion adn deletion in middle ( also at start);
 * 
 * @author tuxer
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("A");
        ll.add("C");
        ll.add(5);
        ll.add('e');
        
        System.out.println(ll); //[A, C, 5, e]
        ll.add(1,"B");
        System.out.println(ll); //[A, B, C, 5, e]
   
        
    }
   
}

/**
 *  Insertion order is preserved
 * 
 */
