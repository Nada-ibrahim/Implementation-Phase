package ProductControl;

import PaymentControl.User;

public class OnsiteStore extends Store {

	private String address;

    public OnsiteStore(String name, String mail, String address, String telephone, User owner) {
        super(name, mail, address, telephone, owner);
    }

    public void OnsiteStore(String name, String address, double workhours, String mail, String type) {

	}

	public void addToDatabase() {
        int index=Store.allStores.length;
        Store.allStores[index]=this;
	}

}
