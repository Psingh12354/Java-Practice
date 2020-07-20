import java.lang.String;
import java.util.Scanner;
public class Sorting {
	public static void main(String[] args) {
		int arr[] ={3,60,35,2,45,320,5};  
		System.out.println("Array element is : ");
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" , ");
		}
		System.out.println("");
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " , ");
		}
	}

}
