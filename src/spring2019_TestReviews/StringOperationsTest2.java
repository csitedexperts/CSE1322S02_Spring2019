package spring2019_TestReviews;

public class StringOperationsTest2 {

	public static void main(String[] args) {
		
	String oop = "I like Object-Oriented Programming";
	
	System.out.println();
	
	System.out.println(oop.substring(7, 14));

	String s = "Object Orientation";
	s = s + s.length();
	System.out.println(s);
	String river ="Mississippi River";
	System.out.println(river.substring(0, 6));

	System.out.println(river.substring(2, river.length() - 3));
	System.out.println(river.substring(2));

	}
}
