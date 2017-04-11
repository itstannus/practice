package techgig.deloitte.contest;

import java.io.IOException;
import java.util.Scanner;

public class GetJumpCount {


    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        int ip2 = Integer.parseInt(in.nextLine().trim());
        int ip3_size = 0;
        ip3_size = Integer.parseInt(in.nextLine().trim());
        int[] ip3 = new int[ip3_size];
        int ip3_item;
        for(int ip3_i = 0; ip3_i < ip3_size; ip3_i++) {
            ip3_item = Integer.parseInt(in.nextLine().trim());
            ip3[ip3_i] = ip3_item;
        }
        output = GetJumpCount(ip1,ip2,ip3);
        System.out.println(String.valueOf(output));
    }
    
    public static int GetJumpCount(int X,int Y,int[] heights)
    {
    	int steps=0;
	    for(int i=0;i<heights.length;i++){
	    	int height=heights[i];
	    	int meters=X;
	    	steps++;
	    	while(meters<height){
	    		meters-=Y;
	    		meters+=X;
	    		steps++;
	    	}
	    }
	    return steps;
    }


}
