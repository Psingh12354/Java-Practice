import java.util.Scanner;


public class WhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=scan.nextInt();
		while(a<=100)
		{
			System.out.println(a);
			a++;
		}

	}

}
