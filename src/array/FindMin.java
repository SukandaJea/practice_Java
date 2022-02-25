package array;

public class FindMin {

    public static int Min(int[]n){

        int min = Integer.MAX_VALUE;

        for(int each : n){
            if(each < min){
                min = each;
            }
        }return min;
    }

    public static void main(String[] args) {
        int[]arr = {5,6,4};
        System.out.println(Min(arr));
    }
}
