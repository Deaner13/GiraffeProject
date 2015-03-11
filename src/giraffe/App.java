package giraffe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class App {

	public static void main(String[] args) throws FileNotFoundException{
		ArrayList<Giraffe2> giraffes = new ArrayList<>();
		String line[] = new String[100];
		String temp[] = new String[13];
		String split[] = new String[5];
		
		String fileLocation = "theHerd.txt";
		File textFile = new File(fileLocation);
		
	
		Scanner in = new Scanner(textFile);
		String firstLine = in.nextLine();
		System.out.println(firstLine);
		System.out.println(" ");
		
		
		int i = 0;
		while (in.hasNextLine()) {
			//line = in.nextLine();
			//temp[] = line[i].split[]("\\t");
			temp = in.nextLine().split("\\t",13);
			i++;
		}
		
		for(i = 0; i < temp.length; i++){
			giraffes.add(new Giraffe2(temp));
			//giraffes.add(new Giraffe2(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6],temp[7],temp[8],
			//		temp[9],temp[10],temp[11],temp[12]));
		}
		
		in.close();
		
		System.out.println(giraffes);
		
		
		/*
		
		
		Giraffe giraffe1 = new Giraffe();
		Giraffe giraffe2 = new Giraffe();
		giraffe1.setId("171");
		giraffe1.setSex("f");
		giraffe1.setBirth("1951-01-01");
		giraffe1.setSire("Wild");
		giraffe1.setDam("Wild");
		giraffe1.setBirthLocation("E.Africa");
		giraffe1.setLocalId("None");
		giraffe1.setName("Pamela");
		giraffe1.setSpecies("Ret/Roth");
		giraffe1.setZoo("NULL");
		giraffe1.setCity("NULL");
		giraffe1.setState("NULL");
		giraffe1.setEvent("Capture");
		
		giraffe1.printInfo();	
		*/
		
		
		
		
		// Giraffe giraffe3 = giraffes.get(1);

		// There can be multiple types of arguemnts //

		// HashMap<Integer, String> map = new HashMap<Integer, String>();

		// ArrayList<Integer> someList = new ArrayList<>();
		// i++;
	}
}
