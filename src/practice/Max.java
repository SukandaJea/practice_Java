package practice;

public class Max {

    public static int findMax(int[]n){
        int max = Integer.MIN_VALUE;

        for(int each: n){
            if(each>max){
                max=each;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[]arr = {6,4,7};
        System.out.println(findMax(arr));
    }
}
