package PaymentControl;

import BuyerUI.HomeBuyer;
import GeneralUI.Form;
import ProductControl.Store;
import StoreOwnerUI.HomePremium;
import StoreOwnerUI.HomeStoreOwner;

import java.security.acl.Owner;

public class UserControl {
private User user;
	public boolean addUser(String email, String password, String name, String type) {
		User newUser = new User(email, password, name, type);
		if(newUser.addToDatabase()){
			Form.viewSuccessMessage();
			openHomeForm(newUser);
			return true;
		}else{
			Form.viewErrorMessage();
			return false;
		}

	}

	public void getStatistics(User owner) {

	}

	public boolean logUserIn(String email, String password) {
		User loggedUser = User.getUser(email, password);
		if( loggedUser != null){
			Form.viewSuccessMessage();
			openHomeForm(loggedUser);
			return true;
		}else {
			Form.viewErrorMessage();
			return false;
		}
	}

	private void openHomeForm(User loggedUser){
		switch (loggedUser.getType()) {
			case "Buyer":
				HomeBuyer hb = new HomeBuyer(loggedUser);
				hb.initializeForm();
				break;
			case "Store Owner":
				HomeStoreOwner so = new HomeStoreOwner(loggedUser);
				so.initializeForm();
				break;
			case "Premium Store Owner":
				HomePremium pso = new HomePremium(loggedUser);
				pso.initializeForm();
				break;
		}
	}
}
