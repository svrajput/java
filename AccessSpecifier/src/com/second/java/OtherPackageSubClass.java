package com.second.java;

import com.firstpackage.java.Data;

public class OtherPackageSubClass extends Data {
	public void test() {
		
		Data d = new Data();
		PublicT pt = d.new PublicT(); 
		ProtectedT ptd = d.new ProtectedT(); 
		
		System.out.println("Data Class Public T varible"  + this.publicVariable );
		System.out.println("Data Class protectedVariable varible" + this.protectedVariable );
	}
}
