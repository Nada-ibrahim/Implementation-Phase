package GeneralUI;

import PaymentControl.User;
import ProductControl.Product;
import ProductControl.ProductInventoryControl;
import ProductControl.Store;
import ProductControl.productControl;

import java.util.Scanner;

public class SelectProductForm extends Form {

	private Store selectedStore;

	public SelectProductForm(User current, Store store) {
		super(current);
		selectedStore = store;
	}

	public void makeForm(Product[] products) {
		for (int i = 0; i < products.length; i++) {
			System.out.println("number: " + (i + 1) + " " + products[i]);
		}
		int numberOfProduct;
		while (true) {
			System.out.println("Please Enter number of product you want to add to your store :D");
			Scanner cin = new Scanner(System.in);
			numberOfProduct = cin.nextInt();
			if (numberOfProduct < products.length) {
				break;
			}
		}
		while (true) {
			System.out.println("Please Enter the price of this product in your store");
			Scanner cin = new Scanner(System.in);
			int price = cin.nextInt();
			if(submitProduct(products[numberOfProduct - 1], price)){
				break;
			}
		}
	}

	public boolean submitProduct(Product product, int price) {
		ProductInventoryControl ProductInventorycontrol=new ProductInventoryControl();
		return ProductInventorycontrol.addProductInventory(product,selectedStore,price);
	}
	public void initializeForm(){
		productControl productControl=new productControl();
		Product[] products = productControl.getProductsforStore(selectedStore);
		makeForm(products);
	}

	public void setStore(Store store) {
		selectedStore=store;
	}

}
