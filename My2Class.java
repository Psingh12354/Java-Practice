import java.lang.String;
public class My2Class {

	public My2Class() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentClass mark=new StudentClass();
		mark.id=1;
		mark.name="Mark";
		mark.age=15;
		System.out.println(mark.name+" is "+mark.age+" year old.");
		StudentClass tom=new StudentClass();
		tom.id=2;
		tom.name="Tom";
		tom.age=15;
		System.out.println(tom.name+" is "+tom.age+" year old.");
		StudentClass PK=new StudentClass();
		PK.setId(3);
		PK.setName("PK");
		PK.setAge(20);
		System.out.println(PK.getName()+" is "+PK.getAge()+" year old.");
	}

}
/* THis program run with StudentClass it will not run single so please run both program at same time*/
