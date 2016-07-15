/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.set;

import java.util.LinkedHashSet;

/**
 *  since 1.4
 * 
 *  Child class of HashSet
 *  Underlying DS is Hashtable + LinkedList
 *  Insertion order is preserved
 * 
 * 
 * @author tuxer
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
         LinkedHashSet lhs = new LinkedHashSet();
        
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add(10);
        lhs.add('E');
        lhs.add(null);
        
        System.out.println(lhs); //O/p will be in order as they were stored!
        
        System.out.println(lhs.add("A")); // false
    }
   
}


/**
 *  BEST USECASE : Developing cache 
 */