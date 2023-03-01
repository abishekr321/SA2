package mockinterview;

import java.util.Scanner;

public class pattern {
	public static void main(String[]args) {
		/*int[][] matrix=new int[8][8];
		int k=1;
		for(int col=0;col<8;col++) {
			for(int row=col;row<8;row++) {
				matrix[row][col]=k++;
			}
		}
		for(int row=0;row<8;row++) {
			for(int col=0;col<8;col++) {
				if(matrix[row][col]!=0)
				System.out.print(matrix[row][col]+" ");
				
			}
			System.out.println();
		}
	}*/
	 Scanner scanner =new Scanner(System.in);
	 int n=scanner.nextInt();
	 for(int i=1;i<=n;i++) {
		 int k=3;
		 for(int j=0;j<i;j++) {
			 if(j==0) {
				 System.out.print(i+" ");
			 }
			 else {
				 System.out.print((i+j+k)+" ");
				 k++;
			 }
			 
			 
		 }
		 System.out.println();
	 }
		 
	 }
	

}
