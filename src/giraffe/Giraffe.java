package giraffe;

//import java.util.Scanner;

class Giraffe {

	protected String birthLocation, sire, dam, subSpecies, zoo, city, state, event, name,
			localId, birthDate, sex;
	protected int giraffeId;
	
	public void setId(String gId){
		giraffeId = Integer.parseInt(gId);
	}
	
	public void setSex(String gSex){
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
		subSpecies = gSpecies;
	}
	
	public void setZoo(String gZoo){
		zoo = gZoo;
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
	
	public void printInfo(){
		System.out.printf(giraffeId + " " + sex + " " + birthDate + " " + sire + " " + dam + " " + birthLocation + " " +
				localId + " " + name + " " + subSpecies + " " + zoo + " " + city + " " + state + " " + event +"\n");
	}
	
	public void getInfo(int infoRequest){
		if (infoRequest == 1){
			System.out.println(giraffeId);
		}
		else if (infoRequest == 2){
			System.out.println(sex);
		}
		else if (infoRequest == 3){
			System.out.println(birthDate);
		}
		else if (infoRequest == 4){
			System.out.println(sire);
		}
		else if (infoRequest == 5){
			System.out.println(dam);
		}
		else if (infoRequest == 6){
			System.out.println(birthLocation);
		}
		else if (infoRequest == 7){
			System.out.println(localId);
		}
		else if (infoRequest == 8){
			System.out.println(name);
		}
		else if (infoRequest == 9){
			System.out.println(subSpecies);
		}
		else if (infoRequest == 10){
			System.out.println(zoo);
		}
		else if (infoRequest == 11){
			System.out.println(city);
		}
		else if (infoRequest == 12){
			System.out.println(state);
		}
		else if (infoRequest == 13){
			System.out.println(event);
		}
		else if (infoRequest == 14){
			printInfo();
		}
		else{
			System.out.println("Please make a valid selection");
		}
	}
}
