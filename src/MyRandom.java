import java.util.*;

public class MyRandom {
	static Random rd = new Random();

	static int[] getArray(int size, int uplimit) {
		int[] rtn = new int[size];
		for (int i = 0; i < size; i++)
			rtn[i] = rd.nextInt(uplimit);
		return rtn;
	}

	static int[] getNoneRepeatArray(int size, int uplimit) throws Exception {
		int[] rtn = new int[size];
		// Set<Integer> set = new HashSet<>();
		if (size > uplimit) {
			throw new Exception("shit");
		}

		int i = 0;
		while (i < size) {
			int tmp = rd.nextInt(uplimit);
			int j = 0;
			for (j = 0; j < i; j++)
				if (rtn[j] == tmp)
					break;
			if (j < i)
				continue;

			rtn[i] = tmp;
			i++;
		}
		return rtn;
	}

	static public void main(String[] args) throws Exception {

		for (int i : MyRandom.getNoneRepeatArray(15, 25)) {
			System.out.println(i);
		}
	}

}
