package org.pradeep.javaperks;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.TreeSet;

public class MainClass2 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add("pradep");
		set.add("pradep1");
		set.add("pradep2");
		set.add("pradep3");
		set.add("pradep456");
		set.add("pradep6");
		set.add("6");
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()){
			Object next = iterator.next();
			String name = (String)next;
			
			if("pradep1".equalsIgnoreCase(name)){
				iterator.remove();
			}
			
		}
		for(Object obj: set){
			System.out.println(obj);
		}
	
	}

}
 