import java.util.Scanner;
import java.lang.String;
import java.math.*;
public class Hexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to find area of hexagon : ");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the side : ");
		double s=scan.nextDouble();
		double area=6*(s*s)/(4*Math.tan(Math.PI/6));
		System.out.println("Area of Hexagon : "+area);\
		
	}

}
