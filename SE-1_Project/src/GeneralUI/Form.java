package GeneralUI;

import PaymentControl.User;
import java.util.Collection;
import java.util.Scanner;


abstract public class Form {

	protected User currentUser;

	private Collection<User> user;
	public Form(User current){
	    currentUser = current;
    }

    public static void viewSuccessMessage() {
		System.out.println("Operation is successful");
		System.out.println("Press any button to continue");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		try {
			Runtime.getRuntime().exec("cls");
		}
		catch (final Exception e) { }
	}

	public static void viewErrorMessage() {
		System.out.println("Operation Failed");
		System.out.println("Press any button to return");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		try {
			Runtime.getRuntime().exec("cls");
		}
		catch (final Exception e) { }
	}

	public void initializeForm(){


    }

}
