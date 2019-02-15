package stringOperations;

public class StringReverseInPlaceEx1 {
    public static void main(String[] args) {
        String a = "INFORMATION";
        System.out.println(reverse(a)); //NOITAMROFNI
    }

    private static String reverse(String a) {
           char[] ca = a.toCharArray();
           int start = 0 ; int end = a.length()-1;
           while(end > start) {
               swap(ca,start,end);
               start++;
               end--;
           }//while

        return new String(ca);
    }

    private static void swap(char[] ca, int start, int end) {
        char t = ca[start];
        ca[start] = ca[end];
        ca[end] = t ;
        }
}