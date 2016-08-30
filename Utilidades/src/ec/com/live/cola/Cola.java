package ec.com.live.cola;

import java.util.LinkedList;

public class Cola {

	public static void main(String[] args) {
		
		/*
		 * peek -> no elimina elementos de la cola
		 * poll -> elimina elementos de la cola
		 */

		LinkedList cola=new LinkedList();
		for (int i = 0; i <=10 ; i++) {
			cola.offer(i);
		}
		
		while (cola.peek()!=null) {
			System.out.println(cola.poll());
		}

	}

}
