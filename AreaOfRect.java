import java.util.*;
class AreaOfRect{
	public static void main(String args[]){

		double l,b,area,peri;
		System.out.println("Enter Length & Width: ");

		Scanner sc=new Scanner(System.in);
		l=sc.nextDouble();
		b=sc.nextDouble();

		area=l*b;
		peri= 2*(l+b);

		System.out.println("The area is : "+area);
		System.out.println("The difference is : "+peri);
	


}

}
