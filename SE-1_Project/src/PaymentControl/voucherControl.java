package PaymentControl;

import GeneralUI.Form;

public class VoucherControl {
	public VoucherControl(){

	}
	public boolean addVoucher(String code, int value) {
		Voucher v = new Voucher(code, value);
		boolean success = v.addToDatabase();
		if(success){
			Form.viewSuccessMessage();
			return true;
		}else{
			Form.viewErrorMessage();
			return false;
		}
	}

}
