package ec.com.live.bubble;

public class OrdenamientoBurbuja {

	public static void main(String[] args) {
		int [] arreglo = {5,7,0,0,0,0,0,9,25,3,0,21,4,12,80};
		Ordenamiento ord=new Ordenamiento();
		ord.ordenarBurbuja(arreglo);
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("["+arreglo[i]+"]");
		}

	}

}
