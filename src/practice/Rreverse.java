package practice;

public class Rreverse {
    // reverseStr("apple")  -> elppa
    // reverseStr("John")   -> nhoJ
    // reverseStr("phone")  -> enohp
    // reverseStr("123456") -> "654321"

    public static String reverseWord(String str){
        // create variable to store reversed version of str
        String revWord = "";

      // iterate over input string from the back with charAt
        for (int i = str.length()-1; i >= 0 ; i--) {
                 revWord += str.charAt(i);

        }
        return revWord;
    }

    public static void main(String[] args) {
        String newStr = "phone";
        System.out.println(reverseWord(newStr));
    }
}
