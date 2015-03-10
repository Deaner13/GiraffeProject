package giraffe;
import learning.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;


public class App {

	public static void main(String[] args){
		
		Test test = new Test();
		
		/*try{
		test.run();
		} catch(ParseException e){
			System.out.println("Couldn't parse");
		}
		catch(IOException e){
			System.out.println("Couldn't parse");
		}
		*/
		/*
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("EXCEPTION!");
		}
		*/
		try{
		test.run();
		} catch(Exception e){
			System.out.println("Couldn't parse");
		}
	}
}

