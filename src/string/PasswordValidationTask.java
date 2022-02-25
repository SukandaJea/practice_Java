package string;

public class PasswordValidationTask {

    public static boolean passwordValidate(String password){

        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChars = "(.*[-/,:-@].*)";

      boolean hasLower = password.matches(lowercase),
              hasUpper = password.matches(uppercase),
              hasDigits = password.matches(numbers),
              hasSpecial = password.matches(specialChars),
              valid = false;

      if(password.length()>= 6 && !password.contains(" "))
          if(hasUpper && hasLower &&hasSpecial && hasDigits);

          valid =true;

return valid;
        }




  public static void main(String[] args) {
        PasswordValidationTask passwordValidationTask = new PasswordValidationTask();
        System.out.println();
    }

    }

/*

1. Write a return method that can verify if a password is valid or not.

requirements:

 1. Password MUST be at least have 6 characters and should not contain space

2. PassWord should at least contain one upper case letter

3. PassWord should at least contain one lowercase letter

4. Password should at least contain one special characters

5. Password should at least contain a digit



if all requirements above are met, the method returns true, otherwise returns  false
 */