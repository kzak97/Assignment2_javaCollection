/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollection;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 *
 * @author KHAWAJA ZEESHAUR
 */
public class arraylistVSvectors {
    
    void list(){
        
        ArrayList<String> al=new ArrayList<String>();//creating arraylist    
    
        al.add("Sonoo");//adding object in arraylist    
        al.add("Michael");    
        al.add("James");    
        al.add("Andy");    
    
        //traversing elements using Iterator  
        Iterator itr=al.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());
        }
    }
    
    
    void vector(){
        
        Vector<String> v=new Vector<String>();//creating vector  
  
        v.add("umesh");//method of Collection  
        v.addElement("irfan");//method of Vector  
        v.addElement("kumar");  
  
        //traversing elements using Enumeration  
        Enumeration e=v.elements();  
        while(e.hasMoreElements()){  
            System.out.println(e.nextElement());  
        }  
    }

}
