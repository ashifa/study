
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
	
	static int find(int[] array, int key, int l, int u){
		//System.out.println(l +" "+u);
		if (l >u)
			return -1;
		int midkey = (l+u)/2;
		int midvalue = array[midkey];
//		System.out.println(midkey+" "+ midvalue+";");
		if (midvalue == key)
			return midkey;
		else if (midvalue > key)
			return find (array, key, l, midkey-1);
		else
			return find (array, key, midkey+1, u);
		
	}
	
	static void test() throws Exception{
		int[] array = MyRandom.getNoneRepeatArray(18, 30);
		
		for (int i : array)
			System.out.print(i+"; ");
		System.out.println("---");
		
		qsort.sort(array, 0, array.length - 1);
		
		for (int i : array)
			System.out.print(i+"; ");		
		System.out.println("---");
		System.out.println(find (array, 15, 0, array.length-1));
	}

	public static void main(String[] args) throws Exception {
		int num = 20;
		for(int i =0; i< num; i++)
			test();

  
	}

}
