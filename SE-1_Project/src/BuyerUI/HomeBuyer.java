package BuyerUI;

import GeneralUI.Home;
import PaymentControl.User;
import ProductControl.Store;

import java.util.Scanner;

public class HomeBuyer extends Home {
	public HomeBuyer(User currentUser){
		super(currentUser);
	}
	@Override
	public void initializeForm() {
		makeForm();
	}

	public void exploreProduct() {

	}

	public void searchProduct() {

	}
	public void makeForm()
	{
		while (true) {
			System.out.println("Welcome " + currentUser.getName() + " ^-^ ");
			System.out.println("1-Explore Products in store");
			System.out.println("2-Suggest Product");
			System.out.println("3-log out");
			Scanner input = new Scanner(System.in);
			int numberOfOperation = input.nextInt();
			if (numberOfOperation == 1) {
				System.out.println("please,Enter name of the store you want to explore: ");
				String storeName = input.next();
				Store store = Store.getStore(storeName);
				searchStoreProducts(currentUser, store);
			} else if (numberOfOperation == 2) {
				suggestProducts();
			} else if (numberOfOperation == 3) {
				break;
			}
		}
	}

}
