package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Power {

    /**
     * ArrayList with numbers write a method that return squires of each element in a ascending order {
     */
    public static ArrayList<Integer> squires (ArrayList<Integer>arr){

        ArrayList<Integer> newSquires = new ArrayList<>();

        for(int each : arr){
            newSquires.add(each*each);
        }
        Collections.sort(newSquires);
        return newSquires;
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr1 = new ArrayList<>(Arrays.asList(3,5,4));
        System.out.println(squires(arr1));
    }
}
