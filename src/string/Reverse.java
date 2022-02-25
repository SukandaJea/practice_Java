package string;

public class Reverse {

 public static String stringReverse(String str){

  String reverse = "";

  for (int i = str.length()-1; i >=0 ; i--) {

     reverse += str.toCharArray()[i];



  }
  return reverse;
 }

 public static void main(String[] args) {
  System.out.println(stringReverse("ABCD"));
 }
}
/*
Write a return method that can reverse String
Ex: Reverse ("ABCD"); ==> DCBA
 */