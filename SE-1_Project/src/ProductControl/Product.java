package ProductControl;

public class Product {

	private String name;

	private Category category;
	boolean suggested;

	private Brand brand;

	private String type;

	static public Product allProducts [];

	public void addToDatabase() {
		int index=allProducts.length;
		allProducts[index]=this;
	}

	Product(String name, Category category, Brand brand, String type, boolean suggested) {
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

	public Product[] getProductsByType(String type) {
		Product product[]=null;
		int counter=0;
		for(int i=0;i<allProducts.length;i++){
			if(allProducts[i].type==type){
				product[counter]=allProducts[i];
				counter++;
			}
		}
		return product;
	}
	public boolean getProductName(String name) {
		boolean found=false;
		for(int i=0;i<allProducts.length;i++){
			if(allProducts[i].name.equals(name)){
				found=true;
				break;
			}
		}
		return found;
	}
	public String getProductName() {
		return this.name;
	}

	static public Product[] getProduct() {
		return allProducts;}

	public String getName() {
		return this.name;
	}

}
