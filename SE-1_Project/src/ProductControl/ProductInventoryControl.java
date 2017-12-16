package ProductControl;

import GeneralUI.Form;

public class ProductInventoryControl {

	public void addProductInventory(Product product, Store store, int price) {
		boolean foundProduct=product.getProductName(product.getProductName());
		boolean foundStore=store.getStoreName(store.getStoreName());
		Form form = null;
		if(foundProduct&&foundStore){
			ProductInventory ProductInventory =new ProductInventory(product.getProductName(),store.getStoreName(),price);
			form.viewSuccessMessage();
			ProductInventory.addToDatabase();
		}
		else if(!foundProduct&&!foundStore){
			form.viewErrorMessage();
			System.out.println("the store name and product does not exist");
		}
		else if(!foundProduct&&foundStore){
			form.viewErrorMessage();
			System.out.println("the product name does not exist");
		}
		else if(foundProduct&&!foundStore){
			form.viewErrorMessage();
			System.out.println("the store name does not exist");
		}

	}

}
