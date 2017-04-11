package com.hackerearth.amazon;

import java.util.Scanner;

public class MaximumSubarray {
	
    public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int i = 0; i < T; i++) {
            int n=s.nextInt();
            int[] nums=new int[n];
            for(int j=0;j<n;j++){
                nums[j]=s.nextInt();
            }
            if(isAllNegatives(nums)){
                int max=Integer.MIN_VALUE;
                for(int num: nums){
                    if(max<num){
                        max=num;
                    }
                }
                System.out.println(max+" "+max);
                continue;
            }
            System.out.println(maxContigSum(nums)+" "+ maxNonContigSum(nums));
        }
        
        
    }
    
    private static int maxNonContigSum(int[] nums){
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum<0){
                sum=0;
            }
            if(nums[i]>0){
                sum+=nums[i];
            }
        }
        return sum;
    }
    
    private static int maxContigSum(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        int cs=nums[0];
        int max_sum=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(max_sum<cs){
                max_sum=cs;
            }
            cs=Math.max(cs+nums[i],nums[i]);
        }
        if(max_sum<cs){
            max_sum=cs;
        }
        return max_sum;
    }
     private static boolean isAllNegatives(int[] nums){
         for(int num: nums){
             if(num>0){
                 return false;
             }
         }
         return true;
     }
     
     

}
