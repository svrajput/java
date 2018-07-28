package com.second.java;

import com.firstpackage.java.Data; 

public class OtherPackageClass {

	public static void main(String args[]) {
		Data d = new Data(); 
		System.out.println( "data class publicVariable " + d.publicVariable );
	}
}