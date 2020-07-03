import java.lang.String;
import java.util.Scanner;
public class MultilicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number for multiplication table");
		int num=scan.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}

	}

}
