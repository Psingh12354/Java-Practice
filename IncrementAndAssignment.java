
public class IncrementAndAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int x=10;
	x=x+1;
	int y=10;
	y+=1;
	int z=10;
	z++;
	int a=10;
	++a;
	int p=10;
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	System.out.println(a);
	System.out.println(p++);
	System.out.println(++p); // here you get twice increment +1 for previous +1 for current

	}

}
