package GeneralUI;

import PaymentControl.User;
import java.util.Collection;

abstract public class Form {

	protected User currentUser;

	private Collection<User> user;
	public Form(User current){
	    currentUser = current;
    }

	public void viewSuccessMessage() {

	}

	public void viewErrorMessage() {

	}

	public void initializeForm(){

    }

}