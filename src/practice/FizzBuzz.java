package practice;

public class FizzBuzz {
    public static String fizzBuzz(int num){
        String str ="";


    if(num%3 == 0){
            str+= "Fizz";
        }if(num%5== 0){
            str+="Buzz";

        }
         return  str.isEmpty()?""+ num: str;
        }
    public static void main(String[] args) {
        int num = 15;
        System.out.println(fizzBuzz(num));
    }



    }


/**
 *
 public static String fizzBuzz(int num) {

 String str = "";

 if(num % 3 == 0){
 str += "Fizz";
 }
 if(num %5 == 0){
 str+= "Buzz";
 }
 return str.isEmpty()? "" + num : str;
 }
 public static void main(String[]args){
 System.out.println(fizzBuzz(15));
 }
 }
 public static void main(String[] args) {

 Scanner input = new Scanner(System.in);

 System.out.println("Enter a number");


 int number = input.nextInt();

 String message = "";


 if(number % 3 == 0 && number % 5 == 0){
 // System.out.println("FizzBus");
 message = "FizzBus";
 }else if (number % 3 == 0){
 //System.out.println("Fizz");
 message = "Fizz";
 }else if(number % 5 == 0){
 //System.out.println("Buzz");
 message = "Buzz";
 }

 System.out.println(message);




 */