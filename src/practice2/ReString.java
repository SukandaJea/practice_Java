package practice2;

public class ReString {

   public static String revStr(String str){
       String newStr = "";

       for (int i = str.length()-1; i >= 0 ; i--) {
            newStr+= str.charAt(i);

       }return newStr;
   }

    public static void main(String[] args) {
        String rev = "sweet";
        System.out.println(revStr(rev));
    }
    }

