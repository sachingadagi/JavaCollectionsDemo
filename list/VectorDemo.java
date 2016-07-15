/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.list;

import java.util.Vector;

/**
 * Since 1.0
 * Implements Serializable , clonable and random access
 * 
 * Exactly similar to ArrayList but with following differences
 * It is synchronized hence thread safe
 * Performance is high
 * 
 * @author tuxer
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(5);
        v.add("A");
        v.add('a');
        v.addElement("AddElement"); // Exactly similar to add()
        v.add(null);
        
        System.out.println(v); //[5, A, a, AddElement, null]
       
    }
}
/**
 * Important observations
 * additional methods as compared to List : addElement(),firstElement(),lastElement(),removeAll() and many more;
 */