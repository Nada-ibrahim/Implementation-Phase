package AdministratorUI;

import BuyerUI.exploreProductForm;
import GeneralUI.Form;
import ProductControl.BrandControl;

import java.util.Scanner;

public class AddBrandform extends exploreProductForm {

	public void submitBrand(String name) {
		BrandControl BrandControl=new BrandControl();
		BrandControl.addBrand(name,false);
	}

	public void makeForm() {
		System.out.println("please Enter the name of the new brand :D");
		Scanner input=new Scanner(System.in);
		String name=input.next();
		submitBrand(name);
	}

}
