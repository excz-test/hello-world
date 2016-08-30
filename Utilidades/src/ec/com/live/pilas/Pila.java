package ec.com.live.pilas;

import java.util.Stack;

public class Pila {
/*
 * push
 * pop - obtener el ultimo valor y lo elimina
 * peek - ver
 * empty
 * */
	public static void main(String[] args) {
		//FILO el primero que entra es el último en salir
		Stack pila=new Stack();
		pila.push(50);
		pila.push("String");
		pila.push(0);
		pila.push("second");
		//Con stack solo se puede obtener el ultimo valor de la pila
		System.out.println("último valor: "+pila.peek());
		while (!pila.empty()) {
			System.out.println(pila.pop());
			
		}
		
	}
}
