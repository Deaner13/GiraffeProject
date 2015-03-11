package giraffe;

public class Giraffe2 {
	private String birthLocation, sire, dam, subSpecies, zoo, city, state, event, name,
	localId, birthDate, sex, giraffeId;
	//protected int giraffeId;
	
	
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
		
	
	}
	
	public void printData(){
		System.out.println(this.giraffeId + " " + this.sex + " " + this.birthDate + " " + this.sire +
				" " + this.dam + " " + this.birthLocation + " " + this.localId + " " + this.name + 
				" " + this.subSpecies + " " + this.zoo + " " + this.city + " " + this.state + " " + 
				this.event);
	}
			//public Giraffe2(String giraffeId, String sex, String birthDate, String sire, String dam,
			//	String birthLocation, String localId, String name, String subSpecies, String zoo,
			//String city, String state, String event){
			

	
}
/*
public void Giraffe2(int giraffeId, String sex, String birthDate, String sire, String dam,
String birthLocation, String localId, String name, String subSpecies, String zoo,
String city, String state, String event)
*/