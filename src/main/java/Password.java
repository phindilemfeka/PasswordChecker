
    import java.util.Scanner;
    public class Password {

        public boolean passwordIsValid(String password) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter password: ");
            password = input.nextLine();
            boolean hasDigit = false;
            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean length =false;
            boolean exist = true;
            boolean special_character=false;
            for (int i = 0; i < password.length(); i++) {
                if (password.isBlank()) {
                    exist=false;
                }else {
                    System.out.println("Password should exist.");
                }
                if (password.length() >8 || password.length()==8) {
                    length=true;
                }else {
                    System.out.println("Password should be at least 8 characters long.");
                }
                char Password = password.charAt(i);
                if (Character.isDigit(Password)) {
                    hasDigit = true;
                }else {
                    System.out.println("Password should have at least one number.");
                }
                if (Character.isUpperCase(Password)) {
                    hasUppercase = true;
                }else {
                    System.out.println("Password should have at least one uppercase letter.");
                }
                if (Character.isLowerCase(Password)) {
                    hasLowercase = true;
                }else {
                    System.out.println("Password should have at least one lowercase letter.");
                }
                if (!Character.isLetter(Password)&!Character.isDigit(Password)){
                    special_character = true;
                }else {
                    System.out.println("Password should have at least one special character.");
                }
                if (hasDigit & hasLowercase & hasUppercase & exist& length & special_character) {
                    System.out.println("correct, you've met all the conditions required.");
                    return true;
                }
            }
            System.out.println("Incorrect, you did not meet one or more of the required conditions.");
            return false;
        }
        public boolean PasswordIsOk(){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter password: ");
            String password = scan.nextLine();
            boolean length = false;
            boolean exist = true;
            for (int j = 0; j< password.length(); j++){
                if (password.length()>8 || password.length()==8){
                    length = true;
                }
                else if (password.isBlank()){
                    exist = false;
                }
                if (length & exist){
                    System.out.println("correct, you've met at least 3 required conditions.");
                    return true;
                }
            }
            System.out.println("You need to meet at least three conditions with conditions 1 & 2 included.");
            return false;
        }
    }



