package com.hackerrank.cracking.coding;

import java.util.Scanner;

public class RecorsionFibonacci {

	  private static Integer fib[]=new Integer[40];
	    
	    public static int fibonacci(int n) {
	        if(fib[n]==null){
	            fib[n]=fibonacci(n-1)+fibonacci(n-2);
	        }
	        return fib[n];
	      
	    }
	    

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        scanner.close();
	        fib[0]=0;
	        fib[1]=1;
	        System.out.println(fibonacci(n));
	    }
}
