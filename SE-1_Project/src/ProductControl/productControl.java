package ProductControl;

import AdministratorUI.AddProductForm;
import GeneralUI.Form;
import GeneralUI.SelectProductForm;
import PaymentControl.User;

public class productControl {

	User user;
	public void getAllCateoriesBrands(	AddProductForm addproductform){
		Category categories[]=Category.getCategories();
		Brand brands[]=Brand.getBrands(false);
		addproductform.makeForm(categories,brands);
	}


	public boolean addProduct(String name, Category category, Brand brand, String type, boolean suggested) {
		Product allProduct[]=Product.getProduct();
		Product product=new Product(name,category,brand,type,suggested);
		boolean found=	product.addToDatabase();
		Form form = null;
		if(found==false){

			form.viewSuccessMessage();
		}
		else if(found==true){
			form.viewErrorMessage();
			System.out.println("The name of Product already exist");
		}
      return found;
	}

	public void getProductsforStore(Store store) {
		String typeOfStore=store.getType();
		Product product= null;
		Product productsOfStore[]=product.getProductsByType(typeOfStore);
		SelectProductForm selectproductform=new SelectProductForm(user);
		selectproductform.makeForm(productsOfStore);

	}

	public void addSuggestions(Product accepted, Product rejected) {

	}

}
