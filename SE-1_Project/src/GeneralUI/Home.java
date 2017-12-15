package GeneralUI;

import PaymentControl.User;
import ProductControl.Store;

public class Home extends Form {
	public Home(User currentUser)
	{
		super(currentUser);

	}

	public void signin() {

	}

	public void register() {

	}
	public void initialize(){

    }
    public void searchStoreProducts(User user,Store store){
		exploreProductInStoreForm exploreForm=new exploreProductInStoreForm(user,store);
		exploreForm.initializeForm(store);

	}

}
