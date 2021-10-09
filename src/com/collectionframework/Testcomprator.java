package com.collectionframework;

import java.util.Comparator;

public class Testcomprator implements Comparator<Marksheet> {
	
	
	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		//return o1.getFname().compareTo(o2.getFname());
		
		if(o1.getFname().equals(o2.getFname())) {
			return(o1.getLname().compareTo(o2.getLname()));
		}else {
			return o1.getFname().compareTo(o2.getFname());
		}
		
		}
		
	}

