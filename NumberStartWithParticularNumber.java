import java.lang.String;
import  java.util.*;
import java.io.*;
public class NumberStartWithParticularNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,43,43,56,4,10,34,54,11,123,4345,12,65,431,132,132,321};
		int sum=0,sum1=0;
		System.out.println("Program too check the number in array start with particular number or not : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].startsWith(1) && arr[i].endsWith(1))
			{
				sum++;
			}
			else
			{
				sum1++;
			}
		}
System.out.println("Number starts with 1 and ends with 1 are = "+sum);
System.out.println("Number does not start with are = "+sum1);
	}

}
