package giraffe;

public class HW3_Carlo {

	public static void main(String[] args) {
		
		Giraffe giraffe1 = new Giraffe();
		giraffe1.setId(2193);
		giraffe1.setSex('m');
		giraffe1.setBirth("10-12-1954");
		giraffe1.setBirthLocation("Colorado Springs");
		giraffe1.setCity("Denver");
		giraffe1.setDam("Mercedes");
		giraffe1.setSire("Diamond");

		Giraffe giraffe2 = new Giraffe();
		giraffe2.setId(2155);
		giraffe2.setSex('f');

		giraffe1.printInfo();
		giraffe2.printInfo();

	}

}
