import java.lang.String;
class A1{
	int sum(int a,int b)
	{
		return a+b;
	}
}
class B1 extends A1{
	double sum(double a,double b)
	{
		return a+b;
	}
}
public class OverRiding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 ob=new A1();
		System.out.println(ob.sum(5,7));
		B1 ob1=new B1();
		System.out.println(ob1.sum(5.6, 6.7));
	}

}
