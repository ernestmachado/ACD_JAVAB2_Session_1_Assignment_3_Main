package ASSIGNMENTS;

public class Assignment1_3 {
//Write a program that swaps the values of two variables without using third variable 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		int b=20;
		
		System.out.println("Before swapping 	: a="+a+" and b="+b);

		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping 		: a="+a+" and b="+b);
	}

}
