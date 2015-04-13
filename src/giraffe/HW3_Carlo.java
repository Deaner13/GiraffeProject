package giraffe;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HW3_Carlo {

	public static void main(String[] args) throws IOException {
		//Create an array structures that will hold the Giraffes
		ArrayList<Giraffe> giraffes = new ArrayList<>();
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
				giraffes.add(new Giraffe(temp));
				}
			}
		in.close();
		
		//Convert ArrayList to array.
		giraffes2 =  giraffes.toArray();
		
		//Print out the necessary data. This could all be integrated into a method or
		//class if needed.
		System.out.println(header);
		System.out.println(" ");
		//Loop through the ArrayList to print out the different Giraffes.
		for(int i = 0; i < giraffes.size(); i++){
			System.out.println(giraffes.get(i).toString());
		}
		
		//A little formatting and calls to the counters that print out how many giraffes
		//are in the file and also how many are at Cheyenne Mountain Zoo. Entering any number
		//that is valid for the ArrayList will return the same result.
		System.out.println("");
		giraffes.get(1).getZoo(giraffes);
		giraffes.get(1).printData(giraffes2);
	}
}
