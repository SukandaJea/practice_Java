package PracticeWithYana;

public class Frequency {
    /**
     * "ABBBCCDD"
     */

  public static String freq(String str){
      String numOfCha="";

      for (int i = 0; i <str.length() ; i++) {
          int count = 0;
          for (int j = 0; j <str.length() ; j++) {
              if(str.charAt(i)==str.charAt(j)){
                  count++;
              }

          }if(!numOfCha.contains(""+str.charAt(i))){
              numOfCha+= ""+str.charAt(i)+count;
          }

      }return numOfCha;
  }

    public static void main(String[] args) {
        String str = "AABBBCCDDD";
        System.out.println(freq(str));
    }
}