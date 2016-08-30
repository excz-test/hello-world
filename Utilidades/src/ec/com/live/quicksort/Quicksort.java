package ec.com.live.quicksort;

public class Quicksort {

	public static void main(String[] args) {
		int [] array={5,6,9,1,8,6,23,1,5,4,2,485,6,4};
		Ordenamiento ordQ=new Ordenamiento();
		ordQ.ordenar(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
