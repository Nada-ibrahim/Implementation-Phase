package ProductControl;

import GeneralUI.Form;

public class BrandControl {

	public void addBrand(String name, boolean suggested) {
		Brand brand=new Brand( name,suggested);
		boolean found=brand.addToDatabase();
		if(!found){
			Form.viewSuccessMessage();
		}
		else{
			Form.viewErrorMessage();
		}
	}

	public void addSuggestions(Brand[] accepted, Brand[] rejected) {

	}

}
