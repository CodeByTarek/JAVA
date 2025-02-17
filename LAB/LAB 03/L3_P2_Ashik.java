import java.io.*;
import java.lang.*;
import java.util.Scanner;
class L3_P2_Ashik{
	public static void main(String[] args){
		int i,j,sum=0,count=0,max=0,ri=0;
		Scanner input=new Scanner(System.in);
		int [][]A=new int [4][4];
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				A[i][j]=(int)(Math.random()*2);
			}
		}
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("The largest row index: ");
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(A[i][j]==1)
				{
					sum=sum+A[i][j];
				}
			}
			if(max<sum)
			{
				max=sum;
				ri=i;
			}
			sum=0;
			
			
		}
		System.out.println(ri);
		ri=0;
		System.out.print("The largest column index: ");
		for(j=0;j<4;j++)
		{
			for(i=0;i<4;i++)
			{
				if(A[i][j]==1)
				{
					sum=A[i][j]+sum;
				}
			}
			if(max<sum)
			{
				max=sum;
				ri=j;
			}
			sum=0;
			
			
		}
		System.out.println(ri);
		
	}
}