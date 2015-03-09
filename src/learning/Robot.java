package learning;

public class Robot {	
	private String name;
	private int code;
	//Constructor
	public Robot(){
		
	//Constructors run whenever a new object is created
		System.out.println("Contructor running!");
		
		name = "Arnie";
		
		System.out.println(name);
	}
	
	public Robot(String newName){
		//Call to other constructors within Class at beginning
		//of constructor using THIS.
		this("bill", 10000);
		
		name = newName;
		
		System.out.println(name);
	}
	
	public Robot(String name, int code){
		this.name = name;
		this.code = code;
		
		System.out.println(name);
		System.out.println(code);
	}
	
	

}
