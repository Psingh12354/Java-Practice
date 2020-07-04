import java.util.Scanner;
import java.lang.String;
public class SumOfDigitsOfInteger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=scan.nextInt();
		int sum=0;
		while(a!=0)
		{
			sum+=a%10;
			a/=10;
		}
		System.out.println("Sum = "+sum);
	}

}
