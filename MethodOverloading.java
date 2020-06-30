import java.lang.String;
public class MethodOverloading {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add(5,6));
		System.out.println(Add(5.64,54.44));
		System.out.println(Add("Hello","Priyanshu"));
	

	}
	public static int Add(int a,int b){
	return (a+b);	
	}
	/* Method overloading is the method of overloading 
	 * a function more than one but it must have diffrent
	 * data type.
	 */
	public static double Add(double a,double b){
		return (a+b);
	}
	public static String Add(String a,String b)
	{
		return (a+b);
	}

}
