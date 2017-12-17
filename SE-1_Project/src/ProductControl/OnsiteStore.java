package ProductControl;

import PaymentControl.User;

public class OnsiteStore extends Store {

	private String address;

    public OnsiteStore(String name, String mail, String address, String telephone, User owner) {
        super(name, mail, address, telephone, owner);
    }

    public void OnsiteStore(String name, String address, double workhours, String mail, String type) {

	}

	public boolean addToDatabase(String name) {
        int index=Store.allStores.length;
        boolean found=false;
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
