import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswordTest {

    @Test
    void PasswordIsValidTest() {
        Password pass = new Password();
        boolean a = pass.PasswordIsValid("Phikjkjkjkjkjkkj");
        assertTrue(a);
    }

    @Test
    void PasswordIsOkTest() {
        Password pass = new Password();
        boolean a = pass.PasswordIsOk("Phikjkjkjkjkjkkj");
        assertTrue(a);
    }

}