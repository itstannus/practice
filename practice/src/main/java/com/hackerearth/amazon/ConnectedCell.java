package com.hackerearth.amazon;

import java.util.Scanner;

public class ConnectedCell {

	public static void main(String args[] ) throws Exception {
//        /*
//         * Read input from stdin and provide input before running
//         * Use either of these methods for input

		Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int[][] matrix = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=scan.nextInt();
            }
        }
        
        System.out.println(connectivity(rows,columns,matrix));
    }

//	private static int connectivity(int rows, int columns, int[][] matrix) {
//		int max=0;
//		for(int i=0;i<rows;i++){
//			for(int j=0;j<columns; j++){
//				if(matrix[i][j]==1){
//					int count=0;
//					count+=checkRange(matrix, i ,j,rows,columns);
//					if(max<count){
//						max=count;
//					}
//				}
//			}
//		}
//		
//		return max;
//	}
//
//	private static int checkRange(int[][] matrix, int i, int j,int rows,int columns) {
//		if(i<0 || j<0 || i>(rows-1) || j>(columns-1)){
//			return 0;
//		}
//		if(matrix[i][j]==1){
//			matrix[i][j]=-1;
//			return (1+checkRange(matrix, i-1 ,j,rows,columns)+checkRange(matrix, i ,j-1,rows,columns)+checkRange(matrix, i+1 ,j,rows,columns)+checkRange(matrix, i ,j+1,rows,columns)
//			+checkRange(matrix, i+1 ,j+1,rows,columns)+checkRange(matrix, i+1 ,j-1,rows,columns)+checkRange(matrix, i-1 ,j+1,rows,columns)+checkRange(matrix, i-1 ,j-1,rows,columns));
//		}
//		return 0;
//	}
	
	private static int connectivity(int r, int c, int[][] matrix){
        int max=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==1){
                    int count=0;
                    count+=checkRange(matrix,i,j,r,c);
                    if(max<count){
                        max=count;
                    }
                }
            }
        }
        
        return max;
    }
    
    private static int checkRange(int[][] m, int i, int j, int r , int c){
        if(i<0 || j<0 || i>(r-1) || j>(c-1) ){
            return 0;
        }
        if(m[i][j]==1){
            m[i][j]=-1;
            return (1+ checkRange(m,i-1,j,r,c) + checkRange(m,i,j-1,r,c) + checkRange(m,i+1,j,r,c) + checkRange(m,i,j+1,r,c) 
            + checkRange(m,i+1,j+1,r,c) + checkRange(m,i+1,j-1,r,c) + checkRange(m,i-1,j+1,r,c) + checkRange(m,i-1,j-1,r,c) );
        }
        return 0;
    }
	

}
