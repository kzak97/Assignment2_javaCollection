/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollection;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author KHAWAJA ZEESHAUR
 */
public class navigablesetVSnavigablemap {

    
    void navigableSet(){
        
        NavigableSet<Integer> ns = new TreeSet<>(); 
        ns.add(0); 
        ns.add(1); 
        ns.add(2); 
        ns.add(3); 
        ns.add(4); 
        ns.add(5); 
        ns.add(6); 
  
        // Get a reverse view of the navigable set 
        NavigableSet<Integer> reverseNs = ns.descendingSet(); 
  
        // Print the normal and reverse views 
        System.out.println("Normal order: " + ns); 
        System.out.println("Reverse order: " + reverseNs); 
  
        NavigableSet<Integer> threeOrMore = ns.tailSet(3, true); 
        System.out.println("3 or  more:  " + threeOrMore); 
        System.out.println("lower(3): " + ns.lower(3)); 
        System.out.println("floor(3): " + ns.floor(3)); 
        System.out.println("higher(3): " + ns.higher(3)); 
        System.out.println("ceiling(3): " + ns.ceiling(3)); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollLast(): " + ns.pollLast()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("Navigable Set:  " + ns); 
  
        System.out.println("pollFirst(): " + ns.pollFirst()); 
        System.out.println("pollLast(): " + ns.pollLast()); 
    }
    
    
    void navigableMap(){
        
        NavigableMap<String, Integer> nm = new TreeMap<String, Integer>(); 
        nm.put("C", 888); 
        nm.put("Y", 999); 
        nm.put("A", 444); 
        nm.put("T", 555); 
        nm.put("B", 666); 
        nm.put("A", 555); 
  
        System.out.printf("Descending Set  : %s%n", 
                                nm.descendingKeySet()); 
        System.out.printf("Floor Entry  : %s%n", 
                                nm.floorEntry("L")); 
        System.out.printf("First Entry  : %s%n", 
                                nm.firstEntry()); 
        System.out.printf("Last Key : %s%n", 
                                nm.lastKey()); 
        System.out.printf("First Key : %s%n", 
                                nm.firstKey()); 
        System.out.printf("Original Map : %s%n", nm); 
        System.out.printf("Reverse Map : %s%n", 
                                 nm.descendingMap()); 
    }
}
