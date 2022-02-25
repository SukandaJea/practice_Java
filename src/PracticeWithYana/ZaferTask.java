package PracticeWithYana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ZaferTask {
    /**
     * ArrayList with numbers write a method that return squires of each element in a ascending order {
     */

    public static ArrayList <Integer> squires(ArrayList<Integer>arr){
        ArrayList<Integer> newArr = new ArrayList<>();//(arr.size());

         for(Integer each : arr){
                  newArr.add(each*each);
        }
        Collections.sort(newArr);
         return newArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<> (Arrays.asList(11,7,3));
        System.out.println(squires(number));
    }
}
