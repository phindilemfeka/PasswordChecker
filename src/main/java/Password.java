import java.util.*;
public class Password {


    boolean PasswordExist(String password) {
        return password.length() >= 1;
    }

    boolean PasswordLength (String password) {
        return password.length() >8;
    }

    boolean PasswordHasLowercase (String password) {
        for (int i =1; i <=password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    boolean PasswordHasUppercase (String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    boolean PasswordHasDigit (String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    boolean PasswordHasSpecialCharacter (String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

   public void PasswordIsValid() {
       System.out.println("Enter password.");
       Scanner sc = new Scanner(System.in);
       String password = sc.nextLine();

        if (!PasswordExist(password)) {
            System.out.println(" Password should exist");
        }
        if (!PasswordLength(password)) {
            System.out.println("Password should be longer than 8 characters");
        }
        if (!PasswordHasLowercase(password)) {
            System.out.println("Password should contain at least 1 lowercase letter");
        }
        if (!PasswordHasUppercase(password)) {
            System.out.println("Password should contain at least 1 uppercase letter");
        }
        if (!PasswordHasDigit(password)) {
            System.out.println("Password should contain at least one digit");
        }
        if (!PasswordHasSpecialCharacter(password)) {
            System.out.println("Password should contain at least one special character");
        }
    }

    public boolean PasswordIsOk(String password) {
        int counter = 0;

        if (PasswordExist(password)) {
            counter++;
        }
        if (PasswordLength(password)) {
            counter++;
        }
        if (PasswordHasLowercase(password)) {
            counter++;
        }
        if (PasswordHasUppercase(password)) {
            counter++;
        }
        if (PasswordHasDigit(password)) {
            counter++;
        }
        if (PasswordHasSpecialCharacter(password)) {
            counter++;
        }

        if (!(PasswordLength(password) && PasswordLength(password))) {
            System.err.println("Password is never accepted if at least 3 conditions are not met.");
        }

        return counter >= 3;
    }



}