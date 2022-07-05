package java_oops;

import java.util.Scanner;

public class Abstract_m_d_result extends Abstract_mul_div{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract_m_d_result obj = new Abstract_m_d_result();
		obj.mul();
		obj.div();
		

	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a , b,res;
		System.out.println("enter two no");
		a = sc.nextInt();
		b = sc.nextInt();
		res = a/b;
		System.out.println("The div of two no is :"+res);
	}
	}


