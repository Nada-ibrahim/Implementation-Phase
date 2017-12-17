package ProductControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductInventory {


	private Product product;

	private int price;

	private int soldItems;

	private Store store;

	private static List<ProductInventory> allProductsInventory = new ArrayList<>();

	ProductInventory(Product product, Store store, int price) {
		this.product = product;
		this.store = store;
		this.price = price;
		soldItems = 0;
	}

	public boolean addToDatabase() {
		for (ProductInventory anAllProductsInventory : allProductsInventory) {
			if (Objects.equals(getProduct(), anAllProductsInventory.getProduct())
					&& store == anAllProductsInventory.getStore()) {
				return false;
			}
		}
		allProductsInventory.add(this);
		return true;
	}

	public Product[] getProductByName(String productName) {
		return null;
	}

	public int getPrice() {

		return price;
	}

	public void incrementSoldItems() {

	}

	public Store getStore() {
		return store;
	}

	public int getSoldItems() {
		return soldItems;
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

	public Product getProduct() {
		return product;
	}
}
