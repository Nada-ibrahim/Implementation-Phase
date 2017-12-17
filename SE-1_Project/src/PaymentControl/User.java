package PaymentControl;

import ProductControl.Store;

import java.util.ArrayList;
import java.util.List;


public class User {
	private static List<User> allUsers=new ArrayList<>();

	private String email;

	private String password;

	private String type;

	private String name;

	private Visa visaNo;

	private static List<Store> stores=new ArrayList<>();


	public User(String email, String password, String name, String type) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.type = type;


	}

	public boolean  addToDatabase() {
		for (User allUser : allUsers) {
			if (email.equals(allUser.email)) {
				return false;
			}
		}
		allUsers.add(this);
		return true;

	}

	public Visa getVisa() {
		return null;
	}

	public void setVisa(Visa visa) {

	}

	public Store[] getOwnerStores() {
		Store[] allStores = new Store[stores.size()];
		return stores.toArray(allStores);
	}

	public String getType() {
		return type;
	}

	public static User getUser(String email, String password){
		for (User allUser : allUsers) {
			if (email.equals(allUser.email) && password.equals(allUser.password)) {
				return allUser;
			}
		}
		return null;
	}
}
