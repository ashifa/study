import java.util.*;

public class fbnc {

	public static long calc(int n) {
		double a,b;
		double tmp = Math.sqrt(5);
		
		a = 1+tmp;
		a/=2;
		a = Math.pow(a, n);
		
		b = 1-tmp;
		b /=2;
		b = Math.pow(b, n);
		
		return (long) ( (a-b)/tmp);
 
	}

	public static long work(int n) {
		if (n<0)
			return 0;
		double a, b;
		double tmp = Math.sqrt(5);
		a = 1 + tmp;
		a /= 2;
		a = Math.pow(a, n);

		b = 1 - tmp;
		b /= 2;
		b = Math.pow(b, n);

		return (long) ((a - b) / tmp);

	}

	public static void main(String[] args) {

		for (int i = 0; i <= 50; i++) {

			System.out.print(i + "	");
			System.out.println(calc(i-1) +calc(i-2)+ "	" + work(i));
		}
 
	}

}
