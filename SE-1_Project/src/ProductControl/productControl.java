package ProductControl;

import AdministratorUI.AddProductForm;
import GeneralUI.Form;

public class productControl {
	public void getAllCateoriesBrands(AddProductForm addproductform){
		String[] categories=Category.getCategories();
		Brand brands[]=Brand.getBrands(false);
		addproductform.makeForm(categories,brands);
	}


	public boolean addProduct(String name, String category, Brand brand, String type, boolean suggested) {
		Product product = new Product(name, category, brand, type, suggested);
		boolean found = product.addToDatabase();
		if (found) {
			Form.viewSuccessMessage();
		} else {
			Form.viewErrorMessage();
		}
		return found;
	}

	public Product[] getProductsforStore(Store store) {
		String typeOfStore=store.getType();
		return Product.getProductsByType(typeOfStore);
	}

	public void addSuggestions(Product accepted, Product rejected) {

	}

}
