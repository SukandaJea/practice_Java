package array;

import java.util.ArrayList;

//public class SortAscending {


    //    public static int[] Sort(int[] a) {
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//
//        for (int each : a)
//
//            list.add(each);
//
//
//        for (int i = 0; i < a.length; i++) {
//
//            a[i] = findMin(list);
//
//            list.remove(Integer.valueOf(a[i]));
//
//        }
//
//        return a;
//
//    }
//
//    public static int findMin(ArrayList<Integer> a) {
//
//        int min = Integer.MAX_VALUE;
//
//        for (int each : a)
//
//            min = Math.min(min, each);
//
//        return min;
//
//    }
//}
//
//    public static void main(String[] args) {
//     int[] arr = new int[]{10, 9, 7, 11, 8};
//        System.out.println(ascending(arr));
//    }



//    // Solution 2:
//    public static int ascending(int[] arr) {
//
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int each : arr) {
//            list.add(each);
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if (list.get(i) < list.get(j)) {
//                    Integer temp = list.get(i);
//                    list.set(i, list.get(j));
//                    list.set(j, temp);
//                }
//            }
//            for (i = 0; i < list.size(); i++) {
//                arr[i] = list.get(i);
//            }
//
//            // }return ascending(int)
//        }
//    }






 // solution 3: but not complete
//    public static int[] sort(int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//
//                int temp = 0;
//                if (arr[i] > arr[j]) {
//
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//
//                }
//            }
//            return ;
//        }







/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class

Ex:

            int[] arr = {10, 9, 8, 7};

             arr = Sort(arr);         ==>{ 7, 8, 9, 10};


 */

/**
 * Sort Array in Ascending Order
 *
 * The Ascending Order arranges the elements in the lowest to highest order.
 * we can perform sorting in the following ways:
 * -Using the sort()method
 * -Without using the method
 *   = Using the for loop
 *   =Using the User Defined Method
 *
 * Ex: Using the Sort()method
 * In Java,Arrays is the class defined in the java.util package that provides sort()method  to sort an array
 * in ascending order. It uses Dual-Pivot Quicksort algorithm for sorting. Its complexity is O(n log(n)).
 * It is a static method that parses an array as a parameter and does not return anything. we can invoke(call) it
 * directly using the class name. It accepts an array of type int, float, double, long, char, byte.
 *
 * Syntax:
 * public static void sort(int[] a) // where a is an array to be sort
 *
 * Note:Like the Arrays class . the Collections class also provides the sort() method to sort the array.
 * But there is a difference between them. The sort() method of the Arrays class works for primitive type
 * while the sort() method of the Collections class works for objects Collections, such as linkedList, Arraylist,etc.
 *
 *
 * Let's sort an array using the sort() method of the Arrays class.
 *
 * In the following program, we have defined an array of type integer. After that, we have invoked the sort() method of the Arrays class and parses the array to be sort. For printing the sorted array, we have used for loop.
 *
 * SortArrayExample1.java
 *
 * import java.util.Arrays;
 * public class SortArrayExample1
 * {
 * public static void main(String[] args)
 * {
 * //defining an array of integer type
 * int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
 * //invoking sort() method of the Arrays class
 * Arrays.sort(array);
 * System.out.println("Elements of array sorted in ascending order: ");
 * //prints array using the for loop
 * for (int i = 0; i < array.length; i++)
 * {
 * System.out.println(array[i]);
 * }
 * }
 * }
 *
 * Output:
 * Array elements in ascending order:
 * 5
 * 12
 * 22
 * 23
 * 34
 * 67
 * 90
 * 109
 *
 * In the above program, we can also use the toSting() method of the Arrays class to print the array, as shown in the following statement. It returns a string representation of the specified array.
 *
 * System.out.printf(Arrays.toString(array));
 *
 * ===========================================================================================================================
 *
 * Without Using the Method
 * Using the for Loop
 * In the following example, we have initialized an array of integer type and sort the array in ascending order.
 *
 *
 * SortArrayExample2.java
 *
 * public class SortArrayExample2
 * {
 * public static void main(String[] args)
 * {
 * //creating an instance of an array
 * int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
 * System.out.println("Array elements after sorting:");
 * //sorting logic
 * for (int i = 0; i < arr.length; i++){
 * for (int j = i + 1; j < arr.length; j++){
 * int tmp = 0;
 * if (arr[i] > arr[j]){
 * tmp = arr[i];
 * arr[i] = arr[j];
 * arr[j] = tmp;
 * }
 * }
 * //prints the sorted element of the array
 * System.out.println(arr[i]);
 * }
 * }
 * }
 * Output:
 *
 * Array elements after sorting:
 * -65
 * -4
 * -1
 * 1
 * 3
 * 6
 * 20
 * 34
 * 34
 * 55
 * 78
 * 90
 *
 */