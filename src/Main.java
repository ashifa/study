import java.io.*;
import java.util.*;

public class Main {

	static List<Integer> stickList = new ArrayList<Integer>(128);
	static Scanner scanner;
	static boolean isTest = true;
	static int[] usedList = new int[128];
	static int sum = 0;

	public static void solveProblem() {
		sum = 0;
		for (int i : stickList)
			sum += i;
		// System.out.println("sum = " + sum);

		for (int i = stickList.get(0); i <= sum / 2; i++) {
			if (sum % i != 0)
				continue;

			Arrays.fill(usedList, 0);
			// System.out.println("try length " + i);
			usedList[0] = 1;
			if (true == guess(0 + 1, i, i - stickList.get(0), 0)) {
				System.out.println(i);
				return;
			}

		}
		System.out.println(sum);
	}

	public static boolean guess(int starter, int goal, int left,
			int finishedStick) {

		// System.out.println("starter "+starter+" left "+left+" finishedstick "+finishedStick);

		if (left == 0) {// current stick is MR right.
			if (finishedStick == sum / goal - 2)
				return true;
			else {

				int cur = 0;
				while (usedList[cur] == 1)
					cur++;
				usedList[cur] = 1;
				if (true == guess(cur + 1, goal, goal - stickList.get(cur),
						finishedStick + 1))
					return true;
				else {
					usedList[cur] = 0;

					return false;
				}
			}
		} else {// current stick is short,

			if (starter >= stickList.size())
				return false;
			while (usedList[starter] == 1 || stickList.get(starter) > left) {
				starter++;
				if (starter >= stickList.size())
					return false;
			}			
			usedList[starter] = 1;
			if (guess(starter + 1, goal, left - stickList.get(starter),
					finishedStick))
				return true;
			usedList[starter] = 0;

			// find next stick with the length not equal to current.
			int curlength = stickList.get(starter);
			while (stickList.get(starter) == curlength) {
				starter++;
				if (starter == stickList.size())
					return false;
			}
			return guess(starter, goal, left, finishedStick);
		}
	}

	static void initScanner() throws FileNotFoundException {
		// set up the input
		if (isTest) {
			File file = new File("input.txt");
			scanner = new Scanner(file);
		} else
			scanner = new Scanner(System.in);
	}

	public static void main(String[] args) throws Exception {

		initScanner();
		while (scanner.hasNext()) {
			int count = scanner.nextInt();
			if (count == 0)
				break;

			while (count-- > 0) {
				stickList.add(scanner.nextInt());
			}

			Collections.sort(stickList, new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o1 > o2 ? -1 : o1 == o2 ? 0 : 1;
				}
			});
			// System.out.println(stickList);
			// System.out.println();
			solveProblem();
			stickList.clear();
		}

	}
}
