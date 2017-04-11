package com.hackerrank.cracking.coding;

import java.util.Scanner;

public class FindUnique {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            
        }
        System.out.println(findUnique(a));
    }
    private static  int findUnique(int[] a){
        int unique=0;
        for(int i: a){
            unique^=i;
        }
        return unique;
    }

}
