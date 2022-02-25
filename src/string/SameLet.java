package string;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLet {
     /*
    Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:

    Without sort


     */

    public static boolean Same(String str1, String str2) {

        str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( );

        str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );

        return  str1.equals(str2);

    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cba";
        System.out.println(Same(str1,str2));
    }
}