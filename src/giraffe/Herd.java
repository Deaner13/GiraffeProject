package giraffe;

import java.util.ArrayList;


public class Herd extends LinkedList{
	private Node start;
	public Herd(){
		
		
	}
	
	public Herd Add(ArrayList<Giraffe> giraffes){
		Herd herd = new Herd();
		
		for (int i = 0; i < giraffes.size(); i++){
			Giraffe giraffe = giraffes.get(i);
			herd.InsertRight(giraffe);
		}
		
		return herd;
		
	}
	
	public void Find(int idNumber){
		Node currNode = start;
		while(currNode != null){
		
		}
	}
	
	public void Display(){
		Node currNode = start;
		System.out.println("Herd contents: ");
		
		while (currNode != null){
			System.out.println(" " + currNode.value);
			currNode = currNode.next;
		}
		
		System.out.println("--------------------------");
		}
	
}
