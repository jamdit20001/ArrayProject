package useArray;

import java.util.LinkedList;

public class UseLinkedList {

	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("NY");
		list.addFirst("FL");
		list.addLast("AZ");
		
		for(String state:list){
			System.out.println(state);
		}
		

	}

}
