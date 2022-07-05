package java_oops;

import java.util.Scanner;

public class Inf_implement implements Inf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inf_implement obj = new Inf_implement();
		obj.add();
		obj.sub();
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a , b,res;
		System.out.println("Enter a no");
		 a = sc.nextInt();
		 b = sc.nextInt();
		 res = a+b;
		 System.out.println("The addition of two no is : "+res);
	}
		
	

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1,n2,res;
		System.out.println("Enter a number");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		res = n1-n2;
		System.out.println("The sub is : "+res);
		
	}
	}


