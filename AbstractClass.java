/*Java Abstract Classes and Methods
Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class). Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).*/
import java.lang.String;
abstract class Base{
	abstract void fun();
}
class Derived extends Base{
	void fun()
	{
		System.out.println("Derived class ");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base ob=new Derived(); // to make a class abstract class call it by this way
		ob.fun();

	}

}
