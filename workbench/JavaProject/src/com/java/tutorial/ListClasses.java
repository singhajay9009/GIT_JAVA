package com.java.tutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList lst = new ArrayList();
		lst.add("ajay");
		lst.add("vinay");
		
		Iterator it = lst.iterator();
		while(it.hasNext()){
			System.out.println(it.next());			
		}

	}

}
