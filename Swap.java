import java.util.Scanner;
import java.lang.String;

public class Swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers to swap : ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Swap of num 1 = "+num1+" and num 2 = "+num2);

	}

}
