package GeneralUI;

import PaymentControl.User;
import PaymentControl.UserControl;
import sun.security.util.Password;

import java.util.Scanner;

public class RegisterForm extends Form {
    public RegisterForm(User currentUser) {
        super(currentUser);
    }

    public void makeForm() {
        Scanner input = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Enter your mail :");
            String Email = input.nextLine();
            System.out.println("Enter your name :");
            String name = input.nextLine();
            System.out.println("Enter your password :");
            String password = input.nextLine();
            String types[] = {"Buyer", "Store Owner", "Premium Store Owner"};
            System.out.println("Choose the account type :");
            System.out.println("1- Buyer \n2- Store owner \n3-premium store owner");
            n = input.nextInt();
            while (true) {
                if (n == 1 || n == 2 || n == 3)
                    break;
                else
                    System.out.println("Enter a valid number");
            }
            String type = types[n - 1];
            if(submitUser(Email, password, name, type)){
                break;
            }
        }

    }

	public boolean submitUser(String Email, String password, String name, String type) {
        UserControl uControl = new UserControl();
		return uControl.addUser(Email,password,name,type);


	}
	public void initializeForm(){
        makeForm();
    }

}
