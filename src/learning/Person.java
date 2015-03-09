package learning;

class Person {
	
	String name, city, state;
	int age, weight;
	double height;
	
	//Methods are subroutines within a class
	
	void getAge(int age){
		
		this.age = age;
		
	}
	
	//Using THIS allows use of same variable name instead of:
	/*
	 * void getAge(int newAge){
	 * age = newAge;
	 * }
	*/
	
	void getName(String name){
		
		this.name = name;
		
	}
	
	/*
	void speak(String text) {
		
		System.out.println("You entered: " + text);
		
	}
	
	public void jump(int height){
		System.out.println("Jumping THIIIS High: " + height + " feet");
	}
	
	void move(String direction, double distance){
		System.out.println("Moving " + distance + " feet " + direction);
	}
	
		int calcRetire(){
		int yearsLeft = 65 - age;
		
		return yearsLeft;
		//System.out.println(yearsLeft);
	}
	*/
}
