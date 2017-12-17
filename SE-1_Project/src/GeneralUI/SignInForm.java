package GeneralUI;

import PaymentControl.User;
import PaymentControl.UserControl;

import java.util.Scanner;

public class SignInForm extends Form {
    public SignInForm(User current){
        super(current);
    }
    public void initializeForm() {
        makeForm();
    }

    private void makeForm() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your mail :");
            String name = input.nextLine();
            System.out.println("Enter your password :");
            String password = input.nextLine();
            if (submitUser(name, password)){
                break;
            }
        }
    }

    public boolean submitUser(String name, String password) {
        UserControl uControl = new UserControl();
        return uControl.logUserIn(name, password);
    }
}
