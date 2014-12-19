import java.util.Arrays;
import java.util.Random;

public class SubStrLocater {

	public static void main(String[] args) {

		String in = "adfdafdas";

		char[] tmp = new char[50];
		Random rd = new Random();

		for (int i = 0; i < tmp.length; i++)
			tmp[i] = (char) (rd.nextInt(26) + 'a');

		Arrays.sort(tmp);
		System.out.println(tmp);
		int a = 'A';
		int b= 'a';
		System.out.println(b);
				
	}

}
