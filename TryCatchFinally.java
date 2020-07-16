import java.lang.String;
import java.util.*;
public class TryCatchFinally {
/* finally is use when try catch is use work when exception occur but this method always occur
 *
 */public static int retInt()
 {	// you can overwrrite the value
	 	int a=100;
		try{
			a=a/0;
			return a;
		}
		catch(ArithmeticException e)
		{
			System.out.println("catched called");
			System.out.println(e);
			return a;
		}
		finally{
			// a=5000; it can overwrite your initial value also
			System.out.println("Finally called");// it does not work with System.exit(1);
		}
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(retInt());
	}

}
