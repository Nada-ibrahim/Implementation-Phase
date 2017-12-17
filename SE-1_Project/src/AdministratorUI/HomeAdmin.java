package AdministratorUI;

import GeneralUI.Home;
import PaymentControl.User;
import ProductControl.Store;

import java.util.Scanner;

public class HomeAdmin extends Home {
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
	    while (true) {
            System.out.println("Welcome " + currentUser.getName() + " ^-^");
            System.out.println("Please, Choose the operation you want to do");
            System.out.println("1-Add Product to the system");
            System.out.println("2-Provide Voucher Cards");
            System.out.println("3-Add Brand");
            System.out.println("4-Explore Products in store");
            System.out.println("5-log out");
            Scanner input = new Scanner(System.in);
            int numberOfOperation = input.nextInt();
            if (numberOfOperation == 1) {
                addProduct();
            } else if (numberOfOperation == 2) {
                provideVoucherCards();
            } else if (numberOfOperation == 3) {
                addBrand();
            } else if (numberOfOperation == 4) {
                String storeName = input.next();
                Store store = Store.getStore(storeName);
                searchStoreProducts(currentUser, store);
            }else if (numberOfOperation == 5) {
                break;
            }
        }

	}
	public void initializeForm(){
		makeForm();
	}

}
