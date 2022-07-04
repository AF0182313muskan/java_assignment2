package java_prog1;

import java.util.Scanner;

public class Overloading_result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accept();

	}
	public static void accept() {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("The process of reverse number ");
		System.out.println("Enter a number");
		num1 = sc.nextInt();
		Method_overloading obj = new Method_overloading();
		obj.poly(num1);
		System.out.println("The process of Swapping of number");
		System.out.println("Enter two number");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		obj.poly(num1,num2);
		System.out.println("The process of Greater of three number");
		System.out.println("Enter three number");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		obj.poly(num1,num2,num3);
	}

}
