package com.hackerrank.cracking.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapRansomNote {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int m = in.nextInt();
	        int n = in.nextInt();
	        String magazine[] = new String[m];
	        for(int magazine_i=0; magazine_i < m; magazine_i++){
	            magazine[magazine_i] = in.next();
	        }
	        String ransom[] = new String[n];
	        for(int ransom_i=0; ransom_i < n; ransom_i++){
	            ransom[ransom_i] = in.next();
	        }
	        System.out.println(isRansomPossible(magazine,ransom)?"Yes" : "No");

	}

	private static boolean isRansomPossible(String[] magazine, String[] ransom) {
		Map<String , Integer> magMap=getMap(magazine);
		Map<String , Integer> ranMap=getMap(ransom);
		
		for(String s : ranMap.keySet()){
			if(!magMap.containsKey(s)){
				return false;
			}else{
				int freqDiff=magMap.get(s)-ranMap.get(s);
				if(freqDiff<0){
					return false;
				}
			}
		}
		return true;
	}

	private static Map<String, Integer> getMap(String[] stringArray) {
		Map<String , Integer> map=new HashMap<String , Integer>();
		for(String s: stringArray){
			if(!map.containsKey(s)){
				map.put(s, 1);
			}else{
				map.put(s, map.get(s)+1);
			}
		}
		return map;
	}

}
