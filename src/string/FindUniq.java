package string;

public class FindUniq {

    /*

write a return method that can find the unique characters from the String
Ex: unique ("AAABBBCCCDEF") ->"DEF";
 */

    public static String unique(String str){
         String expResult = "";

        for (int i = 0; i <str.length() ; i++) {
            int count = 0;

            for (int j = 0; j < str.length() ; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                }
            } if(count == 1){
                    expResult+= str.charAt(i);
                }

            }return expResult;


            }

    public static void main(String[] args) {
        String str = "AAABBCCDEF";
        System.out.println(unique(str));
    }










}
