public class Sort {
	static void swap(int[] data, int i, int j) {
		int tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}

	static void qsort(int[] Array, int l, int u) {
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
				swap(Array, i, j);
			} else
				break;

		}
		Array[l] = Array[j];
		Array[j] = key;
		qsort(Array, l, j - 1);
		qsort(Array, j + 1, u);
	}

	static public void bubbleSort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++)
				if (a[j] > a[j + 1])
					swap(a, j, j + 1);
		}
	}

	public static void insertSort(int[] a) {
		for (int i = 1; i < a.length; i++)
			for (int j = i; j > 0; j--)
				if (a[j] < a[j - 1])
					swap(a, j, j - 1);
				else
					break;
	}

	static void test() throws Exception {
		int[] array = MyRandom.getNoneRepeatArray(18, 30);

		for (int i : array)
			System.out.print(i + "; ");
		System.out.println("---");

		// Sort.qsort(array, 0, array.length-1);
		//Sort.bubbleSort(array);
		Sort.insertSort(array);
		for (int i : array)
			System.out.print(i + "; ");
		System.out.println("---");
		for (int i = 0; i < array.length - 1; i++)
			if (array[i] > array[i + 1]) {
				System.err.println("fail");
				System.exit(0);
			}

	}

	public static void main(String[] args) throws Exception {
		int num = 20;
		for (int i = 0; i < num; i++)
			test();

	}

}
