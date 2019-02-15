package stringOperations;

public class StringReverseInPlaceEx2 {

	public static void main(String[] args) {
	    String a = "INFORMATION";
	    System.out.println(StringReverseInPlace(a)); //NOITAMROFNI
	 } 

	public static String StringReverseInPlace(String toReverse) {
		char[] chars = toReverse.toCharArray();
		int inputStringLength = toReverse.length();
		for (int i = 0; i < inputStringLength / 2; i++) {
			int toMoveBack = toReverse.charAt(i);
			int toMoveForward = toReverse.charAt(inputStringLength - i - 1);
			//swap
			toMoveForward = toMoveBack - toMoveForward;
			toMoveBack -= toMoveForward;
			toMoveForward += toMoveBack;
			chars[i] = (char) toMoveBack;
			chars[inputStringLength - i - 1] = (char) toMoveForward;
		}
		return String.valueOf(chars);
	}

}