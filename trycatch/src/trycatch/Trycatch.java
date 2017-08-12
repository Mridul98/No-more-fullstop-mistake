package trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Trycatch {

	public static void main(String[] args) throws FileNotFoundException {
		String filename = "C:\\Users\\mridul\\Desktop\\java.txt";
		File textfile = new File(filename);
		Scanner in = new Scanner(textfile);
		while (in.hasNextLine()) {
			String line = in.nextLine();
			char[] lines = line.toCharArray();
		
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < lines.length; i++) {

				sb.append(lines[i]);
				if (Character.isLetterOrDigit(lines[line.length() - 1])) {
					if (i == lines.length-1) {
						sb.append(".");
					}
				}

			}

			System.out.println(sb);

		}
		in.close();

	}
}
