package StoreOwnerUI;

import GeneralUI.Home;
import GeneralUI.StoresForm;
import PaymentControl.User;
import ProductControl.Store;

import java.util.Scanner;

public class HomeStoreOwner extends Home {
	public HomeStoreOwner(User current){
		super(current);
		initializeForm();
	}

	public void suggestBrands() {

	}

	public void viewStatistics() {

	}



	public void marketProduct() {

	}

	@Override
	public void initializeForm() {
		makeForm();
	}

	private void makeForm() {
		while (true) {
			System.out.println("Welcome " + currentUser.getName() + " ^-^");
			System.out.println("Please, Choose the operation you want to do");
			System.out.println("1- My Stores Functions ");
			System.out.println("2-Explore Products in store");
			System.out.println("3-Suggest Product");
			System.out.println("4-log out");
			Scanner input = new Scanner(System.in);
			int numberOfOperation = input.nextInt();
			if (numberOfOperation == 1) {
				StoresForm storesForm = new StoresForm(currentUser);
				storesForm.initializeForm();
			} else if (numberOfOperation == 2) {
				System.out.println("please,Enter name of the store you want to explore: ");
				String storeName = input.next();
				Store store = Store.getStore(storeName);
				searchStoreProducts(currentUser, store);
			} else if (numberOfOperation == 3) {
				suggestProducts();
			}else if(numberOfOperation == 4){
				break;
			}
		}
	}
}
