import java.io.*;
import java.lang.*;
import java.util.Scanner;

class L3_P1_Ashik{
	public static void main(String[] args){
		int i, j, sum = 0, count = 0, max = 0, ri = 0, temp = 0;

		int [][]A = {{2,4,3,4,5,8,8},
						{7,3,4,3,3,4,4},
							{3,3,4,3,3,2,2},
								{9,3,4,7,3,4,1},
									{3,5,4,3,6,3,8},
										{3,4,4,6,3,4,4},
											{3,7,4,8,3,8,4},
												{6,3,5,9,2,7,9}};
		int []B = new int [A.length];
		int []emp = {0,1,2,3,4,5,6,7};
												
		for(i = 0; i < A.length; i++){
			for(j = 0; j < A[i].length; j++){
				sum = sum + A[i][j];
			}
			B[i] = sum;
			sum = 0; 
		}		
		
		for(i = 0; i < A.length - 1; i++)
		{
			for(j=i+1;j<=A[i].length;j++)
			{
				if(B[i]<B[j])
				{
					temp=B[i];
					B[i]=B[j];
					B[j]=temp;
					count=emp[i];
					emp[i]=emp[j];
					emp[j]=count;
					
				}
			}
			
		}
		for(i=0;i<A.length;i++)
		{
			System.out.println("Employee "+emp[i]+" = "+B[i]);
		}
		
		
	}
}