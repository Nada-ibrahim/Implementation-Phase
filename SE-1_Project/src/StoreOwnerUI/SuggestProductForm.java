package StoreOwnerUI;

import GeneralUI.Form;
import PaymentControl.User;
import ProductControl.Brand;
import ProductControl.Category;
import ProductControl.productControl;

import java.util.Scanner;

public class SuggestProductForm extends Form {

	public SuggestProductForm(User current) {
		super(current);
	}
	public void initializeForm(){
		String [] categories=Category.getCategories();
		Brand[] brands = Brand.getBrands(false);
		makeForm(brands,categories);
	}
	public void makeForm(Brand[] brands, String[] categories) {
		System.out.println("Please write the name of the suggested product");
		Scanner cin=new Scanner(System.in);
		String name=cin.next();
		String category;
		while(true) {
			System.out.println("Please Choose the number category of the suggested product");
			for (int i = 0; i < categories.length; i++) {
				System.out.println(i + 1 + " " + categories[i]);
			}
			Scanner cin2 = new Scanner(System.in);
			int indexCategory = cin2.nextInt();
			if(indexCategory <= categories.length) {
				category = categories[indexCategory - 1];
				break;
			}
		}
		Brand brand;
		while (true) {
			System.out.println("Please Choose the number Brand of the suggested product");
			for (int i = 0; i < brands.length; i++) {
				System.out.println(i + 1 + " " + brands[i]);
			}
			Scanner cin3 = new Scanner(System.in);
			int indexBrand = cin3.nextInt();
			if(indexBrand <= brands.length) {
				brand = brands[indexBrand - 1];
				break;
			}
		}
		System.out.println("Please write the type of the suggested product");
		Scanner cin5=new Scanner(System.in);
		String type=cin5.nextLine();
		submitProduct(name,category,brand,type);


	}

	public void submitProduct(String name, String category, Brand brand, String type) {
		productControl productcontrol=new 	productControl();
		productcontrol.addProduct(name,category,brand,type,true);

	}

}
