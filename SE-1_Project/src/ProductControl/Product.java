package ProductControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {

	private String name;

	private String category;
	private boolean suggested;

	private Brand brand;

	private String type;

	private static List<Product> allProducts = new ArrayList<>();
	private static List<Product> suggestedProducts = new ArrayList<>();

	public boolean addToDatabase() {
		for(int i = 0; i < allProducts.size(); ++i){
			if(Objects.equals(name, allProducts.get(i).getProductName())){
				return false;
			}
		}
		if(suggested) {
			suggestedProducts.add(this);
		}else{
			allProducts.add(this);
		}
		return true;
	}

	Product(String name, String category, Brand brand, String type, boolean suggested) {
		this.name=name;
		this.brand=brand;
		this.type=type;
		this.category=category;
		this.suggested=suggested;
	}

	public Product[] getProductsBySuggestion(boolean suggested) {
		return null;
	}

	public void setAccepted(Product accepted) {

	}

	public void deleteProduct(Product deleted) {

	}

	public String[] getMaxProducts() {
		return null;
	}

	public static Product[] getProductsByType(String type) {
		List<Product> selectedProducts = new ArrayList<>();
		for (Product allProduct : allProducts) {
			if (Objects.equals(allProduct.type, type)) {
				selectedProducts.add(allProduct);
			}
		}
		Product[] products = new Product[selectedProducts.size()];
		return selectedProducts.toArray(products);
	}
//	public boolean getProductName(String name) {
//		boolean found=false;
//		for(int i=0;i<allProducts.length;i++){
//			if(allProducts[i].name.equals(name)){
//				found=true;
//				break;
//			}
//		}
//		return found;
//	}
	public String getProductName() {
		return this.name;
	}


	public String getName() {
		return this.name;
	}

	public Brand getBrand() {
		return brand;
	}

	public String getCategory() {
		return category;
	}
}
