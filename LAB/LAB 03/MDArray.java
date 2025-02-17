import java.io.*;
import java.lang.*;
import java.util.*;

class MDArray{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int m, n;
	System.out.println("Enter " + A.length + " i and " + A[0].length + " j: ");
	m = input.nextInt();
	n = input.nextInt();

	int[][]A = new int[i][j];
	for(int i = 0; i < A.lentgh; i++){
		for (int j = 0; j < A.length; j++){
	A[i][j] = input.nextInt();
}
	}
	for(int i = 0; i < A.length; i++){
		for(int j = 0; j < A[0].length;j++){
			System.out.print(A[i][j]+ " ");
		}
	}

	for (int i = 0; i < A[0].length; i++){
		int total = 0;
		for (int j = 0; j < A.length; j++)
			total += A[i][j];
		System.out.println("Sum for i " + i + " is "+ total);

	}
	for (int j = 0; j < A[0].length; j++){
		int total = 0;
		for (int i = 0; i < A.length; i++)
			total += A[i][j];
		System.out.println("Sum for j " + j + " is "+ total);
		
	}
	}
}