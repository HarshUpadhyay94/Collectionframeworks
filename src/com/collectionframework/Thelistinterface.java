package com.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Thelistinterface {
	
public static void main(String[] args) {
	List list = new ArrayList();
	list.add(12);
	list.add(20);
	list.add(20);
	list.add(40);
	
	
	
	List a=new ArrayList();
	a.add(10);
	a.add(20);
	
	
	
	System.out.println(list.containsAll(a));
}
}
