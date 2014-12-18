import java.io.File;

import java.io.FileWriter;
import java.util.Scanner;

public class FileMerger {

	public static void main(String[] args) throws Exception {
		Scanner scana = new Scanner(new File("a.txt"));
		Scanner scanb = new Scanner(new File("b.txt"));
		FileWriter fw = new FileWriter("c.txt");

		while (scana.hasNextLine() && scanb.hasNextLine())
			fw.write(scana.nextLine() + scanb.nextLine());

		Scanner scan = scana.hasNextLine() ? scana : scanb;
		while (scan.hasNextLine())
			fw.write(scan.nextLine()+"\n");
		
		fw.write("aa");fw.flush();
	}
	
}
