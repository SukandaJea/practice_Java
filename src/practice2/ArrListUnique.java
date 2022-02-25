package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrListUnique {
    /**
     * Create method that accept an ArrayList and return an ArrayList of only unique values
     **/

    public static ArrayList<Integer> getUniqueValues(ArrayList<Integer>arr){

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer each : arr) {
            int count = Collections.frequency(arr,each);
            if (count == 1) {
                unique.add(each);

            }

        }return unique;




    }

    public static void main(String[] args) {
        ArrayList<Integer> uniqueArr = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,5,6));
    }
}
/**
 * String methods for arrays
 * toCharArray(): Converts a String to a char array where every element
 * is every character from the String
 * split(): Breaks apart a String by the given separating String and
 * returns the parts as separating elements in a String array
 *
 * Arrays.toString(array): Allows us to print the array by converting
 * it to a String format
 * Ex: int [] num = {1,2,3};
 * Arrays.toString(num) -> [1, 2, 3]
 *
 * Arrays.sort(array):
 * will sort the array elements to be in ascending order (
 * smallest to largest )
 *
 * what about for a String array?
 * lexicographically -> in ascending order
 * related to ascii values
 * special chars, numbers, uppercase(A-Z)
 * , lowercase(a-z)
 * Go the other way
 * Arrays.sort(nums,
 * Collections.reverseOrder()); // collections don't work with primitives
 * Arrays.equals(arr1, arr2);
 * Ex: int [] a = { 1, 2, 3};
 * int [] b = { 1, 2, 3};
 * Arrays.equals(a, b) -> true
 * a == b
 *
 */