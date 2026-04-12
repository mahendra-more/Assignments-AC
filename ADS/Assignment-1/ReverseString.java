public class ReverseString {
    public static String reverseString(String s) {
        if (s == null || s.length() <= 1) {
            return s; 
        }
        return reverseString(s.substring(1)) + s.charAt(0); 
    }

    public static void main(String[] args) {
        System.out.println("Reverse of 'hello': " + reverseString("hello"));
    }
}
