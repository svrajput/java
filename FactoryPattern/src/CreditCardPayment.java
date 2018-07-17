
public class CreditCardPayment implements CardPaymentInterface {

	@Override
	public void makePayment() {
		System.out.println( "Inside Credit Card Payment Method" );
	}
	
}
