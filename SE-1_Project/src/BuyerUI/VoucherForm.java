package BuyerUI;

import GeneralUI.Form;
import PaymentControl.User;
import PaymentControl.paymentControl;

import java.util.Scanner;

public class VoucherForm extends Form {

	public VoucherForm (User currentUser)
	{
		super(currentUser);

	}

	public void initializeForm() {
		makeForm();
	}

	public void makeForm() {
		System.out.println("Enter code of voucher:: ");
		Scanner user_input = new Scanner( System.in );
		String code=user_input.next();
		submitVoucher(code);
	}

	public void submitVoucher(String code) {
		paymentControl pay=new paymentControl();
		pay.buyByVoucher(code);
	}

}
