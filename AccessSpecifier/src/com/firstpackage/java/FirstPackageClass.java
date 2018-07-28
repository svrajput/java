package com.firstpackage.java;

//Import PublicT class into class exist in same package.
//import com.firstpackage.java.Data.PublicT;

public class FirstPackageClass {

	public static void main(String args[]) {
		//Create outer class Object
		Data d = new Data();
		
		//Create inner public class object using outer class 
		Data.PublicT publicTObj = d.new PublicT();
		
		//Create inner protected class object using outer class
		Data.ProtectedT protectedTObj = d.new ProtectedT(); 
		
		//Create inner default class object using outer class
		Data.DefaultT defaultTObj = d.new DefaultT(); 
		
		//Create inner private class object using outer class - It will not work as its not visible.
		
		
		//Instance Variable defined inside Data class ( Outer class ) 
		System.out.println( "Data defaultVariable" +  d.defaultVariable );
		System.out.println( "Data protectedVariable" + d.protectedVariable);
		System.out.println( "Data publicVariable" + d.publicVariable );
		
		//public Inner class 
			// public method can be accessed.
			publicTObj.publicMethod();

			// protected method can be accessed.
			publicTObj.protectedMethod();
		
			// default method can be accessed.
			publicTObj.defaultMethod();
		
			// private method can not be access- editor shows warning method is not visible
			// publicTObj.privateMethod();
		
		
		//Protected Inner Class
			// protected method can be accessed.
			
			// protected method can be accessed.
			protectedTObj.protectedMethod();
		
		defaultTObj.defaultMethod(); 
		
	}
}
 