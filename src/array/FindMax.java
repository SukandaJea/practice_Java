package array;

public class FindMax {

    public static int max(int[]n){
        int max = Integer.MIN_VALUE;

      for(int each : n){
          if(each > max){
              max = each;
          }

        }return max;
    }

    public static void main(String[] args) {
        int[]arr = {3,5,8};
        System.out.println(max(arr));
    }
}
