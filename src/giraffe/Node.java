package giraffe;

public class Node {
	Giraffe value;
	Node next;
	
	public Node(Giraffe newData, Node nextRef){
		value = newData;
		next = nextRef;
	}
}
