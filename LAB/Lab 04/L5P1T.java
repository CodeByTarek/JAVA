import java.io.*;
import java.lang.*;
import java.util.*;
import javax.swing.*;

class L5P1T{
	public static void main(String[] args){
		double area,perimeter,l,w;

		String length = JOptionPane.showInputDialog(null, "Enter the length:", "Input",JOptionPane.QUESTION_MESSAGE);
		l = Double.parseDouble(length);

		String width = JOptionPane.showInputDialog(null, "Enter width", "Input",JOptionPane.QUESTION_MESSAGE);
		w = Double.parseDouble(width);

		area = (l*w) ;
		perimeter = 2*(l*w);

		if(l > 0 && w > 0){
			JOptionPane.showMessageDialog(null,"Area: "+area +" and Perimeter: "+perimeter +" ","RESULT",JOptionPane.INFORMATION_MESSAGE);
		}
		else if((l == 0 && w > 0 ) || (l > 0 && w == 0 )){
			JOptionPane.showMessageDialog(null, "IT IS A LINE","RESULT", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(l == 0 && w == 0){
			JOptionPane.showMessageDialog(null, "IT IS A POINT","RESULT", JOptionPane.INFORMATION_MESSAGE);
		}
		else if(l < 0 && w < 0){
			JOptionPane.showMessageDialog(null, "INVALID LENGTH and WIDTH","RESULT",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}