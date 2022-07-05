package java_oops;

import java.util.Scanner;

public class Abstract_result extends Abstract_demo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_result  obj = new Abstract_result();
		obj.add();
		obj.sub();

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
