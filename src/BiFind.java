import java.util.Arrays;
import java.util.Random;

public class BiFind {

	public static int find(int[] a, int key, int l, int u) {
		if (l > u)
			return -1;
		int midkey = (l + u) / 2;
		int midvalue = a[midkey];
		if (midvalue == key)
			return midkey;
		else if (midvalue < key)
			return find(a, key, midkey + 1, u);
		else
			return find(a, key, l, midkey - 1);
	}

	public static void main(String[] args) {
		Random rd = new Random();
		int[] data = new int[20];
		for (int i = 0; i < 20; i++)
			data[i] = rd.nextInt(20);
		Arrays.sort(data);
		for (int i : data)
			System.out.print(i + " ");

		System.out.println("|||Value 9 is  in  " + find(data, 9, 0, 19));

	}

}
