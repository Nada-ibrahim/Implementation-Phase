package BuyerUI;

import GeneralUI.Form;
import GeneralUI.Home;
import PaymentControl.User;
import ProductControl.Store;

import java.util.Scanner;

public class HomeBuyer extends Form {
	public HomeBuyer(User currentUser){
		super(currentUser);
	}
	@Override
	public void initializeForm() {

	}

	public void exploreProduct() {

	}

	public void searchProduct() {

	}
	public void makeForm()
	{
		System.out.println("Welcome ^-^ ");
		System.out.println("please,Enter name of the store::");
		Scanner input=new Scanner(System.in);
		String store=input.next();
		Store Astore=new Store(store);
        Home home=new Home(currentUser);
        home.searchStoreProducts(currentUser,Astore);

	}

}
