package ec.com.live.bubble;

public class Ordenamiento {
	
	public void ordenarBurbuja(int [] array){
		int aux;
		boolean cambios=false;
		
		while (true) {
			cambios=false;
			for (int i = 1; i < array.length; i++) {
				if (array[i]<array[i-1]) {
					aux=array[i];	//Intercambian las posiciones dentro del arreglo
					array[i]=array[i-1];
					array[i-1]=aux;
					cambios=true;
				}
			}
			if (cambios==false) {
				break;
			}
		}
	}

}
