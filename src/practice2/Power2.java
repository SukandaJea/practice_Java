package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Power2 {

    /**
     * ArrayList with numbers write a method that return squires of each element in a ascending order {
     */

    public static ArrayList<Integer> squires(ArrayList<Integer> arr){

                 ArrayList<Integer> newArr = new ArrayList<>();


        for (Integer each : arr) {
              newArr.add(each*each);


        }
      Collections.sort(newArr);
        return newArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr1 = new ArrayList<>(Arrays.asList(6,3,5));
        System.out.println(squires(arr1));

        }
    }

