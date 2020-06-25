import java.util.Scanner;


public class IfElse {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java program to make a voting system : ");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age :");
		int age=scan.nextInt();
		if(age>=18){
			System.out.println("Yor are able to vote  ");
		}
		else{
			System.out.println("You are a kid");
		}
		
	}

}
