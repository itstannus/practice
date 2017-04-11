package com.hackerrank.cracking.coding;

import java.util.Scanner;
import java.util.Stack;

public class StackBalancedBrackets {

public static boolean isBalanced(String expression) {
    Stack<Character> stack=new Stack<Character>();    
    for(int i =0; i< expression.length();i++){
    	char c=expression.charAt(i);
    	if(c=='{'||c=='['|| c=='('){
    		stack.push(c);
    	}else{
    		if(stack.isEmpty()){
    			return false;
    		}else{
    			char top=stack.pop();
    			switch(c){
    			case '}' : if(top!='{'){
			    				return false;
			    			}
			    			break;
    			case ']' : if(top!='['){
			    				return false;
			    			}
			    			break;
    			case ')' : if(top!='('){
			    				return false;
			    			}
			    			break;
    			}
    		}
    	}
    }
    if(!stack.isEmpty()){
    	return false;
    }
	return true;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
