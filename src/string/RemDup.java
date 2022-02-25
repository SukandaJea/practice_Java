package string;

public class RemDup {

    public static String removeDu(String str){
         String nonDup = "";

        for (int i = 0; i < str.length(); i++) {
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+= str.charAt(i);
            }

        }return nonDup;
    }

    public static void main(String[] args) {
        String str = "AABBBCCD";

        System.out.println(removeDu(str));
    }
}
