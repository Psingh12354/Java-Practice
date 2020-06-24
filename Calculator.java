
import java.util.*;
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan2=new Scanner(System.in);
		System.out.println("Press \n 1> Add \n 2> Subtractionn \n 3> Multiply \n 4> Divide ");
		int select=scan2.nextInt();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number : ");
		double a=scan.nextDouble();
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter second number : ");
		double b=scan1.nextDouble();
		
		System.out.println("The entered int value is : "+a);
		System.out.println("The entered double value is : "+b);
		double Operation;
		
		switch(select){
		case 1:
			Operation=a+b;
			System.out.println("Add = "+Operation);
			break;
		case 2:
			Operation=a-b;
			System.out.println("Subtract = "+Operation);
			break;
		case 3:
			Operation=a*b;
			System.out.println("Multiply = "+Operation);
			break;
		case 4:
			Operation=a/b;
			System.out.println("Divide = "+Operation);
			break;
		default:
			System.out.println("Wrong Inpiut!");
		}

	}

}
