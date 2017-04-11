package com.hackerrank.cracking.coding;

import java.util.Scanner;

public class ArrayLeftRotation {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        a=leftRotateInplace(a, n, k);
	        printArray(a);
	    }

	private static int[] leftRotateInplace(int[] a, int n, int k) {
		//1. reverse entire array
		reverse(a,0,n);
		//2. reverse first part
		reverse(a,0,n-k);
		//3. reverse last part
		reverse(a,n-k,k);
		return a;
	}
	
	private static void reverse(int[] a, int start, int len){
		int end=len+start;
		for(int i=start; i< ((end+start)/2); i++){
			int tmp= a[i];
			a[i]=a[end-1-i+start];
			a[end-1-i+start]=tmp;
		}
	}

	private static int[] leftRotate(int[] a, int n, int k) {
		int[] copy=new int[n];
		int i;
		//final arrays last part
		for(i=0; i<k;i++){
			copy[n-k+i]=a[i];
		}
		//final arrayts first part
		for(;i<n;i++){
			copy[i-k]=a[i];
		}
		return copy;
		
		
	}
	private static void printArray(int[] a){
		for(int elem : a){
			System.out.print(elem+ " " );
		}
	}
}
