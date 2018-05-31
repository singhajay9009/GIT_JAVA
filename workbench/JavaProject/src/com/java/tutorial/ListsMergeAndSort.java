package com.java.tutorial;

import java.util.ArrayList;
import java.util.List;

public class ListsMergeAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list1 = new ArrayList();
		list1.add(2);
		list1.add(5);
		list1.add(14);
		list1.add(4);
		list1.add(6);
		list1.add(1);
		
		List list2 = new ArrayList();
		list2.add(4);
		list2.add(9);
		list2.add(11);
		list2.add(3);
		
		int l1 = list1.size();
		int l2 = list2.size();
		
		list1.addAll(list2);
		int flag = 0;
		int temp = 0;
		int flag1 = 0;
		int counter = 1;
		
		while( l1+temp==l1+l2)	{		
			int e = (int)list1.get(l1+temp);
			int c = 0;
			for(int j = flag; j<l1+c; j++){
				if (e < (int)list1.get(j)){
					list1.add(0);
					list1.remove(l1+temp);
					list1.add(j, e );
					list1.remove(l1+l2-1);
					c=c+1;
					flag = j;
					temp = temp + 1;
					flag1 = 1;
					break;
				}
			}
			if(flag1 == 0)	{
				break;
			}
		}
		
		System.out.println(list1);
	}

}
