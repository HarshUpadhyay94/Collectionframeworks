package com.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(1);
	a.add(12);
	a.add(13);
	a.add(14);
	a.add(15);
	System.out.println(a.size());
	Iterator it= a.iterator();
	
while(it.hasNext()) {
		Object o= it.next();
		System.out.println(o);
	}
}
}
