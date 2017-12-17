package RegisterFormTest;

import GeneralUI.RegisterForm;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class RegisterFormTest {
    RegisterForm rFormTest = new RegisterForm(null);

    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {
    }

    @DataProvider(name="rFormTest")
    public static Object[][] registering(){
        return new Object[][]{{true, "Nada@gmail.com", "123", "Nada", "Buyer"},
                {false, "Nada@gmail.com", "234", "Nada", "Buyer"},
                {true, "Rawan@gmail.com", "123", "Nada", "Buyer"},
                {false, "rawan@gmail.com", "123", "Nada", "Buyer"}};
    }

    @org.testng.annotations.Test(dataProvider = "rFormTest")
    public void testSubmitUser(boolean result, String email, String password, String name, String type) throws Exception {
        Assert.assertEquals(result, rFormTest.submitUser(email, password, name, type));
    }
}