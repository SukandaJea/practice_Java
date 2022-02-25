package practice2;

public class FreqOfChar {
    /**
     * "AABBBCCDDD"
     */

    public static String numOfChar(String str){

        String nums = "";

        for (int i = 0; i < str.length() ; i++) {
            int count = 0;
            for (int j = 0; j < str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }


            }
            if(!nums.contains(""+str.charAt(i))){
                nums+=""+str.charAt(i) +count;
            }

        }return nums;

    }

    public static void main(String[] args) {
        String str = "AABBBCCDDD";
        System.out.println(numOfChar(str));
    }
}
