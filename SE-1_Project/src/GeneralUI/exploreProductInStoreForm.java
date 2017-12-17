package GeneralUI;

import BuyerUI.VoucherForm;
import PaymentControl.User;
import PaymentControl.paymentControl;
import ProductControl.ProductInventory;
import ProductControl.Store;

public class exploreProductInStoreForm extends Form{


    public exploreProductInStoreForm(User currentUser,Store store)
    {

        super(currentUser);


    }
    public void initializeForm(Store store)
    {
        ProductInventory ProductInven=new ProductInventory();

        ProductInventory[]storeProducts=ProductInven.getStoresProducts(store);
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
    public void PayByVoucher(ProductInventory product)
    {
        paymentControl paycontrol =new paymentControl();
        paycontrol.setProduct(product);
        VoucherForm form=new VoucherForm(currentUser);
        form.initializeForm();
    }
}

