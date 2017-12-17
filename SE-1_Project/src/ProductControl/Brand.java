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

	public boolean addToDatabase() {
		boolean found=false;
		int index=allBrand.length;
		for(int i=0;i<Brand.allBrand.length;i++){
			if(Brand.allBrand[i].getBrandName().equals(name)){
				found=true;
				break;
			}
		}
		if(found==false){
		allBrand[index]=this;
		}
		return found;
	}
	public String getBrandName() {
		return this.name;
	}

	public String[] getMaxBrands() {
		return null;
	}

}
