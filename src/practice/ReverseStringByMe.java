package practice;

public class ReverseStringByMe {

    public static String reverseStr(String str){

        String revStr = "";
        for (int i = str.length()-1; i>= 0 ; i--) {
            revStr+=str.charAt(i);

        }
        return revStr;
    }

    public static void main(String[] args) {
        String str = "mar";
        System.out.println(reverseStr(str));
    }
}
