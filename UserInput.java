
import java.util.*;
public class UserInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// To take input from user use this command
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter some numbers");
		int a=scan.nextInt();
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter some double");
		double b=scan1.nextDouble();
		Scanner scan2=new Scanner(System.in);
		System.out.println("Enter some string");
		String c=scan2.nextLine();
		System.out.println("The entered int value is : "+a);
		System.out.println("The entered double value is : "+b);
		System.out.println("The entered string is : "+c);
	}

}
