import java.io.*;
import java.util.*;

public class Main {

	static Scanner scanner;

	public static void solveProblem() {

	}

	static void readInput() {

	}

	static void initScanner() throws FileNotFoundException {
		File file = new File("input.txt");
		scanner = file.exists() ? new Scanner(file) : new Scanner(System.in);
	}

	public static void main(String[] args) throws Exception {

		initScanner();

		solveProblem();

	}
}
