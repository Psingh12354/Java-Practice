import java.util.Arrays;
import java.lang.String;
public class ArrayLargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={20, 30, 40};
		System.out.println("Original Array: "+Arrays.toString(arr));
		int max=arr[0];
		if(arr[2]>=max)
			max=arr[2];
		System.out.println("Largest value in array : "+max);
	}

}
