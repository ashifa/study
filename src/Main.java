import java.io.*;
import java.util.*;

public class Main {

	static Scanner scanner;

	static int N = 0;// 100
	static byte[][] matrix = null;

	public static void solveProblem() {
		int curAswr = 0;
		int[][] curHold = new int[N][];
		for (int i = 0; i < N; i++)
			curHold[i] = new int[N];

		for (int i = 0; i < N; i++) {
			byte[] curArray = matrix[i];

			for (int j = 0; j < N; j++) {
				int sum = 0;
				for (int k = 0; k <= j; k++) {
					sum += curArray[j - k];
					curHold[j][k] = sum;
				}
			}
			int a = 3;
			/*
			 * for (int j = 1; j < N; j++) { curHold = curHold > 0 ? curHold +
			 * curArray[j] : curArray[j]; curAswr = curHold > curAswr ? curHold
			 * : curAswr; } System.out.println(curAswr);
			 */
		}

	}

	static void readInput() {
		N = scanner.nextInt();
		matrix = new byte[N][];

		for (int i = 0; i < N; i++) {
			matrix[i] = new byte[N];
		}

		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				matrix[i][j] = scanner.nextByte();

	}

	static void initScanner() throws FileNotFoundException {
		File file = new File("input.txt");
		scanner = file.exists() ? new Scanner(file) : new Scanner(System.in);
	}

	public static void main(String[] args) throws Exception {

		// initScanner();
		// readInput();
		// solveProblem();

		String in = "VICTORIOUSz";
		List<Character> array = new ArrayList<>();
		int[] bt = new int['z'+1];
		for (byte a : in.getBytes()) {
			bt[a]++;
		}

 

		for (Character i = 0; i < 'z'+1; i++)
			System.out.println(i+" " + bt[i]);
	}

}
