package learning;

public class ToString {
	
	private String name;
	private int id;
	
	public ToString(int id, String name) {
		this.name = name;
		this.id = id;
	}
	
	public String toString(){
	/*	StringBuilder sb = new StringBuilder();
		
		sb.append(id).append(name);
		
		return sb.toString();
	}
	*/
		return String.format("%10d : %s", id, name);
	}
	

}
