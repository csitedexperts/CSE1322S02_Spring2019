package queueImplementation;

class Node {
	int id;
	String name;
	Node next; 

	public Node(int id, String name){
		this.id = id;
		this.name = name;
	}

	public void displayANode(){
		System.out.println("id: " + id + " name:" + name );
	}

	@Override
	public String toString(){   // Required
		return name + " : " + id ;
	}

}  // End of the Node class

class Queue {

	Node top;
	Node tail;

	Queue(){   // Optional 
		top = null;  // null initialization
		tail = null;  // null initialization
		// Here to show the head and tail always start as null
	}

	public boolean isEmpty() {
		return (top == null);
	}

	public void peek() {
		if(isEmpty())
			System.out.println("There is nothing to peek");
		else {
			System.out.println("The top node's id is : " + top.id);
		}
	}

	
	public void enQueue(int id, String name) {
		Node node = new Node(id, name);
		if (tail == null) { // If the queue is empty
			top = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}		
	}

	public void deQueue() {
		if (top == null) {
			tail = null;
			System.out.println("There is no node to delete" );
			return;
		} else {
			int id = top.id;
			String name = top.name;
			System.out.println("The node with Id: " + id + " and Name: "+ name + "  is deleted " );
			top = top.next;
		}
	}


	public void displayAllNodes(){

		Node thisNode = top;

		while(thisNode != null){
			thisNode.displayANode();
			System.out.println("Next Node: " + thisNode.next);
			thisNode = thisNode.next;
			System.out.println();
		}

	}

}  // end of the Queue Class


public class QueueImplementationExplained {

	public static void main(String[] args) {

		System.out.println("Queue Implementation Explained ....... ");

		Queue myq = new Queue();

		myq.enQueue(1, "AA");
		System.out.println("myq.top = " + myq.top);
		System.out.println("myq.tail = " + myq.tail);

		System.out.println("myq.top.next = " + myq.top.next);
		System.out.println("myq.tail.next = " + myq.tail.next);
		System.out.println("----------------------------");
		
		myq.enQueue(2, "BB");

		System.out.println("myq.top = " + myq.top);
		System.out.println("myq.tail = " + myq.tail);

		System.out.println("myq.top.next = " + myq.top.next);
		System.out.println("myq.tail.next = " + myq.tail.next);

		myq.enQueue(3, "CC");
		myq.enQueue(4, "DD");
		myq.enQueue(5, "EE");


		myq.displayAllNodes();

		myq.peek();

		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();
		myq.deQueue();

		myq.displayAllNodes();

	}

}
