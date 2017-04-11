package com.hackerrank.cracking.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class RunningMedianHeapPriorityQueue {
	private static Queue<Integer> heap=new PriorityQueue<Integer>();

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> a = new ArrayList<Integer>();
        for(int a_i=0; a_i < n; a_i++){
            a.add( in.nextInt());
            findMedian(a);
            
        }
    }

	private static void findMedian(List<Integer> a) {
		heap.addAll(a);
		
		List<Integer> sortedList=new ArrayList<Integer>();
		while(!heap.isEmpty()){
			sortedList.add(heap.poll());
		}
		int mid=sortedList.size()/2;
		if(sortedList.size()%2 == 0){//even number of elements
			System.out.println((double)(sortedList.get(mid)+sortedList.get(mid-1))/2);
		}else{
			System.out.println((double)sortedList.get(mid));
		}
		
	}

}
