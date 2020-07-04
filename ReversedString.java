import java.util.Scanner;
import java.lang.String;
public class ReversedString {
	public static void main(String str) {
		// TODO Auto-generated method stub
		System.out.println("Program to reversed a string : ");
	    char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    System.out.println(rev);  
}
}