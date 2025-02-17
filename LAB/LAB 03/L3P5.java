import java.io.*;
import java.lang.*;
import java.util.Scanner;
class L3P5{
	public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			int i,j;
			double [][]A=new double [2][2];
			double []B=new double [2];
		System.out.print("Enter the value of a00,a01,a10,a11: ");
		for(i=0;i<A.length;i++)
		{
			for(j=0;j<A[i].length;j++)
			{
				A[i][j]=input.nextDouble();
			}
		}
		System.out.print("Enter the value of b0,b1: ");
		for(j=0;j<B.length;j++)
			{
				B[j]=input.nextDouble();
			}
			double []loc=linearEquation(A,B);
			if(loc[2]==0.0 || loc[2]==0)
			{
				System.out.println("The equation has no solution");
			}
			else
			{
				System.out.println("x = "+loc[0]+" and y = "+loc[1]);
			}
		
	}
	public static double[]linearEquation(double[][]a,double[]b)
	{
		double []loc={0,0,0};
		int i,j;
		loc[0]=((b[0]*a[1][1])-(b[1]*a[0][1]))/((a[0][0]*a[1][1])-(a[0][1]*a[1][0]));
		loc[1]=((b[1]*a[0][0])-(b[0]*a[1][0]))/((a[0][0]*a[1][1])-(a[0][1]*a[1][0]));
		loc[2]=((a[0][0]*a[1][1])-(a[0][1]*a[1][0]));
		return loc;
	}
	
}
