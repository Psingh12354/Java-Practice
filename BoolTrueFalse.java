import java.lang.String;
import java.util.Scanner;
public class BoolTrueFalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();

		if(a+b>b+c)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
