import java.util.*;
import java.lang.String;
public class NumberOfEvenOrOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,4,5,6,4,3,6,756,54,34,23,34,5,6,7,4,5,76,5,4,1};
		int sumEven=0,sumOdd=0;
		System.out.println("Program to count number of even or odd : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0){
				sumEven++;
			}
			else
			{
				sumOdd++;
			}
		}
		System.out.println("Even number is : "+sumEven);
		System.out.println("Odd number is : "+sumOdd);
	}

}
