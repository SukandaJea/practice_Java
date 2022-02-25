package practice;

import java.util.Arrays;

public class SameLetterByMe {

    /*
    Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:
     */

    public static Boolean sameLet(String str1, String str2){
        boolean same = false;
        char[] arr1 = str1.toCharArray();
        char[]arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            same = true;
        }
        return same;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println(sameLet(str1,str2));
    }
}
