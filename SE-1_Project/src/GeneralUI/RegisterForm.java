package GeneralUI;

import PaymentControl.UserControl;

public class RegisterForm extends Form {

	public void makeForm() {

	}

	public void submitUser(String Email, String password, String name, String type) {
		UserControl.addUser(Email,password,name,type);


	}

}
