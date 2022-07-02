package Encapsulation_prog;

import java.util.Scanner;

public class Encaps_result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long phone_no;
		String name;
		System.out.println("Enter your name : ");
		name = sc.next();
		System.out.println("Enter your phone number : ");
		phone_no = sc.nextLong();
		int deposit ;
		System.out.println("Enter your amount to be deposited : ");
		deposit = sc.nextInt();
		Encaps1 obj = new Encaps1();
		int account_no;
		System.out.println("Enter your account number : ");
		account_no = sc.nextInt();
		obj.set_bal(deposit);
		System.out.println("Final amount is: " +obj.get_bal());
		int withdrwal;
		System.out.println("Enter withdrawal amount : ");
		withdrwal = sc.nextInt();
		obj.set_withdrawal(withdrwal);
		System.out.println("Final amount is: "+obj.get_withdrawal());

	}

}
