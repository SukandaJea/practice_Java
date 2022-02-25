package practice2;

public class Palin {
    /**
     * "racecar"
     */

   public static Boolean palins(String str){
       boolean isPalin = false;
       String reverse = "";

       for (int i = str.length()-1; i >= 0 ; i--) {
           reverse+= str.charAt(i);


       }
       if(str.equals(reverse)){
           isPalin = true;
       }
       return isPalin;

   }

    public static void main(String[] args) {
        String revStr = "raceca";
        System.out.println(palins(revStr));

    }


}
