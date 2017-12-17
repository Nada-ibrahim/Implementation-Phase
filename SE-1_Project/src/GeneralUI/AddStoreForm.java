package GeneralUI;

import PaymentControl.User;
import PaymentControl.Visa;
import ProductControl.StoreControl;

import java.util.Scanner;

public class AddStoreForm extends Form {

	private boolean online;

	public AddStoreForm(User current) {
		super(current);
	}

	public void submitOnsiteStore(String name, String address, String telephone, String mail) {
		StoreControl store=new StoreControl();
		store.addOnsiteStore(name,address,telephone,mail,currentUser);
	}

	public void submitOnlineStore(String name, String mail, String visaCode, String telephone) {
		StoreControl store=new StoreControl();
		store.addOnlineStore(name,mail,visaCode,telephone,currentUser);
	}

	public void makeForm() {
        if(online==true){
		System.out.println("Enter your name :");
		Scanner input=new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("Enter your mail :");
		String Email = input.nextLine();
		System.out.println("Enter your visaCode :");
		String visaCode = input.nextLine();
		System.out.println("Enter your telephone :");
		String telephone = input.nextLine();
		submitOnlineStore(name,Email,visaCode,telephone);
        }
        else if(online==false){
			System.out.println("Enter your name :");
			Scanner input=new Scanner(System.in);
			String name = input.nextLine();
			System.out.println("Enter your address :");
			String address = input.nextLine();
			System.out.println("Enter your telephone :");
			String telephone = input.nextLine();
			System.out.println("Enter your mail :");
			String Email = input.nextLine();
			submitOnsiteStore(name,address,telephone,Email);
		}


	}

	public void setOnline(boolean online) {
		this.online=online;
	}


}
