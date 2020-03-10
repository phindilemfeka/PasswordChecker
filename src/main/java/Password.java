public class Password
{
    //Methods for all the conditions that must be met for password to be considered as valid.
    boolean PasswordExist(String password)
    {
        return password.length() !=0;
    }

    boolean PasswordLength (String password)
    {
        return password.length() > 8;
    }

    boolean PasswordHasLowercase (String password)
    {
        for (int i =1; i <=password.length()-1; i++)
        {
            if (Character.isLowerCase(password.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }

    boolean PasswordHasUppercase (String password)
    {
        boolean result = false;
        for (int i = 0; i < password.length(); i++)
        {
            if (Character.isUpperCase(password.charAt(i)))
            {
                result = true;
            }
        }
        return result;
    }

    boolean PasswordHasDigit (String password)
    {
        for (int i = 0; i < password.length(); i++)
        {
            if (Character.isDigit(password.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }

    boolean PasswordHasSpecialCharacter (String password)
    {
        for (int i = 0; i < password.length(); i++)
        {
            if (!Character.isLetterOrDigit(password.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }

    //Method checking if all the conditions are met using the above methods
   public boolean PasswordIsValid(String password)
   {

        if (!PasswordExist(password))
        {
            System.out.println("Password should exist");
        }
        if (!PasswordLength(password))
        {
            System.out.println("Password should be longer than 8 characters");
        }
        if (!PasswordHasLowercase(password))
        {
            System.out.println("Password should contain at least 1 lowercase letter");
        }
        if (!PasswordHasUppercase(password))
        {
            System.out.println("Password should contain at least 1 uppercase letter");
        }
        if (!PasswordHasDigit(password))
        {
            System.out.println("Password should contain at least one digit");
        }
        if (!PasswordHasSpecialCharacter(password)) {
            System.out.println("Password should contain at least one special character");
        }
       return false;
   }
    //Method PasswordIsOk is only satisfied(returns true) if at least conditions are met with conditions 1&2 included
    //i.e (password exist and password is longer than 8 characters)
    public boolean PasswordIsOk(String password)
    {
        int counter = 0;

        if (PasswordExist(password))
        {
            counter++;
        }
        if (PasswordLength(password))
        {
            counter++;
        }
        if (PasswordHasLowercase(password))
        {
            counter++;
        }
        if (PasswordHasUppercase(password))
        {
            counter++;
        }
        if (PasswordHasDigit(password))
        {
            counter++;
        }
        if (PasswordHasSpecialCharacter(password))
        {
            counter++;
        }
        if (!PasswordLength(password))
        {
            System.out.println("Password is not ok");
;           return false;
        }
            //If password length is longer than 8, then it means password exist and password definitely contains
            // uppercase,uppercase,digits or special characters(at least 3 conditions met)
            System.out.println("Password is ok ");
            return counter > 3 || counter == 3;

    }

}




