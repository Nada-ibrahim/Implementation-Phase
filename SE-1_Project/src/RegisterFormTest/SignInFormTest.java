package RegisterFormTest;

import GeneralUI.RegisterForm;
import GeneralUI.SignInForm;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class SignInFormTest {
   // @Test
    SignInForm submit=new SignInForm(null);
    @DataProvider(name="signInFormTest")

    public static Object[][] signingIn()
    {
        return new Object[][]{{false,"aya","123"},
                {false,"nada","345"},
                {true,"Rawan@gmail.com","123"},
                {false,"rawan@gmail.com","13"}};
    }
    @org.testng.annotations.Test(dataProvider = "signInFormTest")
    public void testSubmitUser(boolean result,String name,String password) throws Exception {

        Assert.assertEquals(result,submit.submitUser(name,password));
    }
    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {
        RegisterForm rFormTest = new RegisterForm(null);
        rFormTest.submitUser("rawan@gmail.com", "123", "rawan", "Buyer");
    }
}