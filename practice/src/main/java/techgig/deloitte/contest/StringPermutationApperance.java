package techgig.deloitte.contest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringPermutationApperance {
	 public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        int output = 0;
	        int ip1 = Integer.parseInt(in.nextLine().trim());
	        int ip2 = Integer.parseInt(in.nextLine().trim());
	        String ip3 = in.nextLine().trim();
	        String ip4 = in.nextLine().trim();
	        output = appearanceCount(ip1,ip2,ip3,ip4);
	        System.out.println(String.valueOf(output));
	    }
	 
	 public static int appearanceCount(int n1,int n2,String w,String s)
	    {
		 	int appearCount=0;
		 	Map<Character,Integer> wMap=getMap(w);
		 	for(int i=0;i< (n2-n1+1); i++){
		 		boolean isAnagram=true;
		 		String tmp=s.substring(i, i+n1);
		 		Map<Character,Integer> tmpMap=getMap(tmp);
		 		for(Character c: wMap.keySet()){
		 			if(!tmpMap.containsKey(c)){
		 				isAnagram=false;
		 				break;
		 			}else{
		 				int count=tmpMap.get(c)-wMap.get(c);
		 				tmpMap.remove(c);
		 				if(count!=0){
		 					isAnagram=false;
			 				break;
		 				}
		 			}
		 		}
		 		if(tmpMap.size()>0){
		 			isAnagram=false;
		 		}
		 		if(isAnagram){
		 			appearCount++;
		 		}
		 	}
		 	
		 	return appearCount;
		 	
		  
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
