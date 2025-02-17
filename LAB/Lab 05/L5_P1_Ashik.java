import java.io.*;
import java.util.*;
import java.lang.*;
import javax.swing.*;
class L5_P1_Ashik
{
	public static void main(String[] args)
	{
		double area,perimeter,l,w;
		String length = JOptionPane.showInputDialog(null,"Enter the length: ","INPUT",JOptionPane.QUESTION_MESSAGE);
		l=Double.parseDouble(length);
		String width = JOptionPane.showInputDialog(null,"Enter the width: ","INPUT",JOptionPane.QUESTION_MESSAGE);
		w=Double.parseDouble(width);
		area=l*w;
		perimeter=2*(l+w);
		if(l>0 && w>0)
		{
			JOptionPane.showMessageDialog(null,"Area: "+area+" and Perimeter: "+perimeter+" ","RESULT",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(l==0 && w>0 || l>0 && w==0)
		{
			JOptionPane.showMessageDialog(null,"It is a line","RESULT",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(l==0 && w==0)
		{
			JOptionPane.showMessageDialog(null,"It is a point","RESULT",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(l<0 && w<0)
		{
			JOptionPane.showMessageDialog(null,"Invalid length and width","RESULT",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}