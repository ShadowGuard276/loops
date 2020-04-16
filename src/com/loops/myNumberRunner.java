package com.loops;

public class myNumberRunner {

	public static void main(String[] args) {
       myNumber number = new myNumber(7);
       boolean isPrime=number.isPrime();
       System.out.println("isPrime"+ isPrime);
       int sum = number.sumUpToN();
       System.out.println("SumUpToN"+ sum );
       int sumOfDivisiors= number.sumOfDivisiors();	
       System.out.println("sumOfDivisiors"+ sumOfDivisiors);
	}

}
