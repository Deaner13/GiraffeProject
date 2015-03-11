package giraffe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//String firstLine = in.nextLine();
//System.out.println(firstLine);
//System.out.println(" ");

public class HW3_Carlo {

	public static void main(String[] args) throws IOException {
		ArrayList<Giraffe2> giraffes = new ArrayList<>();
		String line;
		String temp[] = new String[13];
		int i = 0;

		String fileLocation = "theHerd.txt";
		File textFile = new File(fileLocation);
		
		while(i < 90) {
		if (textFile.canRead()) {
			Scanner in = new Scanner(textFile);
			in = new Scanner(textFile);
			while (in.hasNextLine()) {
				temp = in.nextLine().split("\\t", 13);
				giraffes.add(new Giraffe2(temp));
				
				//for (int i = 0; i < temp.length; i++) {
					//giraffes.add(new Giraffe2(temp));
					//i++;
				//}
				i++;
				in.close();
			}
			
			in.close();
		}
		System.out.println();
		}
	}
}
