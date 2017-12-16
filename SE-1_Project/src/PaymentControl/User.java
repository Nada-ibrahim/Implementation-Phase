package PaymentControl;

import ProductControl.Store;

import java.util.ArrayList;
import java.util.List;


public class User {

	private String email;

	private String password;

	private String type;

	private String name;

	private Visa visaNo;

	public static List<Store> stores=new ArrayList<>();

	private Visa visa;
	private List<User> user=new ArrayList<>();



	public User(String email, String password, String name, String type) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.type = type;


	}

	public static void  addToDatabase() {
		for (int i=0;i<user.size();i++)
		{

			if (email==user.get(i).email)
			{

				System.out.println("these mail exists");
			}
			else
			{
				addToDatabase();
			}
		}

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
}
