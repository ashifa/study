import java.util.Arrays;
import java.util.Random;

public class SubStrLocater {

	public static long locate(char[] str, char[] sub) {
		for (int i = 0; i < str.length - sub.length + 1; i++) {
			int j;
			for (j = 0; j < sub.length; j++) {
				if (str[i + j] == sub[j])
					continue;
				else
					break;
			}
			if (j == sub.length)
				return i;

		}
		return -1;
	}

	public static void test(char[] str, char[] sub) {
		System.out.println(str);

		System.out.println(sub);
		
		long a = locate(str, sub);
		long b = String.valueOf(str).indexOf(String.valueOf(sub));
 
		System.out.println(a+" "+b +" " +(a==b));
	}

	public static void main(String[] args) {

		int abc = 3;
		Random rd = new Random();
		char[] tmp = new char[6];
		for (int i = 0; i < tmp.length; i++)
			tmp[i] = (char) (rd.nextInt(abc) + 'a');

		char[] substr = new char[2];
		for (int i = 0; i < substr.length; i++)
			substr[i] = (char) (rd.nextInt(abc) + 'a');

		test(tmp,substr);

	}

}
