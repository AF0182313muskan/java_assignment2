package Array_prog;

import java.util.Scanner;

public class array_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int temp,size,i;
       System.out.println("Enter the size");
       size = sc.nextInt();
       int []num=new int[size];
       System.out.println("Enter the numbers");
       for(i=0;i<size;i++) {
    	   num[i] = sc.nextInt();
       }
       temp = num[0];
       System.out.println("The number is : ");
       for(i=0;i<size;i++) {
    	   System.out.println(num[i]);
       }
       for(i=0;i<size;i++) {
    	   if(temp>num[i]) {
    		   temp = num[i];
    	   }
    	   
       }
       System.out.println("the smallest number is : "+temp);
	}

}
