package PracticeWithYana;

import java.util.Arrays;

public class ConcatArrays {

    public static int[] concatArrays(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        int index = 0;

        for (int each : arr1) {
            newArr[index++] = each;

        }

        for (int each : arr2) {
            newArr[index++] = each;
        }return newArr;
    }

    public static void main(String[] args) {
        int []arr1= {2,3,4};
        int [] arr2 ={99,5,6} ;
        System.out.println(Arrays.toString(concatArrays(arr1,arr2)));
    }
}
