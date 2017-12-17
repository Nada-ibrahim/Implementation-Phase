package PaymentControl;

import java.util.HashMap;
import java.util.Map;

public class Voucher {
	private static Map<String, Voucher> allVouchers  = new HashMap<>();
	private String code;
	private int value;
	public Voucher(String vouchCode, int value) {
		code=vouchCode;
		this.value = value;
	}

	public static int getVoucherValue(String code) {
		Voucher checkExistance = allVouchers.get(code);
		if (checkExistance == null) {
			return -1;
		}
		return checkExistance.value;
	}

	public boolean addToDatabase() {
		Voucher addedVoucher = allVouchers.get(code);
		if(addedVoucher == null){
			allVouchers.put(code, this);
			return true;
		}else{
			return false;
		}
	}

}
