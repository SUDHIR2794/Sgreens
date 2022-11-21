package org.edu;

public class Education extends Engineering {//child class
	private void ug() {
		System.out.println("bsc computer science");
	}
	private void pg() {
		System.out.println ("msc computer science");
	}
	
	public static void main (String [] args) {
		Education a = new Education() ;
		
		a.ug();
		a.pg();
		a.bsc();
		a.ba();
		a.bba();
		a.physiyo();
		a.dental();
		a.mbbs();
		a.be();
		a.btech();
			
		
		
	}

}
