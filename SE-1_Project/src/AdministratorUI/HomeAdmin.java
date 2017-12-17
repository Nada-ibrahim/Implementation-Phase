package AdministratorUI;

import GeneralUI.Form;
import PaymentControl.User;

import java.util.Scanner;

public class HomeAdmin extends Form {
	public HomeAdmin(User current){
		super(current);
		currentUser = current;
	}

	public void addProduct() {
		AddProductForm addproductForm=new AddProductForm(currentUser);
		addproductForm.initializeForm();
	}

	public void provideVoucherCards() {
		AddVoucherForm vForm = new AddVoucherForm(currentUser);
		vForm.initializeForm();
	}

	public void addBrand() {
		AddBrandform AddBrandform=new AddBrandform();
		AddBrandform.initializeForm();
	}

	public void removeBrand() {

	}

	public void viewSuggestions() {

	}

	public void manageStores() {

	}

	public void removeProduct() {

	}
	public void makeForm(){
		System.out.println("Please, Choose the operation you want to do");
		System.out.println("1-Add Product");
		System.out.println("2-Provide Voucher Cards");
		System.out.println("3-Add Brand");
		Scanner input = new Scanner(System.in);
		int  numberOfOperation = input.nextInt();
		if(numberOfOperation==1){
			addProduct();
		}
		else if(numberOfOperation==2){
			provideVoucherCards();
		}
		else if(numberOfOperation==3){
			addBrand();
		}

	}

}
