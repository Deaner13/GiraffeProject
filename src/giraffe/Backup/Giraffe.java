package giraffe;

import java.util.ArrayList;


public class Giraffe extends Object {
	
	//Declare the attributes of each Giraffe as private as good practice.
	//Since there are no mathematical operations needing to be done on the data it is
	//all imported as Strings.
	private String birthLocation, sire, dam, subSpecies, zoo, city, state, event, name,
	localId, birthDate, sex, giraffeId, eachGiraffe;
	private int howManyGiraffes;
	
	//Added an int birth year for Homework 4
	private String birthYear;

	
	//Make a Giraffe constructor that takes in the temp array and creates a Giraffes out
	//of the values.
	public Giraffe(String array[]){
	
	//Each array element of temp is formatted and then assigned to the correct variable.
	//This prints out an easy to read list of giraffes.
		this.giraffeId = String.format("%-4s",array[0]);
		this.sex = String.format("%-1s",array[1]);
		this.birthDate = String.format("%-10s",array[2]);
		this.birthYear = this.birthDate.substring(0, 4);
		this.sire = String.format("%-4s",array[3]);
		this.dam = String.format("%-4s",array[4]);
		this.birthLocation = String.format("%-12s",array[5]);
		this.localId = String.format("%-7s",array[6]);
		this.name = String.format("%-20s",array[7]);
		this.subSpecies = String.format("%-14s",array[8]);
		this.zoo = String.format("%-35s",array[9]);
		this.city = String.format("%-17s",array[10]);
		this.state = String.format("%-13s",array[11]);
		this.event = String.format("%-7s",array[12]);
	
	}
	
	//Create a method that counts the number of giraffes at the Cheyenne Mountain Zoo.
	public void getZoo(ArrayList<Giraffe> giraffes){
	
	//Create separate variables for calculating if a giraffe is at CMZ.
		String currentZoo = "";
		int cmzCounter = 0;
	
	//Loop through the ArrayList of giraffes and if a giraffes zoo contains "Cheyenne Mtn"
	//then cmzCounter is incremented by 1.
		for(int i = 0; i < giraffes.size(); i++){
			currentZoo = giraffes.get(i).zoo;
			if(currentZoo.contains("Cheyenne Mtn")){
				cmzCounter++;
			}
		}
	//Prints out the number of giraffes at Cheyenne Mountain Zoo in a sentance that makes sense of the number.
		System.out.println("There are  " + cmzCounter + " giraffes currently at Cheyenne Mountain Zoo.");
		
	}
	
	//A method that prints out the number of Giraffes in the file.
	public void printData(Object[] giraffes){
	//Increments howManyGiraffes by one for every item in the object Array.
		for(int i = 0; i < giraffes.length; i++){
			this.howManyGiraffes++;
		}
	//Prints out the number of giraffes in the file in a sentence that makes sense of the number.
		System.out.println("There are " + this.howManyGiraffes + " giraffes in the file.");
	}
	
	public void getYear(ArrayList<Giraffe> giraffes){
		int z = giraffes.size();
		int[][][] yearArray;
		yearArray = new int[z][z][z];
		int year;
		int intID;
		int row = 1;
		
		for (int i = 0; i < giraffes.size(); i++){
			year = Integer.parseInt(giraffes.get(i).birthYear);
			intID = Integer.parseInt(giraffes.get(i).giraffeId);
			
			
			
		}
	}
	
	//Override the default toString method to print out each element of a called upon giraffe in a
	//logical and organized way.
	public String toString(){
	//Variable eachGiraffe is a String comprised of each variable that describes the giraffe.
	//Formatting is done to make the list look nice and easy to read.
		eachGiraffe = (this.giraffeId + " " +
				this.sex + " " +
				this.birthDate + " " +
				this.sire +
				" " +
				this.dam + " " +
				this.birthLocation + " " +
				this.localId + " " +
				this.name + 
				" " + 
				this.subSpecies + " " +
				this.zoo + " " +
				this.city + " " +
				this.state + " " + 
				this.event);
	//Returns the formatted String for each eachGiraffe.
		return eachGiraffe;
	}		
}
