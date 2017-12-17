package ProductControl;

import PaymentControl.Visa;
import PaymentControl.User;

public class OnlineStore extends Store {

	private Visa visa;

	public OnlineStore(String name, String mail, String visaCode, String telephone, User owner) {
		super(name, mail, visaCode, telephone, owner);
	}


	public void OnlineStore(String name, String mail, String visa,String telephone, User owner) {


	}

	public boolean addToDatabase(String name) {
		boolean found=false;
		int index=Store.allStores.length;
		for(int i=0;i<Store.allStores.length;i++){
			if(Store.allStores[i].getStoreName().equals(name)){
				found=true;
			}
		}
		if(found==false){
		Store.allStores[index]=this;}
		return found;
	}

}
