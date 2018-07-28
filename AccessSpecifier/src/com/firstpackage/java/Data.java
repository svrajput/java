package com.firstpackage.java;

public class Data {
	
	private int privateVariable = 50;
	
	int defaultVariable = 40; //default specifier or package specifier. 
	
	protected int protectedVariable = 30; 
	
	public int publicVariable = 10;

	//Inner Classes
	private class PrivateT {
		
		public void privateMethod() {
			int x = privateVariable;
			System.out.println( " Inside PrivateT method of PrivateT class " );
		}
	}; 
	
	class DefaultT{
		
		public void publicMethod() {
			System.out.println( " Inside PublicT method of DefaultT class" );
		}

		public void protectedMethod() {
			System.out.println( " Inside protectedT method of DefaultT class" );
		}		
		
		public void defaultMethod() {
			System.out.println( " Inside defaultT method of DefaultT class"  );
		}

		public void privateMethod() {
			System.out.println( " Inside PrivateT method of DefaultT class " );
		}		
	}; 
	
	protected class ProtectedT{

		public ProtectedT() {
			
		}
		
		public void publicMethod() {
			System.out.println( " Inside PublicT method of protectedT class" );
		}

		protected void protectedMethod() {
			System.out.println( " Inside protectedT method of protectedT class" );
		}		
		
		void defaultMethod() {
			System.out.println( " Inside defaultT method of protectedT class"  );
		}

		private void privateMethod() {
			System.out.println( " Inside PrivateT method of protectedT class " );
		}
		
	};
	
	public class PublicT{
		public void publicMethod() {
			System.out.println( " Inside PublicT method of PublicT class" );
		}
		
		protected void protectedMethod() {
			System.out.println( " Inside protectedMethod method of PublicT class" );
		}
		
		void defaultMethod() {
			System.out.println( " Inside defaultT method of PublicT class"  );
		}

		private void privateMethod() {
			System.out.println( " Inside PrivateT method of PublicT class " );
		}
	}; 
	
	
	private void foo() {
		int x = privateVariable; 
	}
	
	public static void main(String args[]) {
		Data d = new Data(); 
		PrivateT pt = d.new PrivateT();
		PublicT pb = d.new PublicT();
		d.privateVariable = 60;
	}
	
}
