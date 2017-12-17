package PaymentControl;

import GeneralUI.Form;
import ProductControl.ProductInventory;

import java.util.Collection;

public class paymentControl {

	private ProductInventory boughtProduct;
	private User currentUser;
	private Collection<ProductInventory> productInventory;

	public void setProduct(ProductInventory product) {
         boughtProduct=product;
	}

	public void buyByVoucher(String voucherCode) {
		int voucherValue = Voucher.getVoucherValue(voucherCode);
		int price = boughtProduct.getPrice();
		boolean verified = verifyVoucherValue(voucherValue, price);
		if (verified && voucherValue != -1) {
			Form.viewSuccessMessage();
		} else {
			Form.viewErrorMessage();
		}
	}

	public boolean visaPay(Visa visa) {
		return true;
	}

	public boolean verifyVoucherValue(int value, int price) {
		return value > price;
	}

	public void payOnDelivery(String address) {

	}

	public void sendMail(String address, String email) {

	}

	public boolean verifyCardNo(String visa) {
		return true;
	}

}
