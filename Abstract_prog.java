package java_oops;

import java.util.Scanner;

public abstract class Abstract_prog {
Scanner sc = new Scanner(System.in);
	public abstract void demo();
	public void stu_details() {
		String name;
		int roll_no,sum=0,i;
		char grade;
		float per;
		int marks[] = new int[5];
		System.out.println("Enter a student name : ");
		name = sc.next();
		System.out.println("Enter a student roll no : ");
		roll_no = sc.nextInt();
		System.out.println("Enter five subject marks : ");
		for(i=0;i<5;i++) {
			marks[i] = sc.nextInt();
			sum = sum+marks[i];
		}
	
	}
		
	
	
}
