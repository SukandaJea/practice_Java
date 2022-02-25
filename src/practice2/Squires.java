package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Squires {

    /**
     * ArrayList with numbers write a method that return squires of each element in a ascending order {
     */

    public static ArrayList<Integer> squireOfElem(ArrayList<Integer> arr){

        ArrayList<Integer> newArr = new ArrayList<>();


             for (Integer each :arr){
                   newArr.add(each*each);
             }
        Collections.sort(newArr);
             return newArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<>(Arrays.asList(5,3,4));
        System.out.println(squireOfElem(numbers));
    }
}
