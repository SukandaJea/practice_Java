package array;

import java.util.ArrayList;

public class SortDescending {

    public static void main(String[] args) {

    }
    int[]arr = {8,9,10,7,6};
     int temp = 0;
    public static int[] sortDescending(int[] a){

        ArrayList<Integer> list = new ArrayList<Integer>();

         for (int each:a)
             list.add(each);


        for (int i = 0; i < a.length ; i++) {
//            a[i] = findMax(list);
            list.remove(Integer.valueOf(a[i]));

            }
        return a;
        }

        public static int findMax(ArrayList<Integer>a){
        int max = Integer.MIN_VALUE;
        for(int each: a)
            max = Math.max(max,each);
        return max;
    }

}
/*
write a return method that can sort an int array in descending order without using the sort method of the Arrays class
 */

/**
 * Sort Array in Descending Order
 * The Descending order arranges the elements in the highest to lowest order.
 * We can perform sorting in the following ways:
 * -Using the reverseOrder()Method
 * -Without using the method
 *  = Using the for loop
 *  = Using the User Defined Method
 *
 *  Using the reverseOrder()
 *
 *  Java Collections class provides the reverseOrder() method to sort the array in reverse-lexicographic order.
 *  It is a static method, so we can invoke it directly by using the class name. It does not parse any parameter.
 *  It returns a comparator that imposes the reverse of the natural ordering (ascending order)
 *
 *  Syntax:
 *  public static <T>Comparator <T> reverseOrder()
 *
 *  Arrays.sort(a,Collections.reverseOrder());
 *  a point to be noticed that we have defined an array as Integer. Because the reverseOrder()method does not work for the primitive data type.
 *
 *Ex:
 *import java.util.Arrays;
 * import java.util.Collections;
 * public class SortArrayExample4
 * {
 * public static void main(String[] args)
 * {
 * Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
 * // sorts array[] in descending order
 * Arrays.sort(array, Collections.reverseOrder());
 * System.out.println("Array elements in descending order: " +Arrays.toString(array));
 * }
 * }
 * Output:
 *
 * Array elements in descending order: [205, 110, 102, 78, 23, 11, 6, 4, 0, -1, -9]
 *=============================================================================================
 *
 * Without Using the Method
 * Using the for Loop
 * In the following example, we have initialized an integer array and perform sorting in descending order.
 *
 * SortArrayExample6.java
 *
 * public class SortArrayExample6
 * {
 * public static void main(String[] args)
 * {
 * int temp;
 * //initializing an array
 * int a[]={12,5,56,-2,32,2,-26,9,43,94,-78};
 * for (int i = 0; i < a.length; i++)
 * {
 * for (int j = i + 1; j < a.length; j++)
 * {
 * if (a[i] < a[j])
 * {
 * temp = a[i];
 * a[i] = a[j];
 * a[j] = temp;
 * }
 * }
 * }
 * System.out.println("Array elements in descending order:");
 * //accessing element of the array
 * for (int i = 0; i <=a.length - 1; i++)
 * {
 * System.out.println(a[i]);
 * }
 * }
 * }
 * Output:
 *
 * Array elements in descending order:
 * 94
 * 56
 * 43
 * 32
 * 12
 * 9
 * 5
 * 2
 * -2
 * -26
 * -78
 * ==============================================================================================================
 */