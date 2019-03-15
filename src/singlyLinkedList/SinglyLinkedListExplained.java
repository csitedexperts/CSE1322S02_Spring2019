package singlyLinkedList;

// Singly Linked List


class LinkedList{
	// Reference to head in list
	// The last Link added to the LinkedList
	Node head; 

	LinkedList(){   // Optional 
		head = null;  // null initialization
		// Here to show the head always starts as null
	}
	
// LinkedList ln = new LinkedList();
	
	// Returns true if LinkList is empty

	
	public boolean isEmpty(){
/*		if (head == null) return true;
		else return false;
*/
		return(head == null);

	}


	public void displayAllNodes(){

		Node theNode = head;

		// Start at the reference stored in head and
		// keep getting the references stored in next for
		// every Link until next returns null

		while(theNode != null){

			theNode.displayANode();

			System.out.println("Next Link: " + theNode.next);

			theNode = theNode.next;

			System.out.println();

		}

	}

	public void append(int id, String name){
		if (head == null) {
			head = new Node(id, name);
			return; 
		}
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = new Node(id, name);
	}

	public void prepend(int id, String name){
		if (head == null) { 
			head = new Node(id, name);
			return; 
		}
		Node newHead = new Node(id, name);
		// Connects the head field to the newHead 
		newHead.next = head;
		//		newHead.setNext(head);  // If you use setter
		head = newHead;
	}

	

	public Node removeFirst(){

		Node deleteLink = head;

		if(!isEmpty()){

			// Removes the Link from the List

			head = head.next;

		} else {

			System.out.println("Empty LinkedList");

		}

		return deleteLink;

	}


	public Node removeById(int id){

		Node currentLink = head;
		Node previousLink = head;

		// Keep searching as long as a match isn't made

		while(currentLink.id != id){

			// Check if at the last Link in the LinkedList

			if(currentLink.next == null){

				// id not found so leave the method

				return null; 

			} else {

				// We checked here so let's look in the
				// next Link on the list

				previousLink = currentLink; 

				currentLink = currentLink.next;

			}

		}

		if(currentLink == head){

			// If you are here that means there was a match
			// in the reference stored in head in the
			// LinkedList so just assign next to head

			head = head.next;

		} else {

			// If you are here there was a match in a Link other 
			// than the head. Assign the value of next for
			// the Link you want to delete to the Link that's 
			// next previously pointed to the reference to remove

			System.out.println("FOUND A MATCH");
			System.out.println("currentLink: " + currentLink);
			System.out.println("head: " + head);
			previousLink.next = currentLink.next; 

			//			previousLink.setNext(currentLink.next);  // If use getter and setter

		}

		return currentLink;

	}


	public Node removeByName(String name){
		Node currentNode = head;
		Node previousNode = head;

		// Keep searching as long as a match isn't made

		while(currentNode.name != name){
			// Check if at the last Link in the LinkedList

			if(currentNode.next == null){

				// Name not found so leave the method
				return null; 

			} else {

				// We checked here so let's look in the
				// next Link on the list

				previousNode = currentNode; 

				currentNode = currentNode.next;

			}

		}

		if(currentNode == head){

			// If you are here that means there was a match
			// in the reference stored in head in the
			// LinkedList so just assign next to head

			head = head.next;

		} else {

			// than the head. Assign the value of next for
			// the node you want to delete to the node that's 
			// next previously pointed to the reference to remove

			System.out.println("Name found:");
			System.out.println("currentNode: " + currentNode);
			System.out.println("head: " + head);
			previousNode.next = currentNode.next; 

			//			previousNode.setNext(currentNode.next);  // If use getter and setter

		}

		return currentNode;

	}


	public Node findById(String id){

		Node theNode = head;

		if(!isEmpty()){

			while(theNode.name != id){

				// Checks if at the end of the LinkedList

				if(theNode.next == null){

					// Got to the end of the Links in LinkedList
					// without finding a match

					return null;

				} else {

					// Found a matching Link in the LinkedList

					theNode = theNode.next;

				}

			}

		} else {

			System.out.println("Empty LinkedList");

		}

		return theNode;

	}


	public Node findByName(String name){

		Node theLink = head;

		if(!isEmpty()){

			while(theLink.name != name){

				// Checks if at the end of the LinkedList

				if(theLink.next == null){

					// Got to the end of the Links in LinkedList
					// without finding a match

					return null;

				} else {

					// Found a matching Link in the LinkedList

					theLink = theLink.next;

				}

			}

		} else {

			System.out.println("Empty LinkedList");

		}

		return theLink;

	}

}


public class SinglyLinkedListExplained {


	public static void main(String[] args) {

/*
		Node n1 = new Node(1, "n1");
		Node n2 = new Node(2, "n2");
		Node n3 = new Node(3, "n3");
		Node n4 = new Node(4, "n4");
		Node n5 = new Node(5, "n5");
		Node n6 = new Node(6, "n6");

		n1.displayANode();
		n2.displayANode();
		n3.displayANode();
		n4.displayANode();
		n5.displayANode();
		n6.displayANode();
		
		System.out.println("n1.next :" + n1.next) ;
		System.out.println("n2.next :" + n2.next) ;
		System.out.println("n3.next :" + n3.next) ;
		System.out.println("n4.next :" + n4.next) ;
		System.out.println("n5.next :" + n5.next) ;
		System.out.println("n6.next :" + n6.next) ;

		System.out.println("\n= ==  After liking the nodes = = = =  = \n" ) ;

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = null;

		System.out.println("n1.next :" + n1.next) ;
		System.out.println("n2.next :" + n2.next) ;
		System.out.println("n3.next :" + n3.next) ;
		System.out.println("n4.next :" + n4.next) ;
		System.out.println("n5.next :" + n5.next) ;
		System.out.println("n6.next :" + n6.next) ;


		System.out.println("++++++++++++++++++++++++++");
		n1.next.displayANode();
		
		n2.displayANode();
		n3.displayANode();
		n4.displayANode();
		n5.displayANode();
		n6.displayANode();

		System.out.println("++++++++++++++++++++++++++");
*/
		
		System.out.println("===========================");


		LinkedList theLinkedList = new LinkedList();
		
		theLinkedList.append(101, "Michael");
		theLinkedList.prepend(102, "Sasah");
		theLinkedList.append(103, "Braxton");
		theLinkedList.append(104, "Lee");
		theLinkedList.prepend(105, "Mokter");
//  105 > 102 > 101 > 103  > 104 
		theLinkedList.displayAllNodes();

/*		// Insert Link and add a reference to the name Link added just prior
		// to the field next
		theLinkedList.prepend(0, "O");

		theLinkedList.append(1, "A");
		theLinkedList.prepend(2, "B");
		theLinkedList.append(3, "C");
		theLinkedList.prepend(4, "D");
		theLinkedList.append(5, "E");

		theLinkedList.displayAllNodes();

		System.out.println("Value of first in LinkedList " + theLinkedList.head + "\n");

		// Removes the last Link entered

		theLinkedList.removeFirst();

		theLinkedList.displayAllNodes();

		System.out.println(theLinkedList.findByName("C").name + " Was Found");

		//		theLinkedList.removeByName("B");
		theLinkedList.removeById(2);
		System.out.println("\nB Removed\n");

		theLinkedList.displayAllNodes();*/

	}

}
