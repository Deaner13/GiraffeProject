package giraffe;

public class Giraffe2 extends Object {
	private String birthLocation, sire, dam, subSpecies, zoo, city, state, event, name,
	localId, birthDate, sex, giraffeId, eachGiraffe;
	private int atCMZ, howManyGiraffes;
	
	public Giraffe2(String array[]){
		this.giraffeId = array[0];
		this.sex = array[1];
		this.birthDate = array[2];
		this.sire = array[3];
		this.dam = array[4];
		this.birthLocation = array[5];
		this.localId = array[6];
		this.name = array[7];
		this.subSpecies = array[8];
		this.zoo = array[9];
		this.city = array[10];
		this.state = array[11];
		this.event = array[12];
		
		this.giraffeId = String.format("%-4s",this.giraffeId);
		this.sex = String.format("%-1s",this.sex);
		this.birthDate = String.format("%-10s",this.birthDate);
		this.sire = String.format("%-4s",this.sire);
		this.dam = String.format("%-4s",this.dam);
		this.birthLocation = String.format("%-12s",this.birthLocation);
		this.localId = String.format("%-7s",this.localId);
		this.name = String.format("%-20s",this.name);
		this.subSpecies = String.format("%-14s",this.subSpecies);
		this.zoo = String.format("%-35s",this.zoo);
		this.city = String.format("%-17s",this.city);
		this.state = String.format("%-13s",this.state);
		this.event = String.format("%-7s",this.event);
		
		for(int i = 0; i < array.length; i++){
			this.howManyGiraffes++;
		}
		
		if(array[9] == "Cheyenne Mtn Zoological Park"){
			this.atCMZ++; 
			System.out.println("This:" + this.atCMZ);
		}
	
	}
	
	public void format(Giraffe giraffe){
		
		this.giraffeId = String.format("%-4s",this.giraffeId);
		this.sex = String.format("%-1s",this.sex);
		this.birthDate = String.format("%-10s",this.birthDate);
		this.sire = String.format("%-4s",this.sire);
		this.dam = String.format("%-4s",this.dam);
		this.birthLocation = String.format("%-12s",this.birthLocation);
		this.localId = String.format("%-7s",this.localId);
		this.name = String.format("%-20s",this.name);
		this.subSpecies = String.format("%-14s",this.subSpecies);
		this.zoo = String.format("%-35s",this.zoo);
		this.city = String.format("%-17s",this.city);
		this.state = String.format("%-13s",this.state);
		this.event = String.format("%-7s",this.event);
		
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
/*
public void Giraffe2(int giraffeId, String sex, String birthDate, String sire, String dam,
String birthLocation, String localId, String name, String subSpecies, String zoo,
String city, String state, String event)
*/