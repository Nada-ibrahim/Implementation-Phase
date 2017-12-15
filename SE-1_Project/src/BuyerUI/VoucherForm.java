package BuyerUI;

import PaymentControl.paymentControl;
import java.util.Scanner;
import GeneralUI.Form;
import PaymentControl.User;
import PaymentControl.Voucher;

public class VoucherForm extends Form {

	public VoucherForm (User currentUser)
	{
		super(currentUser);

	}

	public void initializeForm()
	{
		makeForm();
	}

	public void makeForm() {
		System.out.println("Enter code of voucher:: ");
		Scanner user_input = new Scanner( System.in );
		String code=user_input.next();
	}

	public void submitVoucher(String code) {
		paymentControl pay=new paymentControl();
		pay.buyByVoucher(code);


	}

}
