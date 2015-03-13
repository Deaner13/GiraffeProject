package giraffe;

import java.util.ArrayList;

public class Giraffe2 extends Object {
	private String birthLocation, sire, dam, subSpecies, zoo, city, state, event, name,
	localId, birthDate, sex, giraffeId, eachGiraffe;
	private int ahowManyGiraffes;
	private int atCMZ = 0;
	
	public Giraffe2(String array[]){
	
		this.giraffeId = String.format("%-4s",array[0]);
		this.sex = String.format("%-1s",array[1]);
		this.birthDate = String.format("%-10s",array[2]);
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
	
	public void getZoo(ArrayList<Giraffe2> giraffes){
		
		for(int i = 0; i < 89; i++){
			
			this.zoo = String.format("%-28s", this.zoo);
			Giraffe2 newGiraffe = giraffes.get(i);
			if(newGiraffe.zoo == "Cheyenne Mtn Zoological Park"){
			atCMZ++;
			System.out.println(atCMZ);
			}
		}
	}
	
	public void printData(Object[] giraffes){
		
		for(int i = 0; i < giraffes.length; i++){
			this.ahowManyGiraffes++;
			if (this.zoo == "Cheyenne Mtn Zoological Park"){
				this.atCMZ++;
			}
		}
		System.out.println("There are " + this.ahowManyGiraffes + " giraffes in the file.");
	}
	
	public String toString(){
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
		return eachGiraffe;
		
	}
			
}
