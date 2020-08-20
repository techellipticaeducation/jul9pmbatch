package oops;

import java.util.Scanner;

public class VarArges {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
//		int sum = calc.add(10, 20);
//		System.out.println(sum);
//		sum = calc.add(10, 20,67,30);
//		System.out.println(sum);
//		sum = calc.add(10, 20,67,30,57);
//		System.out.println(sum);
//		sum = calc.add(10);
//		System.out.println(sum);
		
//		int sum = calc.add(67,34,23,245,34);
//		System.out.println(sum);
		
//		sum = calc.add(10, 20,67,30,46,56,3,3,5,3);
//		System.out.println(sum);
		
		// i want a method which provide me sum of 5 values
		
		// varargs = var (various) + args (arguments) 
		
		// 2 rules
		 // you can give only varargs in param list
		//  varargs must be the last param in the parameter list
		
		// Scanner Classes
		//we can take input from console
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to my Calculator");
		while(true) {
			System.out.println("Enter Your First Number: ");
			int i = scan.nextInt();
			System.out.println("Enter Your Second Number: ");
			int j = scan.nextInt();
			int sum = calc.add(i,j);
			System.out.println("Sum is " + sum);
			System.out.println("Do you want to continue (Y/N): ");
			String str = scan.next();
			if(str.equals("N")) {
				break;
			}
		}
		System.out.println("Thank you for using calculator");
		
		
	}
	
}


class Calculator{
	
	public int add(int...ar ) {
		int sum = 0;
		for(int i = 0 ; i < ar.length ;i++) {
			sum = sum +ar[i];
		}
		return sum;
			
	}
	
//	
//	public int add(int i , int j) {
//		int z = i + j;
//		return z;
//	}
//	
//	
//	public int add(int i , int j, int k) {
//		int z = i + j + k;
//		return z;
//	}
//
//	public int add(int i , int j, int k, int y) {
//		int z = i + j + k + y;
//		return z;
//	}
//	public int add(int i , int j, int k, int y, int w) {
//		int z = i + j + k + y +w;
//		return z;
//	}

}
