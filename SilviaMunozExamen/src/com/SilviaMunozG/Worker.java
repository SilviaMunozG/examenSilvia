package com.SilviaMunozG;

public interface Worker {
	
	public void getPayment();
	
	public default void clockIn() {
		System.out.println("Ha fichado");
	}
	

}
