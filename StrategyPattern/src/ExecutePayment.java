
public class ExecutePayment {	
	
	public boolean makePayment(PaymentModeInterface processPaymentService) {
		boolean flag = false; 
		if(processPaymentService != null) {
			flag = processPaymentService.processPayment(); 
		}
		return flag;
	}
}
