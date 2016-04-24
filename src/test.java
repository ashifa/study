import java.util.HashSet;
import java.util.Set;

public class test {

	static int[] rockSize = { 3, 1 };
	static int[] value = { 5, 2 };
	static int[] count = new int[rockSize.length];
	static Set<Integer> hits = new HashSet<>();

	public static void main(String[] args) throws Exception {

		find(5, 0);
		System.out.println(hits);

	}

	static int calcValue() {
		int sum = 0;
		for (int i = 0; i < rockSize.length; i++)
			sum += value[i] * count[i];
		for(int i:count)
			System.out.print(i);
		System.out.println("---" +sum);
		return sum;
	}

	static void find(int res, int index) {

		if (res < 0)
			return;
		else
			hits.add(calcValue());
		
		if (index >= rockSize.length)
			return;
		
		for (int i = 0; i <= res / rockSize[index]; i++) {
			count[index] = i;
			find(res - count[index] * rockSize[index], index + 1);
			count[index] = 0;
		}

	}
}
