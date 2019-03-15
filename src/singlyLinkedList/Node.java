package singlyLinkedList;
public class Node {
	int id;
	String name;
	Node next; 
	// Reference to next link made in the LinkList
	// Holds the reference to the Link that was created before it
	// Set to null until it is connected to other links
	
	public Node(int id, String name){
		this.id = id;
		this.name = name;
		
	}

	public void displayANode(){
		System.out.println("id: " + id + " name:" + name );
	}

	@Override
	public String toString(){   // Required
//		return "" + id ;
//		return name;
//		return  name + "  " + id ;
		return "" + id + "  " + name;
		
	}

	/*	public Node getNext() { return next; 	}  */
	/*public void setNext(Node next) { this.next = next; } */


}
