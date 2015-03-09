package learning;

public class Static {
	public String name;
	
	public int id;
	
	//constant values denoted by final
	public final static int LUCKY_NUMBER = 7;
	
	//Static variables are not changed throughout class
	//also known as class variables
	public static String description;
	
	public static int count = 0;
	
	public Static(){
		id = id + count;
		count++;
		System.out.println("Count is now: " + count);
	}
	
	public void showName(){
		System.out.println(description + " : " + name + id);
	}
	
	public static void showInfo(){
		
		System.out.println(description);
		
	}
}
