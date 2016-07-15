/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.set;

import java.util.HashSet;

/**
 *  Since 1.2
 *  Implements the set interface, Serializable and cloneable BUT NOT random access
 *  No duplicates allowed
 *  sequence is not preserved
 *  Underlying DS is hashtable
 *  NULL insertion is allowed BUT only once (because dups are not allowed)
 *  Heterogenous objects are allowed 
 *  Best when the operation is search operation
 * 
 * @author tuxer
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add(10);
        hs.add('E');
        hs.add(null);
        
        System.out.println(hs); //O/p will be in random order!
        
        System.out.println(hs.add("A")); // false
    }
    
}

/**
 * Important observations
 *      - If we try to insert the duplicate key-value we won't get compile time error or exception
 *          but the add() will return false
 */