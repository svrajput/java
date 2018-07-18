
public class DebitCardPayment implements PaymentModeInterface {

	@Override
	public boolean processPayment() {
		System.out.println( "Debit Card Payment Process is Sucessful" );
		return true;
	}

}
