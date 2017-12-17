package ProductControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Brand {

	private String name;
	private  boolean suggested;
	private static List<Brand> allBrands = new ArrayList<>();

	Brand(String name, boolean suggested) {
		this.name=name;
		this.suggested=suggested;
	}

	public void deleteBrand(Brand deleted) {

	}

	static public Brand[] getBrands(boolean suggested) {
		List<Brand> brands = new ArrayList<>();
		for(int i = 0; i < allBrands.size(); ++i){
			if(allBrands.get(i).suggested == suggested){
				brands.add(allBrands.get(i));
			}
		}
		Brand[] brandArr = new Brand[brands.size()];
		return brands.toArray(brandArr);
	}

	public void setAccepted(Brand accepted) {

	}

	public boolean addToDatabase() {
		for(int i = 0; i < allBrands.size(); ++i){
			if(Objects.equals(name, allBrands.get(i).name)){
				return false;
			}
		}
		allBrands.add(this);
		return true;
	}
	public String getBrandName() {
		return this.name;
	}

	public String[] getMaxBrands() {
		return null;
	}

}
