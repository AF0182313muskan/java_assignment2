package java_oops;

import java.util.Scanner;

public abstract class Abstract_mul_div {
	public void mul() {
		Scanner sc = new Scanner(System.in);
		int a , b,res;
		System.out.println("enter two no");
		a = sc.nextInt();
		b = sc.nextInt();
		res = a*b;
		System.out.println("The mul of two no is :"+res);
	}
	abstract public void div();

}
