/*It is used to achieve total abstraction. Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance . It is also used to achieve loose coupling. Interfaces are used to implement abstraction.
 * */
import java.lang.String;
import java.io.*;
interface In1 
{ 
    final int a = 10;
    void display(); 
} 
class InterFace implements In1 {
	public void display()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterFace ob=new InterFace();
		ob.display();
		System.out.println(a);
	}

}
