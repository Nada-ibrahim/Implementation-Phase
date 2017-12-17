package ProductControl;

import PaymentControl.Visa;
import PaymentControl.User;

public class OnlineStore extends Store {

	private Visa visa;

	public OnlineStore(String name, String mail, String visaCode, String telephone, User owner) {
		super(name, mail, visaCode, telephone, owner);
	}

	@Override
	public String getType() {
		return "online";
	}

	public boolean addToDatabase() {
		for (int i = 0; i < Store.allStores.size(); i++) {
			if (Store.allStores.get(i).getStoreName().equals(name)) {
				return false;
			}
		}
		allStores.add(this);
		return true;
	}

}
