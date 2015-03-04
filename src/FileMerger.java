import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class FileMerger {

	public static void mergeFile(String a, String b,String c) throws IOException {

		try (Scanner scannera = new Scanner(new File(a));
				Scanner scannerb = new Scanner(new File(b));
				BufferedWriter fw = new BufferedWriter(new FileWriter(c));) {

			while (scannera.hasNextLine() && scannerb.hasNextLine()) {
				fw.write(scannera.nextLine());
				fw.newLine();
				fw.write(scannerb.nextLine());
				fw.newLine();
			}
			@SuppressWarnings("resource")
			Scanner left = scannera.hasNextLine() ? scannera : scannerb;
			while (left.hasNextLine())
				fw.write(left.nextLine() + "\n");
		}
	}

	public static void main(String[] args) throws Exception {

		mergeFile("a.txt", "b.txt","c.txt");
		
		
		PipedWriter sw = new PipedWriter();
		 
		System.out.println();
	//	System.out.println(Byte.MAX_VALUE);
	}

}
