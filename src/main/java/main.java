public class main {
    public static void main(String[] args) {
        Password password_object = new Password();
        String password = "";
        password_object.PasswordIsValid(password);
        System.out.println(password_object.PasswordIsOk(password));
    }
}
