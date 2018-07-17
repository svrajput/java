
public class PaymentFactoryDemo {
	
	public static void main(String[] args) {
		PaymentFactory paymentFactory = new PaymentFactory();
		
		//Debit Card payment
		CardPaymentInterface debitCard = paymentFactory.getPaymentType("DEBITCARDPAYMENT");
		debitCard.makePayment(); 
		
		//Credit Card Payment
		CardPaymentInterface creditCard = paymentFactory.getPaymentType("CREDITCARDPAYMENT");
		creditCard.makePayment();
	}		
	
}
