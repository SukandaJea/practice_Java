package practice2;

import java.util.Arrays;

public class TwoArrays {

    public static int[] concatArrays(int[]arr1,int[]arr2){
        int[]newArr = new int[arr1.length+ arr2.length];
        int index = 0;

        for(int each: arr1){
            newArr[index++]=each;
        }
        for(int each: arr2){
            newArr[index++]=each;
        }return newArr;

    }

    public static void main(String[] args) {
        int[]arr1= {3,4,5};
        int[]arr2 ={9,8,7};
        System.out.println(Arrays.toString(concatArrays(arr1,arr2)));
    }

}
