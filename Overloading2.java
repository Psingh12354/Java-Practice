import java.lang.String;
class Muliply2{
	static int Multiply(int a,int b,int c)
	{
		return a*b*c;
	}
	static int Multiply(int a,int b)
	{
		return a*b;
	}
}
class Overloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Muliply2.Multiply(2,6,7));
		System.out.println(Muliply2.Multiply(2,5));

	}

}
