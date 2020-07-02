import java.util.Scanner;
import java.lang.String;
public class SumArray {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number one by one to increment : ");
		int sum=scan.nextInt();
		for(int i=0;i<=10;i++)
		{	
			sum+=i;
		}
		System.out.println("Sum = "+sum);
	}

}
