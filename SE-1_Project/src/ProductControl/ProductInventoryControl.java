package ProductControl;

import GeneralUI.Form;

public class ProductInventoryControl {

	public boolean addProductInventory(Product product, Store store, int price) {

		ProductInventory ProductInventory =new ProductInventory(product,store,price);
		boolean foundProduct=ProductInventory.addToDatabase();
		if(foundProduct){
			Form.viewSuccessMessage();
			return true;
		} else{
			Form.viewErrorMessage();
			return false;
		}

	}

}
