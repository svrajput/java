
public class CreditCardPayment implements PaymentModeInterface {

	@Override
	public boolean processPayment() {
		System.out.println( "Debit Card Payment Process was sucessful" );
		return true;
	}

}
