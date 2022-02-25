package practice;

public class RemoveDuplicates {
    public static String removeDuplicates(String str){
        String withoutDuplicates = "";

        for (int i = 0; i < str.length(); i++) {
            if(!withoutDuplicates.contains("" + str.charAt(i))){
                withoutDuplicates +=  str.charAt(i);
            }
        }

        return withoutDuplicates;
    }

    public static void main(String[] args) {
        String str = "ABBCCCD";
        System.out.println(removeDuplicates(str));
    }
}
