/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * since 1.6
 * Implements set , serializable and cloneable
 * Underlying DS is balanced tree
 * Insertion order NOT preserved
 * Heterogenous objects not allowed
 * null insertion possible only once ( till version 1.6 )
 * All the elements are stored in some sorting logic
 * All the elements should be comparable (implemented the comparable interface)
 *
 * @author tuxer
 */
public class TreeSetDemo {
    
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("A");
        ts.add("D");
        ts.add("C");
        ts.add("B");
        
        System.out.println(ts);
        // ts.add(1); // NOT ALLOWED! Will throw ClassCastException
        
        
        // The following code won't work : since StringBuffer doesn't implement comparable 
        /*
        
        TreeSet ts2 = new TreeSet();
        ts2.add(new StringBuffer("A")); 
        
        */
        
        /* 
            ======================================= 
              WORKING WITH COMPARABLE 
              Comparabe interface belongs to java.lang package and has
              int compareTo(obj) method
        
              obj.compareTo(obj2) : will return
              -ve if obj1 has to come before 
              +ve if ob1 has to come after
              0   if both are equal
            =======================================
        
            Why learn about comparable now?
            Because, if natural sorting order is used,
            the line while adding objects will invoke compareTo()
                                                */
        
        
        System.out.println("A".compareTo("B")); // -1
        System.out.println("A".compareTo("A")); // 0
        System.out.println("C".compareTo("B")); // 1
        
        
        /*
                Till here we understand concept of comparable but what if
                we want our own sorting order?
                Answer is use comparator!
        
        ==========================================================
                            COMPARATOR
        ==========================================================
        
        Comparator is present in  java.util package which declares following methods:
            1) public int compare(Object o1 , Object o2)
                
            2) public boolean equals(Object o1)
        
        So, whenever we are implementing the comparator interface, we should provide implementation
        for above methods
        
        
        
        --------------------------------------------------------
        
        Lets insert the integers with sorting order as descending order
        */
        
        
        TreeSet tsDesc = new TreeSet(new MyCustomComparator());
        
        tsDesc.add(10);
        tsDesc.add(0); //  Compares as compareTo(0,10)  & gets +1 ( 0 internally attached to right)
        tsDesc.add(15); // Compares as compareTo (15,10), & gets -1, attached to left
        tsDesc.add(5); // Compares as compareTo (5,10), & gets +1, goes right, again compare (5,0), gets +1, attached to left
        tsDesc.add(20); // Compares as compareTo (20,10), & gets -1, goes left , again compare (20,15)  gets -1 , attaches left
        
        /* 
           
                        10
        
                        10
                            0
        
                        10
                    15      0
        
        
                        10
                    15      0
                  20
        
        */
        
        System.out.println(tsDesc);
        
        
        
        /* 
            ============= Using compareTo inside compare ===== 
            we can implement compare method which internally uses compareTo of Comparable
        */
        
        TreeSet tsDesc2 = new TreeSet(new MyCustomComparator2());
        tsDesc2.add(10);
        tsDesc2.add(0); //  Compares as compareTo(0,10)  & gets +1 ( 0 internally attached to right)
        tsDesc2.add(15); // Compares as compareTo (15,10), & gets -1, attached to left
        tsDesc2.add(5); // Compares as compareTo (5,10), & gets +1, goes right, again compare (5,0), gets +1, attached to left
        tsDesc2.add(20); // Compares as compareTo (20,10), & gets -1, goes left , again compare (20,15)  gets -1 , attaches left
        
        System.out.println(tsDesc2);
        
    }
}

// My Custom comparator class
class MyCustomComparator implements Comparator{

    
    // Custom implementation of compare to compare two objects
    @Override
    public int compare(Object o1, Object o2) {
        // Since our both objects are integers, typecast to Integers
        
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        
        if ( i1 < i2 ){
            return +1; // 
        }
        else if ( i1 > i2 ){
            return -1 ; //
        }
        else{
            return 0; // Both are equal
        }
        }
    
}


class MyCustomComparator2 implements Comparator {
    // Using compareTo method of comparator class itself
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        return -i1.compareTo(i2); // Simply negate the return value of existing compare() method
    }
    
}

/**
 * 
 *      we can use comparator to compare two objects via comparing two attributes of the respective objects
 * 
 *              Comparable          vs          Comparator
 *
 *           Natural sorting                    Custom sorting
 *         present in java.lang                 Present in java.util
 * 
 *      All Wrapper Classes & String 
 *      implement comparable                    Collator, RuleBaseCollator implement Comparator
 */