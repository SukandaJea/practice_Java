package string;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetters {
//
//    public static  boolean  same(String str1,String str2){
//
//        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
//        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
//        return str1.equals(str2);


    public static boolean sameLetters(String a, String b) {
        if (a == null) {
            return b == null;
        } else if (b == null) {
            return false;
        }
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(sameLetters("abc", "cab")); // true
        System.out.println(sameLetters("abc", "abb")); // false

    }
    }




/*
write a return method that check if a string is build out of the same letters as another string .

Ex: same("abc","cab") ->true
    same("abc","abb") ->false
 */