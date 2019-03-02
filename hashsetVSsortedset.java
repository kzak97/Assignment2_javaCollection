/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author KHAWAJA ZEESHAUR
 */
public class hashsetVSsortedset {
    
    void hashset(){
        
        HashSet<String> h = new HashSet<String>(); 
  
        // Adding elements into HashSet usind add() 
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        h.add("India");// adding duplicate elements 
  
        // Displaying the HashSet 
        System.out.println(h); 
        System.out.println("List contains India or not:" + 
                           h.contains("India")); 
  
        // Removing items from HashSet using remove() 
        h.remove("Australia"); 
        System.out.println("List after removing Australia:"+h); 
  
        // Iterating over hash set items 
        System.out.println("Iterating over list:"); 
        Iterator<String> i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next());  
    }
    
    
    void sortedset(){
        
        // Create a TreeSet and inserting elements 
        SortedSet<String> sites = new TreeSet<>(); 
        sites.add("practice"); 
        sites.add("geeksforgeeks"); 
        sites.add("quiz"); 
        sites.add("code"); 
  
        System.out.println("Sorted Set: " + sites); 
        System.out.println("First: " + sites.first()); 
        System.out.println("Last: " + sites.last()); 
  
        // Getting elements before quiz (Excluding) in a sortedSet 
        SortedSet<String> beforeQuiz = sites.headSet("quiz"); 
        System.out.println(beforeQuiz); 
  
        // Getting elements between code (Including) and  
        // practice (Excluding) 
        SortedSet<String> betweenCodeAndQuiz = 
                                  sites.subSet("code","practice"); 
        System.out.println(betweenCodeAndQuiz); 
  
        // Getting elements after code (Including) 
        SortedSet<String> afterCode = sites.tailSet("code"); 
        System.out.println(afterCode); 
    }
    
}
