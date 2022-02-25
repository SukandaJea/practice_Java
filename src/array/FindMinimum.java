package array;

public class FindMinimum {

  public static int findMin(int [] n){
      int min = Integer.MAX_VALUE;

      for(int each : n){
          if(each < min){
              min = each;
          }
      }return min;
  }

    public static void main(String[] args) {
        int []arr ={10,6,11};
        System.out.println(findMin(arr));
    }
}
/*
write a method that can find the minimum number from an int Array

 */