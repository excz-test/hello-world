package ec.com.live;

public class Uno {

	public static void main(String[] args) {
		/*for (int i = 1; i < 100; i+=2) {
			System.out.println(i);
		}*/
		
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a+", "+b);
		for (int i = 1; i < 100; i+=2) {
			
			c=a+b;
			System.out.print(","+c);
			b=a;
			a=c;
		}
		

	}

}
