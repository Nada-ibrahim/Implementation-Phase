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

	static public Store allStores[];

	public Store(String name, String mail, Visa visaCode, String telephone, User owner) {
		this.email=mail;
		this.name=name;
		this.owner=owner;
		this.telephone=telephone;
		this.visaCode=visaCode;
	}

	public Store[] getAllStores() {
		return this.allStores;
	}

	public User getStoreOwner() {
		return this.owner;
	}

	public String getTelephone() {
		return this.telephone;
	}


	public void removeStore() {

	}

	public String getmail() {
		return this.email;
	}

	public String getType() {
		return this.type;
	}

	public String getStoreName() {
		return null;
	}
	public boolean getStoreName(String name){
		boolean found=false;
		for (int i=0;i<allStores.length;i++){
			if(allStores[i].name.equals(name)){
				found=true;
				break;
			}
		}
		return found;
	}
}
