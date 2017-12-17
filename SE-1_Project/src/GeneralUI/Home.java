package GeneralUI;

import PaymentControl.User;
import ProductControl.Store;
import StoreOwnerUI.SuggestProductForm;

import java.util.Scanner;

public class Home extends Form {
	public Home(User currentUser) {
		super(currentUser);
	}

    public Home() {

    }

    public void signin() {
		SignInForm signForm = new SignInForm(null);
		signForm.initializeForm();
	}

	public void register() {
		RegisterForm rForm = new RegisterForm(null);
		rForm.initializeForm();

	}
	public void initializeForm(){
		makeForm();
    }

	private void makeForm() {
		System.out.println("Welcome to \"Try it\"");
		A: while (true) {
			System.out.println("please, Choose an option:-");
			System.out.println("1- Register");
			System.out.println("2- log in");
			System.out.println("3- Exit");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			switch (n){
				case 1:
					register();
					break ;
				case 2:
					signin();
					break ;
				case 3:
					break A;

			}
			try {
				Runtime.getRuntime().exec("cls");
			}
			catch (final Exception e) { }
		}


	}

	public void searchStoreProducts(User user,Store store){
		exploreProductInStoreForm exploreForm=new exploreProductInStoreForm(user,store);
		exploreForm.initializeForm();

	}
	public void suggestProducts() {
		SuggestProductForm SuggestProductForm=new SuggestProductForm (currentUser);
		SuggestProductForm.initializeForm();
	}

}
