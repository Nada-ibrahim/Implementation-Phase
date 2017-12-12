package PaymentControl;

import ProductControl.ProductInventory;
import java.util.Collection;

public class paymentControl {

	private ProductInventory boughtProduct;

	private Collection<ProductInventory> productInventory;

	public void setProduct(ProductInventory product) {

	}

	public void buyByVoucher(String voucherCode) {

	}

	public boolean visaPay(Visa visa) {
		return true;
	}

	public boolean verifyVoucherValue(int value, int price) {
		return true;
	}

	public void payOnDelivery(String address) {

	}

	public void sendMail(String address, String email) {

	}

	public boolean verifyCardNo(Visa visa) {
		return true;
	}

}
