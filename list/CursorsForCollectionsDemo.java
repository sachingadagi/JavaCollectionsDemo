/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 *
 * 3 cursors are available for collections
 * 1) Enumeration
 * 2) Iterator
 * 3) ListIterator
 * 
 * 
 * 1) Enumeration can be used to get objects 1 by 1 in LEGACY collection object
 *  *   - We can apply enumeration only on legacy classes
 *      - we have only read access, no manipulation access (add/remove);
 * 
 * 2) Iterator
 *      - We can apply iterators on any collections, hence universal
 *      - we can perform ONLY read, remove NOT replace and add
 * 
 * 3) List Iterator [ ONLY APPLICABLE TO  List Objects! ]
 *      - We can 'MOVE' the iterator in both directons which is not possible in above 2.
 *  
 * Distinguishing above 3
 * 
    *              Enumeration         Iterator          ListIterator
    *              ===================================================
 * Applicable to?   Legacy classes      ANY collection    Only for list objects
 * is it Legacy?    Yes (1.0)           No (1.2)          No (1.2)
 * Movement         Forward only        Forward only      Bidirectional
 * Allowed opn      read                read/remove       read/remove/add/replace
 * 
 * 
 * @author tuxer
 */
public class CursorsForCollectionsDemo {
    public static void main(String[] args) {
        
        Vector v = new Vector();
        v.add(5);
        v.add("A");
        v.add('a');
        v.addElement("AddElement"); // Exactly similar to add()
        v.add(null);
        
        //Using enumeration
        Enumeration e =v.elements();
        
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        
        // Using iterator
        
        Iterator i = v.iterator();
        
        while(i.hasNext()){
            System.out.println(i.next()); // Moves forward
            i.remove(); // Removes the element
        }
        System.out.println(v); // []
        
        // Again filling the elements
        v.add(5);
        v.add("A");
        v.add('a');
        v.addElement("AddElement");
        v.add(null);
        
        ListIterator li = v.listIterator(); // We can also provide index where iterator would be pointing to
        
        // Printing in sequence
        while(li.hasNext()){
            System.out.println(li.next());
        }
        
        // Printing in reverse sequence
        li = v.listIterator(v.lastIndexOf(v.lastElement())); // providing the index of last element
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
    
}

/**
*   Iterator belongs to util to iterator not collections-iterator 
 */