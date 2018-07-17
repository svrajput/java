
public class DebitCardPayment implements CardPaymentInterface {

	@Override
	public void makePayment() {
		System.out.println( "Inside Debit Card Payment Method" );		
	}

}
