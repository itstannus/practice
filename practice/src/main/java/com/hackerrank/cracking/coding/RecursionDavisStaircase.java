package com.hackerrank.cracking.coding;

import java.util.Scanner;

public class RecursionDavisStaircase {

	static Integer ways[]=new Integer[37];//steps height max 37 allowed

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        ways[0]=0;
        ways[1]=1;
        ways[2]=2;
        ways[3]=4;
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(noOfWays(n,ways));
        }
    }
    private static int noOfWays(int n,Integer[] ways){
        if(n<=0){
            return 0;
        }
        if(ways[n]==null){
        	ways[n]=noOfWays(n-3,ways)+noOfWays(n-2,ways)+noOfWays(n-1,ways);
        }
        return ways[n];
    }

}
