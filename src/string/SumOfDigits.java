package string;

public class SumOfDigits {


    /**
     * TODO:
     * Take a String
     * Convert it into array of characters
     * Apply for loop till length of char array
     * Using iSDigit()method we can check the digit in String
     * if idDigit() will return true then print that index value
     * That digit is in char form. We will convert it into String then Integer
     * Using total variable .we will sum(total0 it
     *
     */


    public static int sumOfDigits(String s){

         s = "abcd345";

        char[] ch = s.toCharArray();

        int total = 0;

        for(char each : ch){
            if(Character.isDigit(each)){
                total += Integer.valueOf(""+each);
            }
        }return total;
    }

    public static void main(String[] args) {

        System.out.println(sumOfDigits("s"));
    }

    }



/*

write a method that can return the sum of the digits in a string
 */
