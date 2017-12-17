package ProductControl;

import PaymentControl.User;

public class OnsiteStore extends Store {

	private String address;

    public OnsiteStore(String name, String mail, String address, String telephone, User owner) {
        super(name, mail, address, telephone, owner);
    }

    @Override
    public String getType() {
        return "onsite";
    }

    public boolean addToDatabase() {
        for(int i=0;i<Store.allStores.size();i++){
            if(Store.allStores.get(i).getStoreName().equals(name)){
                return false;
            }
        }
        allStores.add(this);
        return true;
	}

}
