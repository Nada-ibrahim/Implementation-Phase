package ProductControl;

import GeneralUI.Form;
import PaymentControl.User;
import PaymentControl.paymentControl;
import StoreOwnerUI.ViewStatisticsForm;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class StoreControl {

	public boolean addOnsiteStore(String name, String address, String telephone, String mail, User owner) {
		OnsiteStore onsiteStore=new OnsiteStore(name,mail,address,telephone,owner);

		boolean found=onsiteStore.addToDatabase();
		if(found){
		    owner.addStoreToOwner(onsiteStore);
			Form.viewSuccessMessage();
		} else{
			Form.viewErrorMessage();
		}
		return found;
	}

	public boolean addOnlineStore(String name, String mail, String visaCode, String telephone, User owner) {
		paymentControl payment = new paymentControl();
		boolean valid = payment.verifyCardNo(visaCode);
		if (!valid) {
			Form.viewErrorMessage();
			return false;
		} else {
			OnlineStore online = new OnlineStore(name, mail, visaCode, telephone, owner);
			boolean found = online.addToDatabase();
			if (found) {
                owner.addStoreToOwner(online);
				Form.viewSuccessMessage();
				return true;
			} else {
				Form.viewErrorMessage();
				return false;
			}
		}
	}

	public void viewStatistics(ViewStatisticsForm form, Store store){
		ProductInventory[] storeProducts = ProductInventory.getStoresProducts(store);
		List<Pair<String, Integer>> productStat= new ArrayList<>();
		List<Pair<String, Integer>> maxProducts = new ArrayList<>();
		int max = 0;
		for (ProductInventory storeProduct : storeProducts) {
			productStat.add(new Pair<>(storeProduct.getProduct().getName(), storeProduct.getSoldItems()));
			if (storeProduct.getSoldItems() > max) {
				maxProducts.clear();
				maxProducts.add(productStat.get(productStat.size() - 1));
				max = storeProduct.getSoldItems();
			} else if (storeProduct.getSoldItems() == max) {
				maxProducts.add(productStat.get(productStat.size() - 1));
			}
		}
		form.makeForm(productStat, maxProducts);
	}

}
