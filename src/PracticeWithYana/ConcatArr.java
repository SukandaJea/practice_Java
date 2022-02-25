package PracticeWithYana;

import java.util.Arrays;

public class ConcatArr {

    public static int[] concatArr(int[] arr1,int[]arr2){
        int[] newArr = new int[arr1.length+ arr2.length];
        int index = 0;

        for (int each : arr1){
            newArr[index++] = each;
        }
        for(int each : arr2){
            newArr[index++] = each;
        }return newArr;
    }

    public static void main(String[] args) {
        int[]arr1 = {1,2,3};
        int[]arr2 = {8,6,5};
        System.out.println(Arrays.toString(concatArr(arr1,arr2)));
    }
}
