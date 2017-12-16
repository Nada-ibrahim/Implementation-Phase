package GeneralUI;

import PaymentControl.User;
import PaymentControl.UserControl;
import ProductControl.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Home extends Form {
	private String Email;
	private String name;
	private String password;
	private String type;

	public Home(User currentUser)
	{
		super(currentUser);

	}

	public void signin() {
		Scanner input=new Scanner(System.in);
		System.out.println("Entre your mail :");
		name=input.nextLine();
		System.out.println("Entre your password :");
		password=input.nextLine();




	}

	public void register() {
		Scanner input=new Scanner(System.in);
		int n;
		System.out.println("Entre your mail :");
		Email=input.nextLine();
		System.out.println("Entre your name :");
		name=input.nextLine();
		System.out.println("Entre your password :");
		password=input.nextLine();
		String types[];
		types= {"Buyer","Store owner","premium user"};
		System.out.println("if you are a Buyer press 1 if you are a store owner press 2 if you are premium user press 3");
		n=input.nextInt();
		while (true)
		{
			if (n==1||n==2||n==3)
			break;
			else
				System.out.println("Entre valid number");
		}
		type=types[n-1];
User u=new User(Email,password,name,type);
u.addToDatabase();

	}
	public void initialize(){

    }
    public void searchStoreProducts(User user,Store store){
		exploreProductInStoreForm exploreForm=new exploreProductInStoreForm(user,store);
		exploreForm.initializeForm(store);

	}

}
