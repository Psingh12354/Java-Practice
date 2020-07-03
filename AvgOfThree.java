import java.util.Scanner;
import java.lang.String;

public class AvgOfThree {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers one by one : ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		double Avg=(num1+num2+num3)/3;
		System.out.println("Avg of three is : "+Avg);
		
	}

}
