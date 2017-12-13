package ProductControl;

import PaymentControl.User;
import PaymentControl.Visa;
import StoreOwnerUI.ViewStatisticsForm;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class StoreControl {

	public void addOnsiteStore(String name, String address, String telephone, String mail, String type, User owner) {

	}

	public void addOnlineStore(String name, String mail, Visa visaCode, String telephone, User owner) {

	}

	public void viewStatistics(ViewStatisticsForm form, Store store){
		ProductInventory[] storeProducts = ProductInventory.getStoresProducts(store);
		List<Pair<String, Integer>> productStat= new ArrayList<>();
		List<Pair<String, Integer>> maxProducts = new ArrayList<>();
		int max = 0;
		for (ProductInventory storeProduct : storeProducts) {
			productStat.add(new Pair<>(storeProduct.getName(), storeProduct.getSoldItems()));
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
