package PaymentControl;

import BuyerUI.VoucherForm;
import ProductControl.ProductInventory;
import GeneralUI.Form;
import java.util.Collection;

public class paymentControl {

	private ProductInventory boughtProduct;
	private User currentUser;

	private Collection<ProductInventory> productInventory;

	public void setProduct(ProductInventory product) {
         boughtProduct=product;
	}

	public void buyByVoucher(String voucherCode) {
		VoucherForm vouchForm=new VoucherForm(currentUser);
		if(currentUser.getType()!="Buyer"){System.out.println("you can't buy by voucher"); }
		else {
			Voucher vouch = new Voucher(voucherCode);
			int voucherValue = vouch.getVoucherValue();
			int price = boughtProduct.getPrice();
			boolean verified = verifyVoucherValue(voucherValue, price);
			if (verified) {
				boughtProduct.incrementSoldItems();
				vouchForm.viewSuccessMessage();

			} else {
				vouchForm.viewErrorMessage();
			}
		}
	}

	public boolean visaPay(Visa visa) {
		return true;
	}

	public boolean verifyVoucherValue(int value, int price) {
          if(value>price)
		  {return false;}
		  else{return true;}
	}

	public void payOnDelivery(String address) {

	}

	public void sendMail(String address, String email) {

	}

	public boolean verifyCardNo(String visa) {
		return true;
	}

}
