package giraffe;

public class LinkedList {
	
	private Node start;
	private int errorReturn;
	
	public LinkedList(){


	start = null;
	
	}
	public LinkedList(int errorValue){
		start = null;
		errorReturn = errorValue;

	}
	
	public boolean isEmpty(){
		return (start == null);
	}
	
	public void InsertRight(Giraffe data){
		Node currNode;
		
		if (start == null){
			start = new Node(data,start);
		}
		else{
			currNode = start;
			while (currNode.next != null){
				currNode = currNode.next;
			}
			currNode.next = new Node (data, null);
		}
	}
	
	public int Size(){
		int length = 0;
		Node currNode = start;
		
		while(currNode != null){
			length++;
			currNode = currNode.next;
		}

		return length;
	}
	
	public void Display(){
		Node currNode = start;
		System.out.println("List contents: ");
		
		while (currNode != null){
			System.out.println(" " + currNode.value);
			currNode = currNode.next;
		}
		
		System.out.println("--------------------------");
		}
}
