package learning;

public class NewString {
	public String newString;
	
	public String moreStrings(String template, int a){
		newString = (template + a);
		System.out.println(newString);
		return newString;
	}
}
