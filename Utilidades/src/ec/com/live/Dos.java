package ec.com.live;

import java.util.LinkedList;

public class Dos {

	public static void main(String[] args) {
		
		LinkedList lk=new LinkedList();
		lk.add("Palabra");
		lk.add(2);
		lk.add(1,"Elber");
		System.out.println(lk.size());
		for (int i = 0; i < lk.size(); i++) {
			System.out.println(lk.get(i));			
		}
		
		



	}

}
