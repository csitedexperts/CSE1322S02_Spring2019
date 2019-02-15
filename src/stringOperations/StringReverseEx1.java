package stringOperations;

public class StringReverseEx1 {
	public static void main(String[] args) {
		String a = "I love Programming";
		System.out.println(reverseSting(a)); 
	}

	static String reverseSting(String inputString) {
		// return new StringBuilder(inputString).reverse().toString();

		char[] inputStringArray = inputString.toCharArray();
		String reverseString = "";
		for (int i = inputStringArray.length - 1; i >= 0; i--) {
			reverseString += inputStringArray[i];
		}
		return reverseString;
	}
}
