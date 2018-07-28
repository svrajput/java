package com.firstpackage.java;

public class FirstPackageSubClass extends Data {

	public static void main(String args[]) {
	
		Data d = new Data();
		
		System.out.println( "Default Variable :" + d.defaultVariable );
		
		System.out.println( "protectedVariable Variable :" + d.protectedVariable );
		
		System.out.println( "publicVariable Variable :" + d.publicVariable );
		
		PublicT publicTObj = d.new PublicT();   
		publicTObj.publicMethod();
		publicTObj.defaultMethod();
		publicTObj.protectedMethod();
		
		/* privateMethod is not visible - 
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		 */
		// publicTObj.privateMethod();
		
		
	}
}
