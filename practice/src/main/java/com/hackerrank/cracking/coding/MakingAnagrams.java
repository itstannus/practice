package com.hackerrank.cracking.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakingAnagrams {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    } 

	 public static int numberNeeded(String first, String second) {
	      Map<Character,Integer> firstMap=getMap(first);
	      Map<Character,Integer> secondMap=getMap(second);
	      int count=0;
	      for(Character c: firstMap.keySet()){
	    	  if(!secondMap.containsKey(c)){
	    		  count+=firstMap.get(c);
	    	  }else{
	    		  count+=(Math.abs(firstMap.get(c)-secondMap.get(c)));
	    		  secondMap.remove(c);
	    	  }
	      }
	      //chars still exists in second dtring to be deleted
	      if(secondMap.size()>0){
	    	  for(Character c: secondMap.keySet()){
	    		  count+=secondMap.get(c);
	    	  }
	      }
	      return count;
	    }
	  
	    private static Map<Character, Integer> getMap(String input) {
	    	Map<Character, Integer> map= new HashMap<Character,Integer>();
	    	for(int i=0; i<input.length(); i++ ){
	    		if(!map.containsKey(input.charAt(i))){
	    			map.put(input.charAt(i), 1);
	    		}else{
	    			map.put(input.charAt(i), map.get(input.charAt(i))+1);
	    		}
	    	}
	    	return map;
	   }

		
}
