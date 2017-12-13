package StoreOwnerUI;

import GeneralUI.StoresForm;
import PaymentControl.User;

public class HomePremium extends HomeStoreOwner {
    HomePremium(User current){
        super(current);
    }

    public void viewStatistics(){
        StoresForm myStores = new StoresForm(currentUser);
        myStores.initializeForm();
    }
}
