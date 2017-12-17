package GeneralUI;

import PaymentControl.User;
import ProductControl.StoreControl;

import java.util.Scanner;

public class AddStoreForm extends Form {

	private boolean online;

	public AddStoreForm(User current, boolean online) {
		super(current);
		this.online = online;
	}

	public boolean submitOnsiteStore(String name, String address, String telephone, String mail) {
		StoreControl store=new StoreControl();
		return store.addOnsiteStore(name,address,telephone,mail,currentUser);
    }

	public boolean submitOnlineStore(String name, String mail, String visaCode, String telephone) {
		StoreControl store=new StoreControl();
		return store.addOnlineStore(name,mail,visaCode,telephone,currentUser);

    }

	public void makeForm() {
	    while (true) {
            System.out.println("Enter Store name :");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            System.out.println("Enter Store mail :");
            String Email = input.nextLine();
            System.out.println("Enter Store telephone :");
            String telephone = input.nextLine();
            if (online) {
                System.out.println("Enter Store visaCode :");
                String visaCode = input.nextLine();
                if(submitOnlineStore(name, Email, visaCode, telephone)){
                    break;
                }
            } else {
                System.out.println("Enter Store address :");
                String address = input.nextLine();
                if(submitOnsiteStore(name, address, telephone, Email)){
                    break;
                }
            }
        }
	}

	@Override
	public void initializeForm() {
		makeForm();
	}
}
