package PracticeWithYana;

import java.util.Arrays;

public class Same {

    /**
     * return method check if String built out of same letter of another string
     */

    public static boolean sameLetter(String str1,String str2){

        boolean same = false;

        char[]arr1 = str1.toCharArray();
        char[]arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            same = true;
        }
        return same;
    }

    public static void main(String[] args) {
        String str1 ="abc";
        String str2 = "cat";
        System.out.println(sameLetter(str1,str2));
    }
}
