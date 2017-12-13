package ProductControl;

public class Product {

	private String name;

	private Category category;

	private Brand brand;

	private String type;
	

	public void addToDatabase() {

	}

	Product(String name, String category, Brand brand, String type, boolean suggested) {

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

	public Product[] getProductsByType(String type) {
		return null;
	}

	public String getName() {
		return name;
	}

}
