package ProductControl;

public class Category {
	private static String[] allCategories = {"a", "b", "c"};

	static public String[] getCategories() {
		return  allCategories;
	}

	public ProductInventory[] getProductsByCategory(String category) {
		return null;
	}

}
