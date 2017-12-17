package GeneralUI;

import PaymentControl.User;
import ProductControl.Product;
import ProductControl.ProductInventoryControl;
import ProductControl.Store;
import ProductControl.productControl;

import java.util.Scanner;

public class SelectProductForm extends Form {

	private Store selectedStore;

	public SelectProductForm(User current) {
		super(current);
	}

	public void makeForm(Product[] products) {
		System.out.println("Please Enter number of product you want to add to your store :D");
		for(int i=0;i<products.length;i++){
			System.out.println("number: "+i+" "+products[i]);
		}
		Scanner cin =new Scanner(System.in);
		int numberOfProduct=cin.nextInt();
		System.out.println("Please Enter the pricr of this product in your store");
		cin =new Scanner(System.in);
		int price=cin.nextInt();
		submitProduct(products[numberOfProduct],price);
	}

	public void submitProduct(Product product, int price) {
		ProductInventoryControl ProductInventorycontrol=new ProductInventoryControl();
		ProductInventorycontrol.addProductInventory(product,selectedStore,price);
	}
	public void initializeForm(){

		productControl productControl=new productControl();
		productControl.getProductsforStore(selectedStore);

	}

	public void setStore(Store store) {
		selectedStore=store;
	}

}
