package StoreOwnerUI;

import GeneralUI.Form;
import GeneralUI.StoresForm;
import PaymentControl.User;

public class HomeStoreOwner extends Form {
	StoresForm myStores;
	HomeStoreOwner(User current){
		currentUser = current;
		StoresForm myStores = new StoresForm(current);
		initializeForm();
	}

	public void suggestBrands() {

	}

	public void viewStatistics() {

	}

	public void suggestProducts() {

	}

	public void marketProduct() {

	}

	@Override
	public void initializeForm() {

	}
}
