//use this code on online compiler
import java.lang.String;
import java.util.*;
import java.util.ArrayList;
/* public boolean hasNext();
 * public Object next();
 * public boolean hasPrevious();
 * public Object previous();
 */
public class ListIterator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("Mark");
		names.add("Priyanshu");
		names.add("Singh");
		names.add("Tom");
		ListIterator<String> itr=names.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\n");
		while(itr.hasPrevious())
			System.out.println(itr.previous());
		System.out.println("\n");
		
	}

}
