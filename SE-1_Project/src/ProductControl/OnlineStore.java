package ProductControl;

import PaymentControl.Visa;
import PaymentControl.User;

public class OnlineStore extends Store {

	private Visa visa;

	public OnlineStore(String name, String mail, String visaCode, String telephone, User owner) {
		super(name, mail, visaCode, telephone, owner);
	}


	public void OnlineStore(String name, String mail, String visa,String telephone, User owner) {


	}

	public void addToDatabase() {
		int index=Store.allStores.length;
		Store.allStores[index]=this;
	}

}
