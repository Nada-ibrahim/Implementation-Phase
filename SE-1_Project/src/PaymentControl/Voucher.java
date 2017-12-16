package PaymentControl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Voucher {
	static Map<String, Voucher> allVouchers  = new HashMap<>();
	private String code;
	private int value;
	public Voucher(String vouchCode, int value) {
		code=vouchCode;
		this.value = value;
	}

	public int getVoucherValue() {

		return value;
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
