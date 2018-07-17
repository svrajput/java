
public class PaymentFactory {
	
	public CardPaymentInterface getPaymentType( String paymentType ) {
		
		if (  paymentType == null ) {
			return null;
		}
		else if ( paymentType.equalsIgnoreCase("CREDITCARDPAYMENT") ) {
			return new CreditCardPayment();
		}
		else if( paymentType.equalsIgnoreCase("DEBITCARDPAYMENT") ) {
			return new DebitCardPayment();
		}
		
		return null;
	}
	
}
