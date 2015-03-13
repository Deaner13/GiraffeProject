package giraffe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HW3_Carlo {

	public static void main(String[] args) throws IOException {
		//Create an array structures that will hold the Giraffes
		ArrayList<Giraffe2> giraffes = new ArrayList<>();
		Object[] giraffes2;
		
		
		//Create an array that will hold tab-del values
		String temp[] = new String[13];
		String header = "";
		//Define the file that will be used for creating objects
		String fileLocation = "theHerd.txt";
		File textFile = new File(fileLocation);
		Scanner in = new Scanner(textFile);
		//Populate the giraffes ArrayList with items from the text file

		if (textFile.canRead()) {
			
		//Take the first line of the file and make it a header
			header = in.nextLine();
			
			while (in.hasNextLine()) {
		//Split each line at every tab (13 times), store in array temp
				temp = in.nextLine().split("\\t", 13);
		//Create a new giraffe from the array of strings in temp
				giraffes.add(new Giraffe2(temp));
				}
			}
		in.close();
		
		//Convert ArrayList to array
		giraffes2 =  giraffes.toArray();
		
		System.out.println(header);
		System.out.println(" ");
		//Print out t
		for(int i = 0; i < giraffes.size(); i++){
			System.out.println(giraffes.get(i));
			Giraffe2 newGiraffe = giraffes.get(i);
			newGiraffe.getZoo(giraffes);
		}
		giraffes.get(88).printData(giraffes2);
	}
}
