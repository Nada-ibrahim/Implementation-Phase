package StoreOwnerUI;

import PaymentControl.User;
import ProductControl.Product;
import GeneralUI.Form;
import ProductControl.Store;
import ProductControl.StoreControl;
import javafx.util.Pair;

import java.util.List;
import java.util.Scanner;

public class ViewStatisticsForm extends Form {
	private Store store;

	public ViewStatisticsForm(User user, Store store){
		super(user);
		this.store = store;
	}

	public void addProductStatistics(Product product, int ordersNo) {

	}

	public void addMax(String Products, String Brands) {

	}

	public void makeForm(List<Pair<String, Integer>> productStat, List<Pair<String, Integer>> maxProducts) {
		System.out.println("Number of views to each product in a store:-");
		for(int i = 0; i < productStat.size(); ++i){
			System.out.println(productStat.get(i).getKey() + ": " + productStat.get(i).getValue());
		}
		System.out.println("The most viewed product in a store ");
		for(int i = 0; i < maxProducts.size(); ++i){
			System.out.println("("+ (i+1) +")" + maxProducts.get(i).getKey() + ": " + maxProducts.get(i).getValue());
		}
		System.out.println("Press any Character to return to main Page");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}

	public void initializeForm(){
		StoreControl statControl = new StoreControl();
		statControl.viewStatistics(this, store);
	}

}
