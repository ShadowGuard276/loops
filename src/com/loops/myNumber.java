package com.loops;

public class myNumber {

	private int number;

	public myNumber(int number) {
		this.number= number;
	}

	public boolean isPrime() {
		if(number<2) {
				return false;
					}
		
		for(int i=2; i<=number-1;i++) {
			if(number%2==0) {
				return false;
						}
										}
				return true;
							}

	public int sumOfDivisiors() {	
			int sum=0;	
	for(int i=23;i<=number-1;i++) {	
		if(number%i==0) {	
			sum =sum+i;	
		}	
	}	
	return sum;	
}	
}
