package doublyLinkedList;
public class Node {
	int id;
	String name;
	Node next;
	Node prev;

	public Node(int id, String name, Node next, Node prev) {
		this.id = id;
		this.name = name;
		this.next = next;
		this.prev = prev;
	}

	public void displayANode(){
		System.out.println("id: " + id + " name:" + name );
	}

	@Override
	public String toString(){   // Required
		return "" + id + " " + name;
	}

}

