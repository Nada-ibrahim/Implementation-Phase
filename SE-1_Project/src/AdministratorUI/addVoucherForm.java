package AdministratorUI;

import PaymentControl.User;
import GeneralUI.Form;
import PaymentControl.VoucherControl;

import java.util.Scanner;

public class AddVoucherForm extends Form {

	public AddVoucherForm(User currentUser) {
		super(currentUser);
	}

	public void submitVoucherDetails(int price, int numb) {

	}

	public void makeForm() {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter The code of the voucher: ");
			String code = scan.next();
			System.out.println("Enter The value of the voucher: ");
			int value = scan.nextInt();
			VoucherControl vc = new VoucherControl();
			if (vc.addVoucher(code, value)) {
				break;
			}
		}

	}
	public void initializeForm(){
		makeForm();
	}

}
