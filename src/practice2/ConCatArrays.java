package practice2;

import java.util.Arrays;

public class ConCatArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {8, 6, 5};
        System.out.println(Arrays.toString(concat(arr1,arr2)));
    }

    public static int[] concat(int[] arr1,int[]arr2){
          int [] newArr = new int[arr1.length+ arr2.length];
              int index = 0;
          for(int each: arr1){
              newArr[index++]=each;
          }
          for(int each : arr2){
              newArr[index++]=each;
          }return newArr;
    }
}
