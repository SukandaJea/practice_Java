package PracticeWithYana;

public class Unique {
         /*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */
public  static  String Uniq(String str){
    String nonDup = "";

    for (int i = 0; i < str.length(); i++) {
        int count =0;
        for (int j = 0; j < str.length() ; j++) {
            if(str.charAt(i) == str.charAt(j)){
                count++;
            }


        }if(count==1){
            nonDup+= str.charAt(i);
        }

    }return nonDup;
}

    public static void main(String[] args) {
        String str= "AAABBBBCDDDEF";
        System.out.println(Uniq(str));
    }
}