package ProductControl;

import java.util.ArrayList;
import java.util.List;

public class ProductInventory {


	private Product product;

	private int price;

	private int soldItems;

	private Store store;

	private static List<ProductInventory> allProductsInventory = new ArrayList<>();

	ProductInventory(String ProductName, String StoreName, int Price) {

	}

	public void addToDatabase() {

	}

	public Product[] getProductByName(String productName) {
		return null;
	}

	public int getPrice() {
		return 0;
	}

	public void incrementSoldItems() {

	}

	public Store getStore() {
		return null;
	}

	public int getSoldItems() {
		return 0;
	}

	public void setPromoted() {

	}

	static public ProductInventory[] getStoresProducts(Store store) {
		List<ProductInventory> storeProducts = new ArrayList<>();
		for (ProductInventory anAllProductsInventory : allProductsInventory) {
			if (anAllProductsInventory.getStore() == store) {
				storeProducts.add(anAllProductsInventory);
			}
		}
		ProductInventory[] productsArr = new ProductInventory[allProductsInventory.size()];
		return storeProducts.toArray(productsArr);
	}

	public String getName() {
		return product.getName();
	}
}
