import java.util.Scanner;
import java.lang.String;
public class PrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range : ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				sum=+i;
			}
		}
		System.out.println("Sum of total prime is : "+sum);
	}

}
