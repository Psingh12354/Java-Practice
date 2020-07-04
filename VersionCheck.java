import java.lang.String;
public class VersionCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nJava Version: "+System.getProperty("java.version"));
		System.out.println("\nJava Runtime Version :"+System.getProperty("java.runtime.version"));
		System.out.println("\nJava Home :"+System.getProperty("java.home"));
	    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
	    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
	    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
	}

}
