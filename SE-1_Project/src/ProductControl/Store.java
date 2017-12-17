package ProductControl;

import PaymentControl.User;

import java.util.ArrayList;
import java.util.List;

public class Store {

	protected String name;

	private User owner;

	private String telephone;

	private String email;

	private String visaCode;

	static public List<Store> allStores = new ArrayList<>();

	public Store(String name, String mail, String visaCode, String telephone, User owner) {
		this.email=mail;
		this.name=name;
		this.owner=owner;
		this.telephone=telephone;
		this.visaCode=visaCode;
	}
	public Store(String name)
	{
		this.name=name;
	}

	public Store[] getAllStores() {
		return null;
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

	public String getType() { return "";}

	public String getStoreName() {
		return this.name;
	}
//	public boolean getStoreName(String name){
//		boolean found=false;
//		for (int i=0;i<allStores.length;i++){
//			if(allStores[i].name.equals(name)){
//				found=true;
//				break;
//			}
//		}
//		return found;
//	}
	public static Store getStore(String name){
		for (Store allStore : allStores) {
			if (allStore.name.equals(name)) {
				return allStore;
			}
		}
		return null;
	}
}
