import java.util.*;

 

public class fbnc {
	
	public static int calc(int n){
		double tmpa,tmpb;
		
		double key = Math.sqrt(5);
		
		tmpa = 1+ key;
		tmpa /=2;
		tmpa = Math.pow(tmpa, n);
		
		tmpb = 1- key;
		tmpb /=2;
		tmpb = Math.pow(tmpb, n);
		
		return   (int) ((tmpa+tmpb)/key);
		
 
		
	}

	public static void main(String[] args) {
		
 
		for ( int i=0; i<=10;i++){
		int ans = calc(i);
		System.out.print(i+" ");
		System.out.println(ans);
		}


	}

}
