package learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Concepts {

	/*--------------------------------------------------------------
	 * --Casting--
		
		int intValue = 1029;
		short shortValue = 10;
		byte byteValue = 127;
		long longValue = 15673;
		float floatValue = 9.2f;
		double doubleValue = 823.881;
		
		intValue = (int)longValue;
		System.out.println(intValue);
		
		intValue = (int)doubleValue;
		System.out.println(intValue);
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		byteValue = (byte)longValue;
		System.out.println(byteValue);
		
		-------------------------------
		--Casting Continued--
		
		Machine mach1 = new Machine();
		Camera camera1 = new Camera();
		
		mach1.starting();
		camera1.starting();
		camera1.snap();
		
		//Upcasting
		//Creating objects of the parent class from a child
		Machine machine2 = new Camera();
		Machine machine3 = camera1;
		
		//Downcasting
		//Does not work -> Camera camera2 = new Machine();
		
		Machine machine4 = new Camera();
		Camera camera = (Camera)machine4;
		
		-----------------------------------
		--Array Lists & Generalized statements--
		
		Giraffe giraffe1 = new Giraffe();
		Giraffe giraffe2 = new Giraffe();
		ArrayList<Giraffe> giraffes = new ArrayList<Giraffe>();
		
		giraffes.add(giraffe1);
		giraffes.add(giraffe2);
		
		Giraffe giraffe3 = giraffes.get(1);
		
		System.out.println(giraffe3);
		
		// There can be multiple types of arguemnts //
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		ArrayList<Integer> someList = new ArrayList<>();
		i++;
		
		--------------------------------------
		--ArrayLists of Objects--
	
		ArrayList<String> string = new ArrayList<>();
		showList(string);
		}
	
		public static void showList(ArrayList<String> strings) {
		for(String value: strings){
			System.out.println(value);
		}	
		
		------------------------------------------
		--Anonymous Classes--
	
		Machine mach1 = new Machine(){
			public void start(){
				System.out.println("NOT STARTING!");
			}
		};
		mach1.start();
		Machine mach2 = new Machine();
		mach2.start();
		
		Info info = new Info(){
			public void showInfo(){
				System.out.println("Info Showing!");
			}
		};
		info.showInfo();
		
			--------------------------------------------
		 * --Classes-- 
		 * //Declare a new instance of class Person Person deane = new
		 * Person();
		 * 
		 * //Give person attributes deane.age = 24; deane.name = "Deane";
		 * 
		 * //deane.speak();
		 * 
		 * //Get information from return of methods String name = deane.myName();
		 * System.out.println("My Name is: " + name);
		 * 
		 * int retire = deane.calcRetire();
		 * System.out.println("Years until retirement: " + retire);
		 * 
		 * int age = deane.getAge(); System.out.println("Age is: " + age);
		 * 
		 * deane.speak("Hi I'm Deane"); deane.jump(age);
		 * 
		 * deane.move("west", 3521); 
		 * --------------------------------------------------------------
		 * --Getters--
		 * Person deane = new Person();
		 * 
		 * deane.name = "deane"; deane.age = 24;
		 * 
		 * System.out.println(deane.name + deane.age);
		 * 
		 * deane.getName("Deane"); deane.getAge(25);
		 * 
		 * System.out.println(deane.name + deane.age);
		 * --------------------------------------------------------------
		 * --Setters-- Robot george = new
		 * Robot();
		 * 
		 * Robot bill = new Robot("bill");
		 * 
		 * Robot deane = new Robot("Deane", 10041);
		 * --------------------------------------------------------------
		 * --Static Variables-- 
		 * //Call static variables using class.variable System.out.println(Static.count);
		 * Static stat1 = new Static(); Static stat2 = new Static();
		 * 
		 * stat1.name = "NAME: Stat1"; 
		 * stat2.name = "NAME: Stat2";
		 * 
		 * Static.description = "I do not change"; 
		 * 
		 * Static.showInfo();
		 * 
		 * 
		 * stat1.showName(); 
		 * stat2.showName();
		 * 
		 * System.out.println(Static.LUCKY_NUMBER);
		 * --------------------------------------------------------------
		 * --String Builder--
		 * import java.lang.StringBuilder;
		 * 
		 * //Inefficient way String info = ""; 
		 * info += "My Name is Deane"; 
		 * info += " "; 
		 * info += "I am a builder";
		 * 
		 * System.out.println(info);
		 * 
		 * 
		 * //More efficient 
		 * StringBuilder sb = new StringBuilder("");
		 * 
		 * sb.append("My name is Jep"); 
		 * sb.append(" I am deane!");
		 * 
		 * System.out.println("Printing sb: " + sb);
		 * 
		 * StringBuilder s = new StringBuilder(""); 
		 * s.append("My name is Arya ")
		 * .append(" " + sb) .append(" " + info);
		 * 
		 * System.out.println("Printing s: "+ s);
		 * 
		 * //Formatting in Strings
		 * 
		 * //New Line: System.out.println("\n"); //Tab: System.out.println("\t");
		 * 
		 * //Print Format //Ints
		 * System.out.printf("Integer Formatting %d; and %d\n", 5, 1029); 
		 * //You can assign formatting alignment using %2d for example 
		 * for(int i = 0; i < 16; i += 5){ 
		 * 	System.out.printf("%2d: some text here\n", i); 
		 * }
		 * 
		 * //Strings 
		 * System.out.printf("%s\n","This is a String Example");
		 * System.out.printf("%27s\n","This is a short Example");
		 * //You can assign a size to variables using %.15 for example
		 * System.out.printf("%.15s\n","This is a short Example");
		 * 
		 * //Floating point 
		 * System.out.printf("%f\n", 5.14413);
		 * System.out.printf("%.2f", 5.14413); 
		 * System.out.printf("%6.2f", 5.14413);
		 * --------------------------------------------------------------
		 * --Interfaces--
		 * 
		 * String array1[];
		 * 
		 * array1 = new String[10];
		 * 
		 * NewString string1 = new NewString();
		 * 
		 * for(int i = 0; i < 10; i++){ 
		 * 	array1[i] = string1.moreStrings("giraffe", i); 
		 * }
		 * 
		 * for(int g = 0; g < 10; g++){ 
		 * 	String newGiraffe = array1[g];
		 * 	System.out.println("I'm a new Giraffe called: " + newGiraffe); 
		 * } 
		 * ------------------------------------------------------- 
		 * --Reading in Files using Scanner-- 
		 * //String fileLocation = "C:\\PERSONAL\\School\\2015\\CS1450\\TheHerd.txt"; 
		 * String fileLocation = "theHerd.txt"; 
		 * 
		 * File textFile = new File(fileLocation);
		 * 
		 * Scanner in = new Scanner(textFile);
		 * 
		 * String firstLine = in.nextLine();
		 * 
		 * System.out.println(firstLine); 
		 * System.out.println(" ");
		 * 
		 * while(in.hasNextLine()){
		 * 	String line = in.nextLine();
		 * 	System.out.println(line);
		 * }
		 * 
		 * in.close();
		 * --------------------------------------------------------
		 * --Exceptions 1--
		 * 
			try { 
				openFile();
			} catch (FileNotFoundException e){
				System.out.println("Could not open file");
			}
			
			
			
			}
		
			public static void openFile() throws FileNotFoundException{
			
			String fileLocation = "theHerd.txt";
			File theHerd = new File(fileLocation);
			
			FileReader fr = new FileReader(fileLocation);
			----------------------------------------------------------
			--Exceptions 2--
		
		
	 */
}
