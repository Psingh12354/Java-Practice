import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.String;
public class CreateTextFile {
	public static void main(String[] args) {
	try {
	File file=new File("filename.txt");
	if(!file.exists())
	{
			file.createNewFile();
	} 
	PrintWriter pw=new PrintWriter(file);
	pw.println("Hello my name is Priyanshu Singh");
	pw.println(10000);
	pw.close();
	System.out.println("Done");
	}
	
	catch (IOException e) {
			e.printStackTrace();
		}
	}

	}


