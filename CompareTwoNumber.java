import java.util.Scanner;
import java.lang.String;
public class CompareTwoNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of a and b : ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a>b)
		{
			System.out.println("a is greater than b : "+a);
		}
		else
		{
			System.out.println("b is greater : "+b);
		}

	}

}
