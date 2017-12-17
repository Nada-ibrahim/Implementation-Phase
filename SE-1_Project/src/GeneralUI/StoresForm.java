package GeneralUI;

import PaymentControl.User;
import PaymentControl.Visa;
import ProductControl.Store;
import ProductControl.productControl;
import StoreOwnerUI.ViewStatisticsForm;

import java.util.*;

public class StoresForm extends Form {
	private Store[] allStores;
	private String name;
	private String mail;
	private Visa visaCode;
	private String telephone;
	private User owner;
	public StoresForm(User current){
		super(current);
		allStores = current.getOwnerStores();
	}

	public void addOnsiteStore() {
		AddStoreForm AddStoreForm=new AddStoreForm(currentUser);
		AddStoreForm.setOnline(false);
		AddStoreForm.initializeForm();
	}

	public void addOnlineStore() {
		AddStoreForm AddStoreForm=new AddStoreForm(currentUser);
		AddStoreForm.setOnline(true);
		AddStoreForm.initializeForm();


	}

	public void addProductToStore(Store store) {
		productControl productcontrol =new productControl();
		SelectProductForm SelectProductform=new SelectProductForm(currentUser);
		SelectProductform.setStore(store);

	}

	public void makeForm() {
		System.out.println("1- add Online Store");
		System.out.println("2- add Onsite Store");
		System.out.println("3- Add Product to Store");
		if(currentUser.getType().equals("Premium")){
			System.out.println("4- view Statistics for Store");
		}
		int n;
		Scanner scan = new Scanner(System.in);
		do {
			n = scan.nextInt();
			if (n == 1) {
				addOnlineStore();
			} else if (n == 2) {
				addOnsiteStore();
			} else if (n == 3 || (n == 4 && currentUser.getType().equals("Premium"))) {
				for (int i = 0; i < allStores.length; ++i) {
					System.out.println("(" + i + 1 + ")" + allStores[i].getStoreName());
				}
				while (true) {
					System.out.println("Choose A Store: ");
					int s = scan.nextInt();
					if (s > allStores.length) {
						continue;
					}
					if (n == 3) {
						addProductToStore(allStores[s - 1]);
					} else {
						viewStatisticsFor(allStores[s - 1]);
					}
					break;
				}
			}
		}while (n > 4);
	}

	public void chooseStore(Store store) {

	}

	public void initializeForm(){

	}

	public void viewStatisticsFor(Store store){
		ViewStatisticsForm vForm = new ViewStatisticsForm(currentUser, store);
		vForm.initializeForm();
	}
}
