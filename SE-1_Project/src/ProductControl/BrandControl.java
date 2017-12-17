package ProductControl;

import GeneralUI.Form;

public class BrandControl {

	public void addBrand(String name, boolean suggested) {
		Brand brand=new Brand( name,suggested);
		boolean found=brand.addToDatabase();
		Form form=null;
		if(found==false){
			form.viewSuccessMessage();
		}
		else if(found==true){
			form.viewErrorMessage();
			System.out.println("the brand name is already exists in the system");
		}
	}

	public void addSuggestions(Brand[] accepted, Brand[] rejected) {

	}

}
