package com.hackerrank.cracking.coding;

import java.util.Scanner;

public class BubbleSort {


	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        bubbleSort(a,n);
	    }
	    private static void bubbleSort(int[] a, int n){
	        int numOfSwaps=0;
	        for(int i=0;i<n;i++){
	            boolean isSwapped=false;
	            for(int j=0;j<n-1-i;j++){
	                if(a[j]>a[j+1]){
	                    //swap
	                    isSwapped=true;
	                    int temp=a[j];
	                    a[j]=a[j+1];
	                    a[j+1]=temp;
	                    numOfSwaps++;
	                }
	            }
	            if(!isSwapped){
	                break;
	            }
	        }
	        System.out.println("Array is sorted in "+numOfSwaps+" swaps.");
	        System.out.println("First Element: "+a[0]);
	        System.out.println("Last Element: "+a[a.length==0?0:a.length-1]);
	    } 

}
