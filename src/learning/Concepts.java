package learning;

import java.io.File;
import java.util.Scanner;

public class Concepts {

	/*--------------------------------------------------------------
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
	 */
}
