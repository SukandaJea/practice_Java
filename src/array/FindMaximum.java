package array;

public class FindMaximum {

   public static int findMax(int[] arr){
       int max= Integer.MIN_VALUE;

       for (int each : arr){
           if(each > max){
               max = each;
           }
       }return max;
   }

    public static void main(String[] args) {
        int[]a1 = {7,5,10};
        System.out.println(findMax(a1));
    }
}
/*
write a method that can find the maximum number from an int Array
 */
