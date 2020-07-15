import java.lang.String;
import java.util.*;
public class HashSetInJava {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> names=new HashSet<String>();//() this is optional
		names.add("Mark");
		names.add("Priyanshu");
		names.add("Singh");
		names.add("Tom");
        Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}

}
