package string;

import java.util.Arrays;
import java.util.Collections;

public class FindTheUnique {

    //Solution 1:
//
//    public static String unique(String str){
//        String [] arr = str.split("");
//        String unique1 = "";
//
//        for(int j = 0; j< arr.length; j++){
//            int num = 0;
//
//            for (int i = 0; i < arr.length ; i++) {
//                if(arr[i].equals(arr[j]))
//                    num++;
//
//            }
//            if(num == 1)
//                unique1 += arr[j];
//        }
//
//        return unique1;
//    }

    public static void main(String[] args) {

        String result1 = Unique("AAABBBCCCDEF");

        System.out.println(result1);

    }
        public static String Unique (String str){
            String result1 = "";

            for (String each : str.split(""))
                result1 += ((Collections.frequency(Arrays.asList(str.split("")), each)) == 1) ? each : "";

            return result1;
        }



    }

/*

write a return method that can find the unique characters from the String
Ex: unique ("AAABBBCCCDEF") ->"DEF";
 */
