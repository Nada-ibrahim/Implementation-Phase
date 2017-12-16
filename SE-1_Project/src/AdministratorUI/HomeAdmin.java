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
		AddProductForm addproductForm=new AddProductForm();
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

}
