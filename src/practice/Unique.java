package practice;

public class Unique {

      /*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static String unique(String str){
        String uniqueStr = "";


        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    counter++;
                }
            }

            if(counter == 1){
                uniqueStr += str.charAt(i);
            }
        }
        return uniqueStr;
    }

    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";

        System.out.println(unique(str));
    }
}
