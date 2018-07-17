public class singletonDemo {

	public static void main (String[] args) {
		
		// Invalid code
		// iLogger loggerObj = new iLogger();
		
		iLogger singletonObj = iLogger.getInstance();
		
		singletonObj.setI(20);
		System.out.println( singletonObj.getI() );
		
	}
}
