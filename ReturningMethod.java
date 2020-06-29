import java.lang.String;
import java.util.*;
public class ReturningMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello("Prihanshu");
		Scanner scan=new Scanner(System.in);
		/*int x=scan.nextInt();
		int y=scan.nextInt();
		System.out.println("Enter the value of x and y : ");
		int sum=Add(x,y);
		System.out.println(sum); //this method use when we use return statement in function
		*/
		Add(5,6);
		Multiply(5,6);
		Divide(10,5);
		Subtract(10,5);

	}
	public static void sayHello(String name)
	{
		System.out.println("Hello "+ name + " how are you");
	}
	public static void Add(int a,int b) // use int in place of void when you return a number
	{
		System.out.println("a+b = "+a+b);
		//return (a+b);
	}
	public static void Multiply(int a,int b)
	{
		System.out.println("a*b = "+a*b);
	}
	public static void Divide(int a,int b)
	{
		System.out.println("a/b = "+a/b);
	}
	public static void Subtract(int a,int b)
	{
		System.out.println("a-b = "+(a-b));
	}
}
