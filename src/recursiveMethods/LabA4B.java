package recursiveMethods;
public class LabA4B {

	public static String recursiveNSConversion(int number, int base) {
		if(number>0) {
			int temp = (number % base);
			if(temp >9) {
				char ans = (char)(64 +(temp-9));
				return (recursiveNSConversion(number/base, base)+ ans);
			}
			else 
				return (recursiveNSConversion(number/base, base)+ temp);
		}
		return "";
	}



	public static void main(String[] args) {
		int number = 39, base = 20;
		
		System.out.println("The number " + number + " in base " + base + " is : " + recursiveNSConversion(number, base));
		
	}

}
