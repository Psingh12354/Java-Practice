import java.lang.String;
import java.util.Scanner;
public class CalcWhileLoop {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int tot;
		while(true)
		{
			System.out.println("Enter the value of a and b : ");
			int a=scan.nextInt();
			int b=scan.nextInt();
			System.out.println("Enter your choice : \n 1> Add \n 2> Subtract \n 3> Multiply \n 4> Divide\n 5> Quit!\n");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1: 
				tot=a+b;
				System.out.println("Add : "+tot);
				break;
			case 2:
				tot=a-b;
				System.out.println("Subtract : "+tot);
				break;
			case 3: 
				tot=a*b;
				System.out.println("Multiply : "+tot);
				break;
			case 4:
				tot=a/b;
				System.out.println("Divide : "+tot);
				break;
			case 5:
				   System.out.println("exit..."); 
				System.exit(0);

				break;
			default:
				System.out.println("Wrong Input");
			}
		}
		

	}

}
