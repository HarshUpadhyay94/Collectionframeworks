package com.collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Testmarksheet {

	public static void main(String[] args) {
		Marksheet m1 = new Marksheet();
		m1.setRollno("2");
		m1.setFname("pankaj");
		m1.setLname("sharma");
		m1.setPhysics(40);
		m1.setChemistry(50);
		m1.setMaths(60);

		Marksheet m2 = new Marksheet();
		m2.setRollno("1");
		m2.setFname("pankaj");
		m2.setLname("verma");
		m2.setPhysics(60);
		m2.setChemistry(30);
		m2.setMaths(20);

		Marksheet m3 = new Marksheet();
		m3.setRollno("5");
		m3.setFname("virat");
		m3.setLname("kohli");
		m3.setPhysics(70);
		m3.setChemistry(80);
		m3.setMaths(90);

		Marksheet m4 = new Marksheet();
		m4.setRollno("3");
		m4.setFname("virat");
		m4.setLname("raina");
		m4.setPhysics(40);
		m4.setChemistry(60);
		m4.setMaths(75);

		Marksheet m5 = new Marksheet();
		m5.setRollno("4");
		m5.setFname("harsh");
		m5.setLname("sahu");
		m5.setPhysics(6);
		m5.setChemistry(9);
		m5.setMaths(32);

		ArrayList a = new ArrayList();
		a.add(m1);
		a.add(m2);
		a.add(m3);
		a.add(m4);
		a.add(m5);

		Collections.sort(a, new Testcomprator());

		Iterator it = a.iterator();
		while (it.hasNext()) {
			Marksheet r = (Marksheet) it.next();
			System.out.println(r.getRollno() + " " + r.getFname() + " " + r.getLname() + " " + r.getPhysics() + " "
					+ r.getChemistry() + " " + r.getMaths());

		}

	}
}
