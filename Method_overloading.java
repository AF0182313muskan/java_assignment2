//wap to using polymorphism method overloading 

package java_prog1;

public class Method_overloading {

	public void poly(int num) {
		int sum=0,r;
		while(num>0) {
			r=num%10;
			sum = sum*10+r;
			num = num/10;
		}
		System.out.println("Reverse number : "+sum);
	}
	public void poly(int n1,int n2) {
		System.out.println("Before Swapping: n1= "+n1+" and n2= "+n2);
		int n3;
		n3 = n1 ;
		n1 = n2 ;
		n2 = n3 ;
		System.out.println("After Swapping: n1= "+n1+" and n2= "+n2);
	}
	public void poly(int n1, int n2, int n3) {
		if(n1>n2 && n1>n3) {
			System.out.println(n1+ " is greater than other no");
		}
		else if(n2>n1 && n2>n3) {
			System.out.println(n2+ " is greater than other no");
		}
		else {
			System.out.println(n3+ " is greater than other no");
		}
	}
}
