package GeneralUI;

import AdministratorUI.HomeAdmin;
import BuyerUI.HomeBuyer;
import PaymentControl.User;
import PaymentControl.UserControl;
import ProductControl.Store;
import StoreOwnerUI.HomeStoreOwner;

import java.util.Scanner;

public class SignInForm extends Form {
    public SignInForm(User current){
        super(current);
    }
    public void initializeForm() {
        makeForm();
    }

    private void makeForm() {
        boolean found=false;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your mail :");
            String name = input.nextLine();
            System.out.println("Enter your password :");
            String password = input.nextLine();
            if (submitUser(name, password)){
                found=true;
                break;
            }
        }
        if(found==true)
        {
            String type=currentUser.getType();//"Buyer", "Store Owner", "Premium Store Owner"
            if(type=="Buyer")
            {
                HomeBuyer buyer=new HomeBuyer(currentUser);
                buyer.makeForm();
            }
            else if(type=="Store Owner"or type=="Premium Store Owner")
            {
                System.out.println("Welcome ^_^ ");
                System.out.println("Please, Choose the operation you want to do");
                System.out.println("1- My Stores Functions ");
                System.out.println("2-Explore Products in store ");
                Scanner input=new Scanner(System.in);
               int numberOfOperation=input.nextInt();
               if( numberOfOperation==1){
                   StoresForm storesForm=new StoresForm(currentUser);
                   storesForm.makeForm();
               }
               else if( numberOfOperation==2) {
                   System.out.println("please,Enter name of the store you want to explore ::");
                   input = new Scanner(System.in);
                   String store = input.next();
                   Store Astore = new Store(store);
                   Home home = new Home(currentUser);
                   home.searchStoreProducts(currentUser, Astore);
               }
            }
            else if(type=="admin"){
            System.out.println("Welcome ^_^ ");
            System.out.println("Please, Choose the operation you want to do");
            System.out.println("1- My Stores Functions ");
            System.out.println("2-Explore Products in store ");
            Scanner input=new Scanner(System.in);
            int numberOfOperation=input.nextInt();
            if( numberOfOperation==1){
                HomeAdmin homeAdmin=new HomeAdmin(currentUser);
                homeAdmin.makeForm();

            }
            else if( numberOfOperation==2) {
                System.out.println("please,Enter name of the store you want to explore ::");
                input = new Scanner(System.in);
                String store = input.next();
                Store Astore = new Store(store);
                Home home = new Home(currentUser);
                home.searchStoreProducts(currentUser, Astore);
            }

        }
        }
    }

    public boolean submitUser(String name, String password) {
        UserControl uControl = new UserControl();
        return uControl.logUserIn(name, password);
    }
}
