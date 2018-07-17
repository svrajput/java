public class iLogger  {
	
	//private static final Long serialVersionUID = 1L;
	 
	private int i = 10;
	
	// create instance variable. 
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