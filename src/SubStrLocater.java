import java.util.Random;

public class SubStrLocater {

	public static void main(String[] args) {

		int abc = 6;
		Random rd = new Random();
		char[] tmp = new char[50];
		for (int i = 0; i < tmp.length; i++)
			tmp[i] = (char) (rd.nextInt(abc) + 'a');

		char[] substr = new char[3];
		for (int i = 0; i < substr.length; i++)
			substr[i] = (char) (rd.nextInt(abc) + 'a');

		// Arrays.sort(tmp);
		System.out.println(tmp);

		System.out.println(substr);

		for (int i = 0; i < tmp.length - substr.length; i++) {
			int j = 0;
			for (j = 0; j < substr.length; j++) {
				if (substr[j] != tmp[i + j])
					break;
			}
			if (j == substr.length) {
				System.out.println(i);
				break;
			}
		}

	}

}
