package PracticeWithYana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListUnique {
    /**
     * Create method that accept an ArrayList and return an ArrayList of only unique values
     **/


    //             return type         method name       parameters
    public static ArrayList<Integer> getUniqueElements(ArrayList<Integer>list){

        ArrayList<Integer> unique  = new ArrayList<>();

        for(int each : list){

            int count =  Collections.frequency(list,each);

            if(count == 1){
                // unique element
                unique.add(each);
            }
        }
        return unique;
    }
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,4,1,5,1,1,3,6,10));
        System.out.println(getUniqueElements(list));
    }
}

