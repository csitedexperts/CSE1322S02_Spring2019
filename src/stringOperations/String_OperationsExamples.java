package stringOperations;

public class String_OperationsExamples {
	public static void main(String[] args) {
		String s ="Agent";  // Agent 5
		s = s + s.length(); 
		System.out.println(s);
		String river ="Mississippi";

		System.out.println(river.substring(1, 2)); // [1, 1]
		System.out.println(river.substring(2, river.length() - 3));
		System.out.println(river.substring(1));
		System.out.println(river.substring(1,river.length()));
		//System.out.println(river.substring(4, 1)); // [4, 1]
	}
}
