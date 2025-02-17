import java.lang.*;
import java.util.*;
import java.io.*;

class Icecream{
	String icecreamType;
	String icecreamCompany;
	double icecreamPrice;

	// constructor with no-args //NOTE: BHUJI NAI;
	Icecream(){}

	// constructor with args //NOTE: BHUJI NAI;

	Icecream(String icecreamType, String icecreamCompany, double icecreamPrice){
		this.icecreamType = icecreamType;
		this.icecreamCompany = icecreamCompany;
		this.icecreamPrice = icecreamPrice;
	}

public String toString(){
	return this.icecreamType + " " + this.icecreamCompany + " " + this.icecreamPrice;
}

public boolean equals(Icecream I){
	return (this.icecreamPrice == I.icecreamPrice)? true : false; //this.something = caller;
}
	public int compareTo(Icecream I){
		if(this.icecreamPrice > I.icecreamPrice)
		return 1;

		else if(this.icecreamPrice == I.icecreamPrice)
		return 0;

		else
		return -1;
	}
} //class ends

class L4P1T{
	public static void main(String[] args){
		Icecream obj1 = new Icecream();
		Icecream obj2 = new Icecream("Vanila","Igloo", 55.5);
		Icecream obj3 = new Icecream("Chocolate", "Za N Zee", 75.5);
		Icecream obj4 = new Icecream("Mango", "Iglo", 75.5);

		System.out.println(obj2.toString());
		System.out.println(obj3.toString());

		System.out.println(obj3.equals(obj4)); //true
		System.out.println(obj2.equals(obj3)); //false

		System.out.println(obj2.compareTo(obj4)); //1
	}
}