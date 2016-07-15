/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.list;

import java.util.ArrayList;

/**
 * Since 1.2
 * Arraylist implements cloneable,random access and serializable
 * 
 * 
 *  Arraylist is resizable or growable array
 * Duplicates are allowed
 * insertion order is preserved
 * Heterogenous objects are allowed
 * multiple null insertion is allowed
 * 
 * 
 * new capacity = (currentcapacity * 3/2)+1
 * @author tuxer
 */
public class ArrayListDemo {

    
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("A"); // String
        al.add(1); // int
        al.add('a'); // char
        al.add(null);
        al.add("B");
        
        System.out.println(al); //[A, 1, a, null, B]


        al.remove(1); // removes the value 1 not the object at index 1, but if 1 is not present
                      //then it removes the object at that in
        
        System.out.println(al); //[A, a, null, B]

    }

}

/**
 * Some important observations,
 * even if  we set initial capacity to 0, it does'nt matter
 */
