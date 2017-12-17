package StoreOwnerUI;

import GeneralUI.Form;
import GeneralUI.StoresForm;
import PaymentControl.User;

public class HomeStoreOwner extends Form {
	public HomeStoreOwner(User current){
		super(current);
		initializeForm();
	}

	public void suggestBrands() {

	}

	public void viewStatistics() {

	}

	public void suggestProducts() {
		SuggestProductForm SuggestProductForm=new SuggestProductForm ();
		SuggestProductForm.initializeForm();
	}

	public void marketProduct() {

	}

	@Override
	public void initializeForm() {

	}
}
