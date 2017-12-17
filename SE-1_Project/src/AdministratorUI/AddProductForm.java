package AdministratorUI;

import GeneralUI.Form;
import PaymentControl.User;
import ProductControl.Brand;
import ProductControl.productControl;

import java.util.Scanner;

public class AddProductForm extends Form {

	public AddProductForm(User current) {
		super(current);
	}

	public boolean submitProduct(String name, String category, Brand brand, String type) {
		productControl productcontrol=new 	productControl();
		return productcontrol.addProduct(name,category,brand,type,false);
	}
	public void initializeForm(){
		productControl productcontrol=new productControl();
		productcontrol.getAllCateoriesBrands(this);
	}

	public void makeForm(String[] categories, Brand[] brands) {
		String name;
		String category;
		Brand brand;
		String type;

		System.out.println("Please write the name of the product");
		Scanner cin=new Scanner(System.in);
		name=cin.next();
		System.out.println("Please Choose the number category of the product");
		for(int i=0;i<categories.length;i++){
			System.out.println(i+1+" "+categories[i]);
		}
		Scanner cin2=new Scanner(System.in);
		int indexCategory=cin2.nextInt();
		category=categories[indexCategory-1];

		System.out.println("Please Choose the number Brand of the product");
		for(int i=0;i<brands.length;i++){
			System.out.println(i+1+" "+brands[i].getBrandName());
		}
		Scanner cin3=new Scanner(System.in);
		int indexBrand=cin3.nextInt();
		brand=brands[indexBrand-1];

		System.out.println("Please write the type of the product");
		Scanner cin4=new Scanner(System.in);
		type=cin4.nextLine();
		submitProduct(name,category,brand,type);
	}

}
