package ProductControl;

public class Brand {

	private String name;
	private  boolean suggested;
	static public Brand allBrand[];

	Brand(String name, boolean suggested) {
		this.name=name;
		this.suggested=suggested;
	}

	public void deleteBrand(Brand deleted) {

	}

	static public Brand[] getBrands(boolean suggested) {
		return allBrand;
	}

	public void setAccepted(Brand accepted) {

	}

	public void addToDatabase() {
		int index=allBrand.length;
		allBrand[index]=this;
	}
	public String getBrandName() {
		return this.name;
	}

	public String[] getMaxBrands() {
		return null;
	}

}
