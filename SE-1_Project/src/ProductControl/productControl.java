package ProductControl;

import AdministratorUI.AddProductForm;
import GeneralUI.Form;
import GeneralUI.SelectProductForm;

public class productControl {
	public void getAllCateoriesBrands(	AddProductForm addproductform){
		Category categories[]=Category.getCategories();
		Brand brands[]=Brand.getBrands(false);
		addproductform.makeForm(categories,brands);
	}


	public void addProduct(String name, Category category, Brand brand, String type, boolean suggested) {
		Product allProduct[]=Product.getProduct();
		boolean found=false;
		for(int i=0;i<allProduct.length;i++){
			if(allProduct[i].getProductName().equals(name)){
				found=true;
				break;
			}
		}
		Form form = null;
		if(found==false){
			Product product=new Product(name,category,brand,type,suggested);
			product.addToDatabase();
			form.viewSuccessMessage();
		}
		else if(found==true){
			form.viewErrorMessage();
			System.out.println("The name of Product already exist");
		}

	}

	public void getProductsforStore(Store store) {
		String typeOfStore=store.getType();
		Product product= null;
		Product productsOfStore[]=product.getProductsByType(typeOfStore);
		SelectProductForm selectproductform=new SelectProductForm();
		selectproductform.makeForm(productsOfStore);

	}

	public void addSuggestions(Product accepted, Product rejected) {

	}

}
