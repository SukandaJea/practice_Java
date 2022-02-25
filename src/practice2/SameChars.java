package practice2;

import java.util.Arrays;

public class SameChars {
    /**
     * return method check if String built out of same letter of another string
     */

    public static Boolean sameLetter(String str1,String str2){
        Boolean isSame = false;

        char[]arr1 = str1.toCharArray();
        char[]arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

           if(Arrays.equals(arr1,arr2)) {
               isSame = true;
        }
           return isSame;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println(sameLetter(str1,str2));
    }
}
