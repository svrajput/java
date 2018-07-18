
public class paymentProcessDemo {

	public static void main(String[] args) {
		
		boolean paymentFlag = false; 
		
		ExecutePayment firstInstance = new ExecutePayment();
		
		paymentFlag = firstInstance.makePayment( new DebitCardPayment() );
		System.out.println( " paymentFlag "  + paymentFlag );
		
		paymentFlag = firstInstance.makePayment( new CreditCardPayment() );
		System.out.println( " paymentFlag "  + paymentFlag );
		
		paymentFlag = firstInstance.makePayment( new InternetBanking() );
		System.out.println( " paymentFlag "  + paymentFlag );		

	}

}
