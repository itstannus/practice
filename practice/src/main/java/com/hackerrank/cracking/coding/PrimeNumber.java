package com.hackerrank.cracking.coding;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            isPrime(n);
        }
    }
    private static void isPrime(int n){
        
        if(n<=1 || (n>2 && n%2==0) ){
            System.out.println("Not prime");
            return;
        }
        
        for(int i=3; i<=Math.sqrt(n);i+=2){
            if(n%i == 0 ){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
        
    }

}
