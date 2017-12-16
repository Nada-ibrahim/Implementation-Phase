package ProductControl;

import GeneralUI.Form;

public class BrandControl {

	public void addBrand(String name, boolean suggested) {
		boolean found=false;
		for(int i=0;i<Brand.allBrand.length;i++){
			if(Brand.allBrand[i].getBrandName().equals(name)){
				found=true;
				break;
			}
		}
		Form form=null;
		if(found==false){
			Brand brand=new Brand( name,suggested);
			brand.addToDatabase();
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
