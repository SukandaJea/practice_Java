package practice;

public class RemoveDuplicateByMe {

    // "ABBCCCD";

    public static String removeDup(String str){
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if(! nonDup.contains(""+str.charAt(i))){
                nonDup += str.charAt(i);
            }

        }return nonDup;
    }

    public static void main(String[] args) {
        String str = "ABBCCCD";
        System.out.println(removeDup(str));
    }
}
