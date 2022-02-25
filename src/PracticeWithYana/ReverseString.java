package PracticeWithYana;

public class ReverseString {

  public static String reverseStr(String str){
      String rvs = "";

      for (int i = str.length()-1; i >= 0 ; i--) {
          rvs+= str.charAt(i);

      }
      return rvs;
  }

    public static void main(String[] args) {
        String str = "dream";
        System.out.println(reverseStr(str));
    }
}