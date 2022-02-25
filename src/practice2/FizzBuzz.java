package practice2;

public class FizzBuzz {

    public static String fizzBuzz(int num){

          String newStr ="";

          if(num %3== 0){
              newStr+="fizz";
          }if(num %5 == 0){
              newStr+="buzz";

        }
          return newStr.isEmpty()?""+ num:newStr;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(9));
    }
}
