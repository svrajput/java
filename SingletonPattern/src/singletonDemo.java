
public class singletonDemo {

	public static void main (String[] args) {
		
		// Invalid code
		// iLogger loggerObj = new iLogger();
		
		//First instance request
		iLogger singletonObj1 = iLogger.getInstance();
		
		// change value for variable i
		singletonObj1.setI(20);
		
		//print value of i
		System.out.println( singletonObj1.getI() );
		
		//2nd instance request
		iLogger singletonObj2 = iLogger.getInstance();
		//print value of i
		System.out.println( singletonObj2.getI() );
		
	}
}
