package ProductControl;

import PaymentControl.User;
import PaymentControl.Visa;

public class Store {

	private String name;

	private User owner;

	private String telephone;

	private String email;

	private String type;
	private Visa visaCode;

	public Store(String name, String mail, Visa visaCode, String telephone, User owner) {
		this.email=mail;
		this.name=name;
		this.owner=owner;
		this.telephone=telephone;
		this.visaCode=visaCode;
	}

	public Store[] getAllStores() {
		return null;
	}

	public String getStoreOwner() {
		return null;
	}

	public String getTelephone() {
		return null;
	}


	public void removeStore() {

	}

	public String getmail() {
		return null;
	}

	public String getType() {
		return null;
	}

	public String getStoreName() {
		return null;
	}

}
