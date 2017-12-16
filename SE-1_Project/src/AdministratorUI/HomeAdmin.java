package AdministratorUI;

import GeneralUI.Form;
import GeneralUI.Home;
import PaymentControl.User;

import javax.jws.soap.SOAPBinding;

public class HomeAdmin extends Form {
	HomeAdmin(User current){
		super(current);
		currentUser = current;
	}

	public void addProduct() {

	}

	public void provideVoucherCards() {
		AddVoucherForm vForm = new AddVoucherForm(currentUser);
		vForm.initializeForm();
	}

	public void addBrand() {

	}

	public void removeBrand() {

	}

	public void viewSuggestions() {

	}

	public void manageStores() {

	}

	public void removeProduct() {

	}

}
