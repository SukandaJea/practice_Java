package cover;

public class Arrays {

    /**
     * Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
     * <p>
     * <p>
     * firstLast6([1, 2, 6]) → true
     * firstLast6([6, 1, 2, 3]) → true
     * firstLast6([13, 6, 1, 2, 3]) → false
     */
    public static boolean firstLast6(int[] nums) {

        int[] newArr = new int[nums.length];

        boolean isFirstLast = false;

        int index = 0;


        for (int each : nums) {
            // index=0;
            newArr[index++] = each;
            if (newArr[0]== 6 || newArr[2]==6) {
                isFirstLast = true;

                }else {

                isFirstLast = false;
                }
            }
            return isFirstLast;
        }

    public static void main (String[]args){
        int[] nums = {1, 2, 6};

        System.out.println(Arrays.firstLast6(nums));
    }
}
