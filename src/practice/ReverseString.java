package practice;

public class ReverseString {

    public static String reverse(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        return revStr;
    }

    public static void main(String[] args) {
        String str = "dream";
        System.out.println(reverse(str));

    }
}