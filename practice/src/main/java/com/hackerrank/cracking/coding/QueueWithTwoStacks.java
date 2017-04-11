package com.hackerrank.cracking.coding;

import java.util.Scanner;
import java.util.Stack;

public class QueueWithTwoStacks {

	public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

class MyQueue<T>{
	Stack<T> stack1=new Stack<T>();
	Stack<T> stack2=new Stack<T>();
	T front=null;
	boolean firstElement=true;
	
	public void enqueue(T x){
		stack1.push(x);
		if(firstElement){
			front=x;
			firstElement=false;
		}
	}
	
	public T dequeue(){
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		T rear=stack2.pop();
		if(stack2.isEmpty()){//refill
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty() && stack1.isEmpty()){
			front=null;
			firstElement=true;
		}else{
			front=stack2.peek();
		}
		return rear;
	}
	
	public T peek(){
		return front;
	}
}
