package GeneralUI;

import BuyerUI.VoucherForm;
import PaymentControl.User;
import PaymentControl.paymentControl;
import ProductControl.Brand;
import ProductControl.ProductInventory;
import ProductControl.Store;

import java.util.Scanner;

public class exploreProductInStoreForm extends Form{
    private Store exploredStore;

    public exploreProductInStoreForm(User currentUser,Store store) {
        super(currentUser);
        exploredStore = store;
    }

    public void initializeForm() {
        ProductInventory[] storeProducts = ProductInventory.getStoresProducts(exploredStore);
        viewProducts(storeProducts);
    }

    public void viewProducts( ProductInventory[] storeProducts) {
        if(storeProducts.length == 0){
            System.out.println("No products in this Store");
        }else {
            System.out.println("Products in the store are:- ");
            for (int i = 0; i < storeProducts.length; i++) {
                System.out.println("(" + (i + 1) + ")" + storeProducts[i].getProduct().getName());
            }
            while (true) {
                System.out.println("Enter the number of product you want to view its details: ");
                int n;
                Scanner scan = new Scanner(System.in);
                n = scan.nextInt();
                if (1 < n && n <= storeProducts.length) {
                    submitProduct(storeProducts[n]);
                    break;
                }
            }
        }
    }
    public void submitProduct(ProductInventory product)
    {
        viewDetails(product);
    }

    public void viewDetails(ProductInventory product) {
        String name = product.getProduct().getName();
        String category = product.getProduct().getCategory();
        Brand brand = product.getProduct().getBrand();
        int price = product.getPrice();

        System.out.println("Name:: " + name);
        System.out.println("Price:: " + price);
        System.out.println("Category:: " +  category);
        System.out.println("Brand:: " +  brand.getBrandName());

        product.incrementSoldItems();
        if(currentUser.getType().equals("Buyer")){
            System.out.println("Do you want to buy it? (Enter y if yes) ");
            Scanner scan  = new Scanner(System.in);
            String answer = scan.nextLine();
            if(answer.equals("y")){
                PayByVoucher(product);
            }
        }
    }

    public void PayByVoucher(ProductInventory product)
    {
        paymentControl paycontrol =new paymentControl();
        paycontrol.setProduct(product);
        VoucherForm form=new VoucherForm(currentUser);
        form.initializeForm();
    }
}

