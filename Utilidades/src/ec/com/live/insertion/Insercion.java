package ec.com.live.insertion;

public class Insercion {

	public static void main(String[] args) {
		int [] array={10,9,8,7,6,5,4,3,2,1,0};
		OrdenamientoPorInsercion oi=new OrdenamientoPorInsercion();
		oi.ordenarInsercion(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		

	}

}
