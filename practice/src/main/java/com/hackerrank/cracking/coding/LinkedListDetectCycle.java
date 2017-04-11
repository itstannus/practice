package com.hackerrank.cracking.coding;

public class LinkedListDetectCycle {

	class Node {
        int data;
        Node next;
    } 
	boolean hasCycle(Node head) {
	    
	    if(head==null){
	        return false;
	    }
	    Node slow= head;
	    Node fast=null;
	    if(head.next!=null){
	        fast=head.next.next;
	    }
	    
	    while(fast!=null){
	        if(slow==fast){
	            return true;
	        }
	        slow=slow.next;// 1 hop at a time
	        if(fast.next!=null){
	            fast=fast.next.next;
	        }else{
	            return false;
	        }
	        
	        
	    }
	    return false;

	}

}
