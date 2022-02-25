package practice;


    public class Frequency {
        public static void main(String[] args) {

            String str = "AAABBCDD";

            System.out.println(frequencyStr(str));
        }

        public static String frequencyStr(String str){

            String newStr = "";


            for (int i = 0; i < str.length(); i++) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if(str.charAt(i) == str.charAt(j)){
                        count++;
                    }
                }

                if(!newStr.contains("" + str.charAt(i))){
                    newStr += "" + str.charAt(i) + count;
                }
            }

            return newStr;
        }
}
