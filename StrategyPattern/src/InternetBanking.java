
public class InternetBanking implements PaymentModeInterface {

	@Override
	public boolean processPayment() {
		System.out.println( "Internet Banking Payment failed " );
		return false;
	}

}
