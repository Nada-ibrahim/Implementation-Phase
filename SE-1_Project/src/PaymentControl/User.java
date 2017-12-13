package PaymentControl;

import ProductControl.Store;

public class User {

	private String email;

	private String password;

	private String type;

	private String name;

	private Visa visaNo;

	private Store[] stores;

	private Visa visa;

	public void User(String email, String password, String name, String type) {

	}

	public void addToDatabase() {

	}

	public Visa getVisa() {
		return null;
	}

	public void setVisa(Visa visa) {

	}

	public Store[] getOwnerStores() {
		return stores;
	}

	public String getType() {
		return type;
	}
}
