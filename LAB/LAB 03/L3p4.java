import java.io.*;
import java.lang.*;
import java.util.Scanner;
class L3p4{

	public static void main(String[] args){
		int[][] array = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};

		
		sort(array);
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print("{");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
				
			}
			System.out.print("}");
		}
		System.out.print("}");
		
	}

	
	public static void sort(int m[][]) {
		int[] min = new int[2];
		for (int r = 0; r < m.length - 1; r++) {
			min[0] = m[r][0]; 
			min[1] = m[r][1]; 
			int index = r;
			for (int i = r + 1; i < m.length; i++) {
				if (m[i][0] <= min[0] && (m[i][0] < min[1] || 
					 m[i][1] < min[0] || m[i][1] < min[1])) { 
					min[0] = m[i][0];
					min[1] = m[i][1];
					index = i;
				}
			}
			if (index != r){
				m[index][0] = m[r][0];
				m[index][1] = m[r][1];
				m[r][0] = min[0];
				m[r][1] = min[1]; 
			}
		}
	}
}