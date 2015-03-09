package giraffe;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//C:\PERSONAL\School\2015\CS1450\TheHerd.txt

public class App {

	public static void main(String[] args) throws FileNotFoundException {
	
		//String fileLocation = "C:\\PERSONAL\\School\\2015\\CS1450\\TheHerd.txt";
		String fileLocation = "theHerd.txt";
		File textFile = new File(fileLocation);
		
		Scanner in = new Scanner(textFile);
		
		String firstLine = in.nextLine();
		
		System.out.println(firstLine);
		System.out.println(" ");
		while(in.hasNextLine()){
			String line = in.nextLine();
			System.out.println(line);
		}
		
		in.close();
	}
}

