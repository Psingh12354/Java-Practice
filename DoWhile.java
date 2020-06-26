import java.util.Scanner;


public class DoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=scan.nextInt();
		do
		{
			System.out.println(a);
			a++;
		}
		while(a<=100);
	}

}
