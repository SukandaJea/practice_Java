package PracticeWithYana;

public class Palindrome {
    public static boolean isPalin(String str){
        boolean isPalind = false;
        String reverse = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
                reverse+= str.charAt(i);


        }

        if(str.equals(reverse)){
            isPalind = true;
        }
        return isPalind;
    }

    public static void main(String[] args) {
        String str = "raceca";
        System.out.println(isPalin(str));
    }
}
