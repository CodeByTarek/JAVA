import java.io.*;
import java.lang.*;
import java.util.Scanner;
class L3P3{
	public static void main(String[] args)
	{
		System.out.print("Enter the numbers of rows and columns of the array: ");
		Scanner input=new Scanner(System.in);
		int r,c,i,j,hr,hc;
		;
		r=input.nextInt();
		c=input.nextInt();
		double [][]b=new double [r][c];
		System.out.println("Enter the array: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				b[i][j]=input.nextDouble();
				
				
				
			}
			
		}
		int [] loc= locateLargest(b);
		
		System.out.println("The location of the largest element is at ("+loc[0]+" ,"+loc[1]+")");
	}
	public static int[] locateLargest(double[][]a)
	{
		int hc,hr,i,j;
		int [] loc={0,0};
		double max=a[0][0];
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				
				if(max<a[i][j])
				{
					max=a[i][j];
					loc[0]=i;
					loc[1]=j;
				}
				
				
			}
			
		}
		
		return loc;
		
	}
	
}
