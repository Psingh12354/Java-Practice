import java.util.*;
import java.lang.String;
class one{
	public void print()
	{
		System.out.println("Hello");
	}
}
class two extends one{
	public void print1()
	{
		System.out.println("Priyanshu");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		two ob=new two();
		ob.print();
		ob.print1();

	}

}
