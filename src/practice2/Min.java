package practice2;

public class Min {

    public static int findMin(int[]n){

        int min = Integer.MAX_VALUE;

        for(int each : n){
            if(each<min){
                min = each;
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int[]arr = {8,5,10};
        System.out.println(findMin(arr));
    }
}
