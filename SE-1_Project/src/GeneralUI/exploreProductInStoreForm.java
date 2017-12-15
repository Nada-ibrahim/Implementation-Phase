package GeneralUI;

import PaymentControl.User;
import ProductControl.ProductInventory;
import ProductControl.Store;

public class exploreProductInStoreForm extends Form{


    public exploreProductInStoreForm(User currentUser)
    {
        super(currentUser);

    }
    public void initializeForm(Store store)
    {
        ProductInventory ProductInven=new ProductInventory();

        ProductInventory[]storeProducts=ProductInven. getStoresProducts(store);
        viewProducts(storeProducts);

    }

    public void viewProducts( ProductInventory[]storeProducts)
    {
        ProductInventory ProductInven=new ProductInventory();
        System.out.println("Products in "+ProductInven.getName()+" store:: ");
        for(int i=0;i<storeProducts.length;i++)
        {
            System.out.println(storeProducts);
        }

    }
    public void submitProduct(ProductInventory product)
    {
        viewDetails(product);

    }
    public void viewDetails(ProductInventory product)
    {
       String name= product.getName();
       int price= product.getPrice();
      int soldItems=  product.getSoldItems();
      System.out.println("Name:: "+name);
        System.out.println("Price:: "+price);
        System.out.println("SoldItems:: "+soldItems);


    }
}

