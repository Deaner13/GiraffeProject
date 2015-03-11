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
		
		
		String fileLocation = "theHerd.txt";
		File textFile = new File(fileLocation);

		Scanner in = new Scanner(textFile);

		while (in.hasNextLine()) {
			line = in.nextLine();
			temp = in.nextLine().split("\\t", 13);
			System.out.println(in);
			
			for (int i = 0; i < temp.length; i++) {
				giraffes.add(new Giraffe2(temp));
				i++;
			}
		}

		in.close();

		System.out.println(giraffes);

	}

}
