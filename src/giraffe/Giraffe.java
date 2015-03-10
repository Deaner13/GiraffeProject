package giraffe;

//import java.util.Scanner;

class Giraffe {

	private String birthLocation, sire, dam, subSpecies, zoo, city, state, event, name,
			localId;
	private int birthdate, giraffeId;
	private char sex;
	
	public String setBirthLocation(String location) {
		this.birthLocation = location;

		return ("Birth Location set to: " + location);
	}

	public String setSire(String sire) {
		this.sire = sire;

		return ("Sire set to: " + sire);
	}
	
	/*
	private int giraffeId;
	private char sex;
	private String birthDate;
	private String sire;
	private String dam;
	private String birthLocation;
	private String localId;
	private String name;
	private String subspecies;
	private String currentZoo;
	private String city;
	private String state;
	private String event;
	
	public void setId(int gId){
		giraffeId = gId;
	}
	
	public void setSex(char gSex){
		sex = gSex;
	}
	
	public void setBirth(String gBday){
		birthDate = gBday;
	}
	
	public void setSire(String gSire){
		sire = gSire;
	}
	
	public void setDam(String gDam){
		dam = gDam;
	}
	
	public void setBirthLocation(String gBirthLoc){
		birthLocation = gBirthLoc;
	}
	
	public void setLocalId(String gLocalId){
		localId = gLocalId;
	}
	
	public void setName(String gName){
		name = gName;
	}
	
	public void setSpecies(String gSpecies){
		subspecies = gSpecies;
	}
	
	public void setZoo(String gZoo){
		currentZoo = gZoo;
	}
	
	public void setCity(String gCity){
		city = gCity;
	}
	
	public void setState(String gState){
		state = gState;
	}
	
	public void setEvent(String gEvent){
		event = gEvent;
	}
	
	public void getInfo(String infoRequest){
		if (infoRequest == "id"){
			System.out.println(giraffeId);
		}
		else if (infoRequest == "sex"){
			System.out.println(sex);
		}
		else if (infoRequest == "birthdate"){
			System.out.println(birthDate);
		}
		else if (infoRequest == "sire"){
			System.out.println(sire);
		}

	}
	
	public void printInfo(){
		System.out.printf(giraffeId + " " + sex + " " + birthDate + " " + sire + " " + dam + " " + birthLocation + " " +
				localId + " " + name + " " + subspecies + " " + currentZoo + " " + city + " " + state + " " + event +"\n");
	}
	*/

}
