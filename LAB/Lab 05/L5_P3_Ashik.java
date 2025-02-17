import java.io.*;
import java.util.*;
import java.lang.*;
import javax.swing.*;
class L5_P3_Ashik
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		Line [] array1=new Line[4];
		Line [] array2=new Line[4];
		int i,j,x1,y1,x2,y2;
		for(i=0;i<2;i++)
		{
			x1=input.nextInt();
			y1=input.nextInt();
			x2=input.nextInt();
			y2=input.nextInt();
			array1[i]=new Line(x1,y1,x2,y2);
		}
		
		System.out.println(isIntersecting(array1[0],array1[1]));
		System.out.println("Line1: "+array1[0].toString());
		System.out.println("Line2: "+array1[1].toString());
		System.out.println("Slope: "+array1[0].findSlope());
		System.out.println("Slope: "+array1[1].findSlope());
		



	}//main ends
	public static boolean isIntersecting(Line l1,Line l2)
	{
		if(l1.findSlope()==l2.findSlope())
		{
			return false;

		}
		else
		{
			return true;
		}
	}
}//class ends
	class Line
	{
		private int x1;
		private int y1;
		private int x2;
		private int y2;
		//constructor with arg
		Line(int x1,int y1, int x2, int y2)
		{
			this.x1=x1;
			this.y1=y1;
			this.x2=x2;
			this.y2=y2;
		}
		public String toString()
		{
		return this.x1 + " " + this.y1 + " and " + this.x2 + " "+this.y2;
		}
		public double findSlope()
		{
			return (this.y2-this.y1)*1.0/(this.x2-this.x1);
			
		}

	}//Line ends

