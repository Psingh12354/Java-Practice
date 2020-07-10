import java.util.*; 
import java.util.Scanner;
import java.lang.*; 
import java.lang.String;
class Intro{
	public void intro()
	{
	System.out.println("Java prorgram to add two number : ");
	}
}
class Input extends Intro{
	public void input()
	{
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println("Sum = "+c);
	}
}
class SumOutput extends Input{
	public void sumout(){
		System.out.println("Thanks for visiting ");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOutput ob=new SumOutput();
		ob.intro();
		ob.input();
		ob.sumout();

	}

}
