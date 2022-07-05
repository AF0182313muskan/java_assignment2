package java_oops;

import java.util.Scanner;

public abstract class Abstract_demo {

	public void add() {
		Scanner sc = new Scanner(System.in);
		int a , b,res;
		System.out.println("Enter a no");
		 a = sc.nextInt();
		 b = sc.nextInt();
		 res = a+b;
		 System.out.println("The addition of two no is : "+res);
	}
	abstract public void sub();
}
