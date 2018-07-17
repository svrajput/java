public class iLogger  {
		 
	private int i = 10;
	
	/* 
	 * Please be sure to use “volatile” keyword with instance variable otherwise you can 
	 * run into an out of order write error scenario, where reference of an instance is 
	 * returned before actually the object is constructed i.e. JVM has only allocated the 
	 * memory and constructor code is still not executed. In this case, your other thread, 
	 * which refer to uninitialized object may throw null pointer exception and can even 
	 * crash the whole application.
	 * 
	 * create instance variable
	*/ 
	private volatile static iLogger instance = null;
		
	// static method to return instance object
	public static iLogger getInstance() {
		if (instance == null ) {
			instance = new iLogger(); 
		}
		return instance;
	}
	
	public int getI() {
		return i;
	}
	
	public void setI(int val) {
		this.i = val;
	}
	
}