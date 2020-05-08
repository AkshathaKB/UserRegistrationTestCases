import com.bridgelabz.UserValidator;
import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName( "Akshatha");
        Assert.assertEquals(true, result);

    }
    @Test
    public void givenLastName_WhenNotProper_shouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("akshatha");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenProper_SholudReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Banakar");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("bana");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("akshatha.123@gmail.com.in");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("Akshatha@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("919876543212");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("11234975660");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("abcxy123");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("abc1");
        Assert.assertEquals(true,result);
    }
}











