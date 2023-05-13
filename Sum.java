//Addition subtraction product and division of two numbers

import java.util.*;
class Sum{
	public static void main(String args[]){

		int n1,n2,add,sub,mul,div;
		System.out.println("Enter two numbers: ");

		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();

		add=n1+n2;
		sub=n1-n2;
		mul=n1*n2;
		div=n1/n2;

		System.out.println("The sum is : "+add);
		System.out.println("The difference is : "+sub);
		System.out.println("The product is : "+mul);
		System.out.println("The division is : "+div);


}

}
