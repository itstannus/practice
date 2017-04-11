package com.hackerrank.cracking.coding;

public class CheckBST {
//	The Node class is defined as follows:
//	    class Node {
//	        int data;
//	        Node left;
//	        Node right;
//	     }
//	
//	    boolean checkBST(Node root) {
//	        if(root.left==null && root.right==null){
//	            return true;
//	        }
//	        boolean isLeftBST=false, isRightBST=false;
//	        if(root.left!=null){
//	            if(root.left.data<root.data){
//	                isLeftBST=checkBST(root.left);
//	            }else{
//	                return false;
//	            }
//	        }else{
//	            return true;
//	        }
//	        if(root.right!=null){
//	            if(root.right.data>root.data){
//	                isRightBST=checkBST(root.right);
//	            }else{
//	                return false;
//	            }
//	        }else{
//	            return true;
//	        }
//	        return (isLeftBST && isRightBST);
//	    }
//
//	 private List<Integer> array=new ArrayList<Integer>();
//
//	    boolean checkBST(Node root) {
//	      inorder(root);
//	      boolean ordered=checkOrder();
//	      return ordered;
//	    }
//
//	    public void inorder(Node root){
//	        if(root==null){
//	            return;
//	        }
//	        inorder(root.left);
//	        array.add(root.data);
//	        inorder(root.right);
//	    }
//	    public boolean checkOrder(){
//	        int len=array.size();
//	        //skip last index
//	        for(int i=0; i<len-1;i++){
//	            if(array.get(i)>=array.get(i+1)){
//	                return false;
//	            }
//	        }
//	        return true;
//	    } 
}
