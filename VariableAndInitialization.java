import java.util.*;
class VariableAndInitialization{
	public static void main(String args[]){
	
		float a=1.9f;
		boolean b= false;
		int age= 22;
		String city = "Pune";


		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("Age = "+age);
		System.out.println("City = "+city);

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any value");
		int value = sc.nextInt();
		System.out.println("entered value is = "+value);
}
}