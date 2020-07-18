import java.util.Date;
import java.lang.String;
import java.text.*; // for different format
public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.toString());
		// Epoch time
		System.out.println(date.getTime());
		// get day
		System.out.println(date.getMonth()+1);
		System.out.println(date.getYear()+1900);
		System.out.println(date.getDay());
		System.out.println(date.getHours());
		System.out.println("\n");
		// In different format 
		// Simple data format search on google and go on oracle
		SimpleDateFormat sdf=new SimpleDateFormat("E yyyy/MM/dd \nHH-mm-s");
		System.out.println(sdf.format(date));
	}

}
