import java.util.Scanner;
import java.lang.String;
public class DivisibleBy2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range : \n");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("Enter the two number which divides : ");
		int x1=scan.nextInt();
		int x2=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%x1!=0 && i%x2!=0)
			{
				System.out.println("Divisible number is : "+i);
			}
			else
			{
				System.out.println("Not divisible number is : "+i);
			}
		}
	}

}
