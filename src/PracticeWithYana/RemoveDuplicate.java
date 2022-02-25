package PracticeWithYana;

public class RemoveDuplicate {
    /**
     * "ABBCCCD" -> "ABCD"
     */

    public static String remove(String str){
        String nonDup = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)== str.charAt(j)){
                    count++;
                }


            }
            if(count== 1){
                nonDup+=str.charAt(i);
            }
        }return nonDup;
    }

    public static void main(String[] args) {
        String str = "AABBCCDEF";
        System.out.println(remove(str));
    }
}