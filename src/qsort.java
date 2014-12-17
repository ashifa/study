public class qsort {

	static void sort(int[] Array, int l, int u) {
		if (l >= u)
			return;
		int key = Array[l];
		int i = l + 1;
		int j = u;
		while (true) {
			while (Array[i] <= key && i < j)
				i++;

			while (Array[j] > key)
				j--;

			if (i < j) {
				int tmp = Array[i];
				Array[i] = Array[j];
				Array[j] = tmp;
			} else
				break;

		}
		Array[l] = Array[j];
		Array[j] = key;
		sort(Array, l, j - 1);
		sort(Array, j + 1, u);
	}
	
	static boolean find(int[] array, int key, int l, int u){
		return true;
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] array = MyRandom.getNoneRepeatArray(18, 18);
		for (int i : array)
			System.out.print(i+" ");

		qsort.sort(array, 0, array.length - 1);
 
	}

}
