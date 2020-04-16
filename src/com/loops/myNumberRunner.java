package com.loops;

public class myNumberRunner {

	public static void main(String[] args) {
       myNumber number = new myNumber(8);
       boolean isPrime=number.isPrime();
       System.out.println("isPrime"+ isPrime);
       int sum = number.sumUpToN();
       System.out.println("SumUpToN"+ sum );
       
	}

}
