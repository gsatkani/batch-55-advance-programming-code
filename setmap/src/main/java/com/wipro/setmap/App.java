package com.wipro.setmap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //List - ArrayList / LinkedList
    	//Set  - HashSet / LinkedHashSet / TreeSet
    	// Set - Unordered collection / it will not maintain any order to print
    	//A collection that contains no duplicate elements
    	Set<Integer> pincode=new TreeSet<Integer>(); // prints in sorter order
    	//Set<Integer> pincode=new LinkedHashSet<Integer>(); // prints in insertion order
    	//Set<Integer> pincode=new HashSet<Integer>(); 
    	pincode.add(6000005);
    	pincode.add(6000002);
    	pincode.add(6000004);
    	pincode.add(6000003);
    	pincode.add(6000008);
    	pincode.add(6000006);
    	
    	System.out.println(pincode);
    	    	
    	
    	
    	
    	
    }
}
