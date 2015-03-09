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
}
